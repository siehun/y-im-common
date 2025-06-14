package io.yue.im.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 接收到的信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IMReceiveInfo extends TopicMessage{
    /**
     * IMCmdType命令类型
     */
    private Integer cmd;
    /**
     * 发送信息的用户
     */
    private IMUserInfo sender;
    /**
     * 接收信息的用户列表
     */
    private List<IMUserInfo> receivers;
    /**
     * 是否回调发送结果
     */
    private Boolean sendResult;
    /**
     * 推送消息体
     */
    private Object data;

}
