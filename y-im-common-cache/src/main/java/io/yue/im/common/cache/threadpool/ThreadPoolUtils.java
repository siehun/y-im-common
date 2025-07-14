package io.yue.im.common.cache.threadpool;

import java.util.concurrent.*;

/**
 * 线程工具类
 */
public class ThreadPoolUtils {

    // 全局共享线程池
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(16, 16, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<>(4096), new ThreadPoolExecutor.CallerRunsPolicy());

    // 通过静态方法 execute() 提交runnable任务
    public static void execute(Runnable command) {
        executor.execute(command);
    }

    // submit() 提交callable任务
    public static <T> Future<T> submit(Callable<T> task) {
        return executor.submit(task);
    }

    // 提供 shutdown() 方法关闭线程池。
    public static void shutdown() {
        if (executor != null) {
            executor.shutdown();
        }
    }
}
