package io.yue.im.common.cache.md5;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.message.Message;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 将输入字符串转换为 MD5 格式的哈希值
 */
@Slf4j
public class MD5Hash {
    public static String md5Java(String message) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();
        } catch (UnsupportedEncodingException ex) {
            log.info("hash not support encoding");
        } catch (NoSuchAlgorithmException ex) {
            log.info("hash not such algorithm");
        }
        return digest;
    }
}
