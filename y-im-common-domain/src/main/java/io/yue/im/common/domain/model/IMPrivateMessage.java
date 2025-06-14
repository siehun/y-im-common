package io.yue.im.common.domain.model;

import io.yue.im.common.domain.enums.IMTerminalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 私聊信息
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMPrivateMessage<T> {
    /**
     * 发信息的用户
     */
    private IMUserInfo sender;

    /**
     * 接收信息的用户id
     */
    private Long receiveId;

    /**
     * 接受者终端类型
     */
    private List<Integer> receiveTerminals = IMTerminalType.codes();

    /**
     * 是否发送给自己的其他终端
     */
    private Boolean sendToSelf = true;
    /**
     * 是否回推发送消息
     */
    private Boolean sendResult = true;
    /**
     * 消息内容
     */
    private T data;
}
