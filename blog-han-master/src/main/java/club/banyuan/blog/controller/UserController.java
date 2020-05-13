package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import club.banyuan.blog.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private  UserService userService;

    @Autowired
    private BlogService blogService;
//    @GetMapping("/user/{username:[0-9a-z_]+}")
//    @ResponseBody
//    public User showUser(@PathVariable String username){
//        UserService userService = new UserService();
//        //return userService.findByName(username);
//    }
//
    @GetMapping("/blogger/{username:[0-9a-z_]+}")
    // @ResponseBody
    public String showBlogs(@PathVariable String username,
                            @RequestParam(defaultValue = "1",required = false) Integer page,
                            @RequestParam(defaultValue = "10",required = false) Integer size,
                            Model model){
        User user = userService.findUserByName(username);
        PageInfo pageInfo = blogService.findBlogs(user,page,size);
        model.addAttribute("user",user);
        model.addAttribute("blogs",pageInfo);
        return "list";



//        BlogService blogService = new BlogService();
//        List<Blog> list = new ArrayList<>();
//        if (page <= 0 || size <= 0) {
//            page = 1;
//            size = 10;
//        }
//
//        List<Blog> totalList = blogService.findBlogs(new UserService().findByName(username));
//
//        if ((page - 1) * size + size > totalList.size()) {
//            page = 1;
//            size = 10;
//        }
//
//        int totalSize = totalList.size();
//
//        int begin = (page - 1) * size;
//        // end = page * size - 1
//        int end = begin + size - 1;
//
//        if (begin > totalSize) {
//            // show last page
//        } else if (end > totalSize) {
//
//        }
//
//        list = totalList.subList(begin,end);
//
//
//
////        int endSize = 0;
////        if (blogService.findBlogs(new UserService().findByName(username)).size() % size != 0) {
////            endSize = blogService.findBlogs(new UserService().findByName(username)).size() % size;
////        }
////
////        for (int i = (page - 1) * size; i < (page - 1) * size + size; i++) {
////            list.add(blogService.findBlogs(new UserService().findByName(username)).get(i));
////        }
//        return list;
    }
}
