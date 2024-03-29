package com.example.friday.Model;

import com.google.gson.annotations.SerializedName;

public class ComptonModel {

    @SerializedName("userId")
    private String userId;
    @SerializedName("id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("completed")
    private String completed;

    public ComptonModel(String userId, String id, String title, String completed){
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }
}
