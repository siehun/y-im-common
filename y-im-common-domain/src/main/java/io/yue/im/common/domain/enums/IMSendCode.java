package io.yue.im.common.domain.enums;

/**
 * 发送编码
 */
public enum IMSendCode {

    SUCCESS(0, "发送成功"),
    NOT_ONLINE(1, "对方不在线"),
    NOT_FIND_CHANNEL(2, "未找到对方的channel"),
    UNKOWN_ERROR(9999, "位置异常");

    private final Integer code;
    private final String desc;

    IMSendCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public Integer code() {
        return this.code;
    }
}
