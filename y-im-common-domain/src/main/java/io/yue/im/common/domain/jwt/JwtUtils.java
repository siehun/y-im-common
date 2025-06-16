package io.yue.im.common.domain.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;

import java.util.Date;

/**
 * jwt工具类
 */
public class JwtUtils {
    /**
     * 生成jwt字符串
     * @param userId 用户ID
     * @param info  用户信息
     * @param exprieIn 过期时间
     * @param secret  秘钥
     * @return
     */
    public static String sign(Long userId, String info, long exprieIn, String secret) {

        try {
            Date date = new Date(System.currentTimeMillis() + exprieIn * 1000);
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withAudience(userId.toString())
                    .withClaim("info", info)
                    .withExpiresAt(date)
                    .sign(algorithm);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 根据token获取用户登录数据
     * @param token 用户登录token
     * @return
     */
    public static Long getUserId(String token) {
        try {
            String userId = JWT.decode(token).getAudience().get(0);
            return Long.parseLong(userId);
        } catch (JWTDecodeException e) {
            return null;
        }
    }
    /**
     * 根据token获取用户数据
     * @param token 用户登录token
     * @return 用户数据
     */
    public static String getInfo(String token) {
        try {
            return JWT.decode(token).getClaim("info").asString();
        }catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * token校验
     * @param token 登录toekn
     * @param secret 秘钥
     * @return
     */
    public static Boolean checkSign(String token, String secret) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).build();
            verifier.verify(token);
            return true;
        } catch (JWTDecodeException e) {
            return false;
        }
    }
}
