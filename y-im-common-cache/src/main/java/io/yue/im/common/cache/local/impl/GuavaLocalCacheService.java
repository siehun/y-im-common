package io.yue.im.common.cache.local.impl;

import com.google.common.cache.Cache;
import io.yue.im.common.cache.local.LocalCacheService;
import io.yue.im.common.cache.local.factoty.LocalGuavaCacheFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description 基于Guava实现的本地缓存
 */
@Component
@ConditionalOnProperty(name = "local.cache.type", havingValue = "guava")
public class GuavaLocalCacheService<K, V> implements LocalCacheService<K, V> {
    //本地缓存，基于Guava实现
    private final Cache<K, V> cache = LocalGuavaCacheFactory.getLocalCache();

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public V getIfPresent(Object key) {
        return cache.getIfPresent(key);
    }

    @Override
    public void remove(K key) {
        cache.invalidate(key);
    }
}
