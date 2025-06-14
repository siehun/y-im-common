package io.yue.im.common.domain.event;

import io.yue.im.common.domain.model.TopicMessage;
import lombok.Data;

@Data
public class IMBaseEvent extends TopicMessage {

    private Long id;

    public IMBaseEvent() {

    }
    public IMBaseEvent(Long id, String destination) {
        super(destination);
        this.id = id;
    }
}
