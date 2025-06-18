package io.yue.im.common.mq.event.local;

import com.alibaba.cola.event.EventBusI;
import io.yue.im.common.domain.model.TopicMessage;
import io.yue.im.common.mq.event.MessageEventSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @description 本地消息发送
 */
@Component
@ConditionalOnProperty(name = "message.mq.event.type", havingValue = "cola")
public class LocalMessageEventSenderService implements MessageEventSenderService {
    @Autowired
    private EventBusI eventBus;

    @Override
    public boolean send(TopicMessage message) {
        eventBus.fire(message);
        return true;
    }
}
