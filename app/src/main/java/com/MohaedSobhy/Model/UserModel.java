package com.MohaedSobhy.Model;

public class UserModel {

    String name;
    String status;
    int image;

    public UserModel() {
    }

    public UserModel(String name, String status, int image) {
        this.name = name;
        this.status = status;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
