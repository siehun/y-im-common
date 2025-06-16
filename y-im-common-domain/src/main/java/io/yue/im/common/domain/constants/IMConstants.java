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
     * ===========================Rocket相关的常量==============================
     */

    /**
     * 消息的key
     */
    public static final String MSG_KEY = "message";

    /**
     * 未读私聊消息队列
     */
    public final static String IM_MESSAGE_PRIVATE_QUEUE = "im_message_private";

    /**
     * 未读私聊消息空队列
     */
    public final static String IM_MESSAGE_PRIVATE_NULL_QUEUE = "im_null_private";

    /**
     * 监听私聊消息消费分组
     */
    public final static String IM_MESSAGE_PRIVATE_CONSUMER_GROUP = "im_message_private_consumer_group";
    /**
     * 未读群聊消息队列
     */
    public final static String IM_MESSAGE_GROUP_QUEUE = "im_message_group";

    /**
     * 未读群聊消息空队列
     */
    public final static String IM_MESSAGE_GROUP_NULL_QUEUE = "im_null_group";

    /**
     * 监听群聊消息消费分组
     */
    public final static String IM_MESSAGE_GROUP_CONSUMER_GROUP = "im_message_group_consumer_group";
    /**
     * 私聊消息发送结果队列
     */
    public final static String IM_RESULT_PRIVATE_QUEUE = "im_result_private";
    /**
     * 私聊消息结果消费分组
     */
    public final static String IM_RESULT_PRIVATE_CONSUMER_GROUP = "im_result_private_consumer_group";
    /**
     * 群聊消息发送结果队列
     */
    public final static String IM_RESULT_GROUP_QUEUE = "im_result_group";

    /**
     * 群聊消息结果消费分组
     */
    public final static String IM_RESULT_GROUP_CONSUMER_GROUP = "im_result_group_consumer_group";


}
