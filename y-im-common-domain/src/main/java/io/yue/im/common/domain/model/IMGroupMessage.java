package io.yue.im.common.domain.model;

import io.yue.im.common.domain.enums.IMTerminalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

/**
 * 群信息
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMGroupMessage<T> {

    /**
     * 发信息的用户
     */
    private IMUserInfo sender;

    /**
     * 接收者id集合(群成员列表，为空不会推送)
     */
    private List<Long> receiveIds = new LinkedList<>();

    /**
     * 终端类型
     */
    private List<Integer> receiveTerminals = IMTerminalType.codes();

    /**
     * 是否发送给自己的其他终端, 默认为true
     */
    private Boolean sendToSelf = true;

    /**
     * 是否需要回推发送结果, 默认为true
     */
    public Boolean sendResult = true;

    /**
     * 消息内容
     */
    private T data;


}
