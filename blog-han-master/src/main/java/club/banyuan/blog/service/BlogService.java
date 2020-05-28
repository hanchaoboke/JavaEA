package club.banyuan.blog.service;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.dao.BlogDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;

    @Autowired
    private UserService userService;

    public  Blog findBlogsById(Integer id) {
        Blog blog =blogDao.findBlogById(id);
        return blog;
    }

    public PageInfo findBlogsByUsername (String username,Integer page,Integer size) {
        User user = userService.findUserByName(username);
        return findBlogs(user,page,size);
    }

    public PageInfo<Blog> findBlogs(User user, Integer page,Integer size) {

        PageHelper.startPage(page,size,"id asc");

        return new PageInfo(blogDao.findBlogsById(user.getId()));
    }

    public void saveBlogs(Integer id,String title,String content) {
        blogDao.saveBlog(id,title,content);
    }

    public void deleteBlog(Integer id) {
        blogDao.deleteBlog(id);
    }
}
