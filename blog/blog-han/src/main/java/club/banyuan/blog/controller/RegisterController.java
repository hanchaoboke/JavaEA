package club.banyuan.blog.controller;

import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.MailService;
import club.banyuan.blog.service.RedisService;
import club.banyuan.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

/**
 * @author HanChao
 * @date 2020-05-28 09:06
 * 描述信息：
 */
@Controller
public class RegisterController {

    @Autowired
    private UserService userService;
    @Autowired
    private MailService mailService;
    @Autowired
    private RedisService redisService;

    @GetMapping("/register")
    public String showRegister() {
        return "register";
    }

    @PostMapping("/register")
    public String register (@RequestParam(value = "email") String email,
                            @RequestParam(value = "name") String username,
                            @RequestParam(value = "password") String password) {

        User user = userService.findByName(username);

        if (user != null) {
            return "login";
        }

        userService.addUser(email,username,password);

        String token =String.valueOf(new Random().nextInt(900) + 100);

        redisService.testRedis(username,token);
        mailService.sendTestMail(email,"http://localhost:8090/activated?user="+username+"&token="+token);

        return "redirect:/login";

    }
}
