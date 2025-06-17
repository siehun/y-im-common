package io.yue.im.common.cache.lock.factory;


import io.yue.im.common.cache.lock.DistributedLock;

/**
 * @description 分布式锁工程接口
 */
public interface DistributedLockFactory {

    /**
     * 根据key获取分布式锁
     */
    DistributedLock getDistributedLock(String key);
}
