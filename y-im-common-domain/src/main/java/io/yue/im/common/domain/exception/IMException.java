package io.yue.im.common.domain.exception;

import lombok.Data;

/**
 * 自定义异常
 */
@Data
public class IMException extends RuntimeException{
    private Integer code;
    public IMException(String message) {
        super(message);
    }
    public IMException(Integer code, String message) {
        super(message);
        this.code= code;
    }
}
