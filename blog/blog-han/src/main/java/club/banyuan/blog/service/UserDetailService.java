package club.banyuan.blog.service;

import club.banyuan.blog.bean.User;
import club.banyuan.blog.security.UserDeatilImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author HanChao
 * @date 2020-05-26 10:47
 * 描述信息：
 */
@Service
@Qualifier("db")
public class UserDetailService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        username -> name
        User user = userService.findByName(s);

        if (user == null) {
            throw new UsernameNotFoundException(s+"Not Found");
        } else {
            //        user -> userDetail
            return new UserDeatilImp(user);
        }
    }
}
