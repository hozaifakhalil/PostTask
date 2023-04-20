package com.NewTask.dto;

public class PostDto {
    private long Id;
    private long userId;
    private String body;
    private String title;
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    
}
