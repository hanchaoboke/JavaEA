package club.banyuan.blog.dao;

import club.banyuan.blog.bean.Blog;
import org.apache.ibatis.annotations.Select;
import org.springframework.jmx.export.naming.IdentityNamingStrategy;
import org.springframework.stereotype.Repository;

import javax.swing.text.BadLocationException;
import java.util.List;

/**
 * @author HanChao
 * @date 2020-05-12 16:29
 * 描述信息：
 */

@Repository
public interface BlogDao {

    public Blog findBlogById (Integer id);
    public List<Blog> findBlogsById (Integer id);
    public List<Blog> sortBlogs (String fieldName,String order);
    public void saveBlog(Integer id,String title,String content);
    public void deleteBlog(Integer id);
}
