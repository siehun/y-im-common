package io.yue.im.common.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 登录信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IMLoginInfo {
    private String accessToken;
}
