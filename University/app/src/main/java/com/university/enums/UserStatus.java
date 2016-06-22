package com.university.enums;

public enum UserStatus {
    ENABLED(1, "Enabled"),
    DISABLED(2, "Disabled");

    private int id;
    private String value;

    UserStatus(int id, String value) {
        this.id = id;
        this.value = value;
    }

}
