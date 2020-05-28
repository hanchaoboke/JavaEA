package club.banyuan.blog.controller;

import club.banyuan.blog.service.RedisService;
import club.banyuan.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HanChao
 * @date 2020-05-28 11:36
 * 描述信息：
 */
@Controller
public class ActivatedController {
    @Autowired
    private RedisService redisService;

    @Autowired
    private UserService userService;

    @GetMapping("/activated")
    public String activted (@RequestParam(value = "user") String username,
                            @RequestParam(value = "token") String token) {
        String activatedToken = redisService.getValueRedis(username);

        if (!token.equals(activatedToken)) {
            return "验证邮件超时或其他错误，请注册";
        }

        userService.updateActivated(username);

        return "login";
    }
}
