package com.university.enums;

public enum UserType {
    STUDENT(1,"Student"),
    PROFESSOR(2,"Professor");

    private int id;
    private String value;

    UserType(int id, String value) {
        this.id = id;
        this.value = value;
    }
}
