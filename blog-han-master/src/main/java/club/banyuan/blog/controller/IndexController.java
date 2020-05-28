package club.banyuan.blog.controller;

import club.banyuan.blog.service.IndexService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HanChao
 * @date 2020-05-15 15:39
 * 描述信息：
 */
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping({"/","/index"})
    public String showHomePage(@RequestParam(required = false,defaultValue = "1") Integer page,
                               @RequestParam(required = false,defaultValue = "10") Integer size,
                               Model model){

        PageInfo info = indexService.sortBlogsByData(page,size);
        model.addAttribute("blogs",info);

        return "Index";
    }
}
