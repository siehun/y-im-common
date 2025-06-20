package io.yue.im.common.cache.time;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @description 高效系统时钟工具类，主要用于 缓存当前时间戳，
 * 避免频繁调用 System.currentTimeMillis() 带来的性能损耗（尤其在超高并发场景下）
 */
public class SystemClock {

    // 知识点：System.currentTimeMillis() 是 native 方法，
    // 在高并发下频繁调用可能导致性能下降（如 Linux 系统需切换内核态）
    // 解决方案：
    // 启动一个后台线程，按固定间隔（precision）更新缓存的时间戳，外部调用直接读取缓存值。
    private static final String THREAD_NAME = "system.clock";
    private static final SystemClock MILLIS_CLOCK = new SystemClock(1);
    private final long precision;
    private final AtomicLong now;

    private SystemClock(long precision) {
        this.precision = precision;
        now = new AtomicLong(System.currentTimeMillis());
        scheduleClockUpdating();
    }

    public static SystemClock millisClock() {
        return MILLIS_CLOCK;
    }

    private void scheduleClockUpdating() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor(runnable -> {
            Thread thread = new Thread(runnable, THREAD_NAME);
            thread.setDaemon(true); // 设置为守护线程 ,避免阻止 JVM 退出
            return thread;
        });
        // 使用 ScheduledExecutorService 定时更新 now 的值
        // 每 precision 毫秒更新一次时间戳（此处为1ms）
        scheduler.scheduleAtFixedRate(() ->
                now.set(System.currentTimeMillis()), precision, precision, TimeUnit.MILLISECONDS);
    }

    // 直接读取缓存值
    public long now() {
        return now.get();
    }
}
