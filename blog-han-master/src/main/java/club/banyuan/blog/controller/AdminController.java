package club.banyuan.blog.controller;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.service.BlogService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author HanChao
 * @date 2020-05-14 15:38
 * 描述信息：
 */

@Controller
public class AdminController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/admin/{username}")
    public String adminBlog (@PathVariable String username,
                             @RequestParam(required = false,defaultValue = "1") Integer page,
                             @RequestParam(required = false,defaultValue = "10") Integer size,
                             HttpSession session,
                             Model model) throws UnsupportedEncodingException {

        // 判断用户是否登录，以及是否可以访问这个页面
        User user = (User) session.getAttribute("CURRENT");
        if (user == null) {
            return "redirect:/login";
        } else {
            if (!user.getName().equals(username)) {
                return "redirect:/admin/"+ URLEncoder.encode(user.getName(),"UTF-8");
            }
        }

        PageInfo info = blogService.findBlogsByUsername(username,page,size);
        model.addAttribute("blogs",info);
        return "admin-blogs";

    }

    @GetMapping("/admin/blog/{id}/edit")
    public String adminBlogEdit (@PathVariable Integer id,
                                 Model model) {
        Blog blog = blogService.findBlogsById(id);
        model.addAttribute("blog",blog);

        return "edit";
    }

    @PostMapping("/admin/blog/{id}/edit")
    public  String editBlog(HttpSession session,
                            @RequestParam String title,
                            @RequestParam String content,
                            @PathVariable Integer id) throws UnsupportedEncodingException {

        // save blog
        blogService.saveBlogs(id, title, content);
        String username = ((User)session.getAttribute("CURRENT")).getName();

        return "redirect:/admin/"+URLEncoder.encode(username,"UTF-8");
}
    @DeleteMapping("/admin/blog/{id}")
    public String deleteBlog(@PathVariable Integer id,
                             HttpSession session) throws UnsupportedEncodingException {
        blogService.deleteBlog(id);
        String username = ((User)session.getAttribute("CURRENT")).getName();
        return "redirect:/admin/"+URLEncoder.encode(username,"UTF-8");
    }

//    @GetMapping("/admin")
//    public String UserAdmin

}