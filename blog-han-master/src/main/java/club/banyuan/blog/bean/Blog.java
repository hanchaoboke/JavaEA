package club.banyuan.blog.bean;


import java.util.Date;

public class Blog {

    private Integer id;
    private String title;
    private String content;
    private Date createdTime;
    private User author;

    public Blog(Integer id, String title, String content, Date createedTime, User author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdTime = createedTime;
        this.author = author;
    }

    public Blog() {
    }

    public Blog(Integer i, String s, String s1) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateedTime() {
        return createdTime;
    }

    public void setCreateedTime(Date createedTime) {
        this.createdTime = createedTime;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createedTime=" + createdTime +
                ", author=" + author +
                '}';
    }
}
