package io.yue.im.common.domain.model;

import com.alibaba.cola.event.DomainEventI;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基础信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicMessage implements DomainEventI {
    /**
     * 消息目的地 消息主题
     */
    private String destination;
}
