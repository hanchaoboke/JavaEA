package club.banyuan.blog.service;

import club.banyuan.blog.bean.Blog;
import club.banyuan.blog.bean.User;
import club.banyuan.blog.dao.BlogDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;

    public  Blog findBlogsById(Integer id) {
        Blog blog =blogDao.findBlogById(11);
        return blog;
    }

    public PageInfo<Blog> findBlogs(User user, Integer page,Integer size) {

        PageHelper.startPage(page,size,"id asc");

        return new PageInfo(blogDao.findBlogsById(user.getId()));


//        List<Blog> blogs = new ArrayList<>();
//        for (Integer i = 0; i < 100; i++) {
//            Blog blog = new Blog(i, "title " + i, "content " + i);
//            blogs.add(blog);
//        }
//        return blogs;
    }
}
