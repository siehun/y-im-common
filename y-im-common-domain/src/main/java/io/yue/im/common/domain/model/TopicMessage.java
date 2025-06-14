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
    private String destination;
}
