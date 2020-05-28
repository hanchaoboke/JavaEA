package club.banyuan.blog.controller;

import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Path;
import java.io.IOException;



/**
 * @author HanChao
 * @date 2020-05-18 16:09
 * 描述信息：
 */

@Controller
public class FileController {

    @PostMapping("/upload")
    String upload(@RequestParam("file")MultipartFile file) throws IOException {

//        File.copy(file.getInputStream(), )

        return "redirect:/admin";
    }
}
