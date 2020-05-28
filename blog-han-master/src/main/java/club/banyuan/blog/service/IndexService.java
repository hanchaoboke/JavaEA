package club.banyuan.blog.service;

import club.banyuan.blog.dao.BlogDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HanChao
 * @date 2020-05-15 15:46
 * 描述信息：
 */
@Service
public class IndexService {
    @Autowired
    private BlogDao blogDao;

    public PageInfo sortBlogsByData(Integer page, Integer size){
        PageHelper.startPage(page,size);
        return new PageInfo(blogDao.sortBlogs("create_time","desc"));

    }
}
