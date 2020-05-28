package club.banyuan.blog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author HanChao
 * @date 2020-05-27 18:57
 * 描述信息：
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void testRedis (String username,String token){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(username,token,10,TimeUnit.MINUTES);

        logger.info(valueOperations.get(username));
//        ListOperations<String,String> listOperations = redisTemplate.opsForList();
//        listOperations.leftPush("b","1");
//        listOperations.leftPush("b","2");
    }

    public String getValueRedis (String username) {
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(username);
    }
}
