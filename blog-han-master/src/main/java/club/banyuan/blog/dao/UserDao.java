package club.banyuan.blog.dao;

import club.banyuan.blog.bean.User;
import org.springframework.stereotype.Repository;

/**
 * @author HanChao
 * @date 2020-05-13 15:42
 * 描述信息：
 */
@Repository
public interface UserDao {
    public User getUserById (Integer id) ;
    public User getUserByName (String name) ;
}
