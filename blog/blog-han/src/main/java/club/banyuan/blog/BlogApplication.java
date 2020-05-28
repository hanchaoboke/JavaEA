package club.banyuan.blog;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.dao.BlogDao;
import club.banyuan.blog.dao.UserDao;
import club.banyuan.blog.service.MailService;
import club.banyuan.blog.service.RedisService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("club.banyuan")
@MapperScan("club.banyuan.blog.dao")
@EnableCaching
public class BlogApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BlogApplication.class, args);

		MailService mailService = context.getBean(club.banyuan.blog.service.MailService.class);
//		mailService.sendTestMail("1035710787@qq.com","lalalalalalalal");
		RedisService redisService = context.getBean(club.banyuan.blog.service.RedisService.class);
//		redisService.testRedis();
    }
}
