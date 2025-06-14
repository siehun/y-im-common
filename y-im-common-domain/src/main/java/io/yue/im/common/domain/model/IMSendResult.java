package io.yue.im.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 发送信息的结果
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMSendResult<T> extends TopicMessage{
    private static final long serialVersionUID = -1235468585098257903L;
    /**
     * 发送信息的用户
     */
    private IMUserInfo sender;
    /**
     * 接收信息的用户
     */
    private IMUserInfo receiver;
    /**
     * 发送状态
     */
    private Integer code;
    /**
     * 消息内容
     */
    private T data;
}
