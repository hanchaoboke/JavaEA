package club.banyuan.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author HanChao
 * @date 2020-05-27 17:11
 * 描述信息：
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendTestMail(String reservice, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(reservice);
        simpleMailMessage.setSubject("activated mail");
        simpleMailMessage.setText(content);
        simpleMailMessage.setFrom("1035710787@qq.com");

        javaMailSender.send(simpleMailMessage);
    }
}
