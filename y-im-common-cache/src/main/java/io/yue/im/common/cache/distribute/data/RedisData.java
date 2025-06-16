package io.yue.im.common.cache.distribute.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description 缓存到Redis中的数据，主要配合使用数据的逻辑过期
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RedisData {
    //实际业务数据
    private Object data;
    //过期时间点
    private LocalDateTime expireTime;
}
