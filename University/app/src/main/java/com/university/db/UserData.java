package com.university.db;

import com.university.code.UniversityClient;
import com.university.domain.User;

public class UserData {
    private UniversityClient client = new UniversityClient();
    private static final String USER_URI = "http://university.com/user/";

    public User getUser(String username) {
        String query = USER_URI+"GET"+username;
        User user = new User().parseJSON(client.get(query));
        return user;
    }
}
