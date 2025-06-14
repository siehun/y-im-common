package io.yue.im.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * session信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IMSessionInfo {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 终端类型
     */
    private Integer terminal;
}
