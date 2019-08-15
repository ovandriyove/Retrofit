package com.example.friday.Model;

import com.google.gson.annotations.SerializedName;

public class ComptonModel {

    @SerializedName("name")
    private String name;
    @SerializedName("bp")
    private String bp;
    @SerializedName("email")
    private String email;
    @SerializedName("photo")
    private int photo;

    public ComptonModel(String name, String bp, String email, int photo){
        this.name = name;
        this.bp = bp;
        this.email = email;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
