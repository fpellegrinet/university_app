package com.university.domain;

import com.university.enums.UserType;
import com.university.enums.UserStatus;

import org.json.JSONObject;

import java.io.Serializable;

public class User implements Serializable{
    private UserStatus status;
    private UserType type;
    private String username;
    private String email;
    private String name;
    private String password;

    public User parseJSON(JSONObject json) {
        return null;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
