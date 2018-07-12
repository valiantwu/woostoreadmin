package org.woo.persist.dao;

/**
 * Created by Administrator on 2017/6/10.
 */
public interface IRedisDao {
    void remove(String... keys);

    void removePattern(String pattern);

    void remove(String key);

    boolean exists(String key);

    Object get(String key);

    boolean set(String key, Object value);

    boolean set(String key, Object value, Long expireTime);
}
