package Data.Models;

import java.time.LocalDateTime;

public class Comment {
    private int id;
    private int articleId;
    private  int userId;
    private String comment;
    LocalDateTime timeCreated = LocalDateTime.now();
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public int getArticleId() {
        return articleId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getUserId() {
        return userId;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }

}
