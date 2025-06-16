package io.yue.im.common.cache.model.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class IMCommonCache implements Serializable {
    private static final long serialVersionUID = -923883598593413495L;
    /**
     * 缓存数据是否存在
     */
    protected boolean exist;
    /**
     * 缓存版本号
     */
    protected Long version;
    /**
     * 稍后再试
     */
    protected boolean retryLater;
}
