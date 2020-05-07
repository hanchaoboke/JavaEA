package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import club.banyuan.blog.service.UserService;
import org.springframework.boot.autoconfigure.data.web.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HanChao
 * @date 2020-05-07 16:50
 * 描述信息：
 */
@Controller
public class UserController {
    @GetMapping("/user/{username:[0-9a-z_]+}")
    @ResponseBody
    public User showUser(@PathVariable String username){
        UserService userService = new UserService();
        return userService.findByName(username);
    }

    @GetMapping("/user/blogs/{username:[0-9a-z_]+}")
    @ResponseBody
    public List<Blog> showBlogs(@PathVariable String username,
                                @RequestParam(defaultValue = "1",required = false) Integer page,
                                @RequestParam(defaultValue = "10",required = false) Integer size){
        BlogService blogService = new BlogService();
        List<Blog> list = new ArrayList<>();
        if (page <= 0 || size <= 0) {
            page = 1;
            size = 10;
        }
        if ((page - 1) * 10 + size > blogService.findBlogs(new UserService().findByName(username)).size()) {
            page = 10;
            size = 10;
        }
        UserService userService = new UserService();
        for (int i = (page - 1) * 10; i < (page - 1) * 10 + size; i++) {
            list.add(blogService.findBlogs(new UserService().findByName(username)).get(i));
        }
        return list;
    }
}
