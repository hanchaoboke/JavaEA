package club.banyuan.blog.service;

import club.banyuan.blog.bean.User;
import club.banyuan.blog.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User findByName(String username) {
        return userDao.getUserByName(username);
    }

    public void addUser(String email,String username, String password) {
        userDao.addUser(email,username,password);
    }

    public void updateActivated(String username) {
        userDao.updateActivate(username);
    }
}
