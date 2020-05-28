package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.exception.NotFoundException;
import club.banyuan.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;

/**
 * @author HanChao
 * @date 2020-05-12 16:25
 * 描述信息：
 */
@Controller
@RequestMapping("/blog/{id}")
public class BlogController {

    @Autowired BlogService blogService;
    @GetMapping
    String showBlog(@PathVariable Integer id, Model module){
        Blog blog = blogService.findBlogsById(id);

        if (blog == null) {
            throw new NotFoundException("没有博客");
        }
        module.addAttribute("blog",blog);
        return "item";
    }

}
