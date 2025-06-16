package io.yue.im.common.domain.constants;

/**
 * IM相关的常量类
 */
public class IMConstants {
    /**
     * =================分隔符相关==========================
     */

    /**
     * 用户id分隔符
     */
    public static final String USER_ID_SPLIT = ",";

    /**
     * Redis Key的分隔符
     */
    public static final String REDIS_KEY_SPLIT = ":";

    /**
     * 发送消息的key
     */
    public static final String MESSAGE_KEY_SPLIT = "_";

    /**
     * =====================基本信息相关===========================================
     */

    /**
     * 在线状态过期时间，默认10分钟
     */
    public static final long ONLINE_TIMEOUT_SECONDS = 600;

    /**
     * 消息允许撤回时间，默认5分钟
     */
    public static final long ALL_RECALL_SECONDS = 300;


    /**
     * 消息的key
     */
    public static final String MSG_KEY = "message";

}
