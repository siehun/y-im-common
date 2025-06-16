package io.yue.im.common.mq;

import io.yue.im.common.domain.model.TopicMessage;
import org.apache.rocketmq.client.producer.TransactionSendResult;

public interface MessageSenderService {
    /**
     * 发送普通消息
     * @param message
     * @return
     */
    boolean send(TopicMessage message);

    /**
     * 发送事务消息
     * @param message
     * @param arg
     * @return
     */
    default TransactionSendResult sendMessageInTransaction(TopicMessage message, Object arg) {return null;}
}
