package io.yue.im.common.cache.lock;

import java.util.concurrent.TimeUnit;

/**
 * @description 分布式锁接口
 */
public interface DistributedLock {

    boolean tryLock(long waitTime, long leaseTime, TimeUnit unit) throws InterruptedException;

    boolean tryLock(long waitTime,  TimeUnit unit) throws InterruptedException;

    boolean tryLock() throws InterruptedException;

    void lock(long leaseTime, TimeUnit unit);

    void unlock();

    boolean isLocked();

    boolean isHeldByThread(long threadId);

    boolean isHeldByCurrentThread();
}
