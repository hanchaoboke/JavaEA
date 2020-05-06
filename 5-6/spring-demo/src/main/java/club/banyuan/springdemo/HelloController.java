package club.banyuan.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HanChao
 * @date 2020-05-06 17:05
 * 描述信息：
 */

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    @ResponseBody
    public String sayHello(){
        return "Hello,Spring!";
    }
}
