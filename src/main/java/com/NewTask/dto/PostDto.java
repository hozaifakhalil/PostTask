package com.NewTask.dto;

import com.NewTask.entity.dao.User;

public class PostDto {
    private long Id;
    private User user;
    private String body;
    private String tittle;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
 
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    
}
