package club.banyuan.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author HanChao
 * @date 2020-05-06 17:24
 * 描述信息：
 */
@Controller
@RequestMapping("/time")
public class TimeController {
    @GetMapping
    @ResponseBody
    public String showTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date = new Date();
        String time = simpleDateFormat.format(date);
        return time;
    }
}
