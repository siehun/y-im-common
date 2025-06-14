package io.yue.im.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发送信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IMSendInfo<T> {
    /**
     * IMCType命令类型
     */
    private Integer cmd;
    /**
     * 推送信息的数据
     */
    private T data;
}
