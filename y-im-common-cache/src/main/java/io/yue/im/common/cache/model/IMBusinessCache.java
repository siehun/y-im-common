package io.yue.im.common.cache.model;

import io.yue.im.common.cache.model.base.IMCommonCache;
import lombok.Data;

@Data
public class IMBusinessCache<T> extends IMCommonCache {
    private T data;
    public IMBusinessCache<T> with(T data) {
        this.data = data;
        this.exist = true;
        return this;
    }
    public IMBusinessCache<T> withVersion(Long version) {
        this.version = version;
        return this;
    }
    public IMBusinessCache<T> retryLater() {
        this.retryLater = true;
        return this;
    }
    public IMBusinessCache<T> noExist() {
        this.exist = false;
        this.version = -1l;
        return this;
    }

}
