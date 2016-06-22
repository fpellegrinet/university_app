package com.university.code;

import android.content.Context;
import android.content.Intent;

import com.university.domain.User;
import com.university.enums.UserType;
import com.university.ui.OptionsList;

import java.util.Arrays;
import java.util.List;

public class MainAdapter {
    public MainAdapter(Context context, User user) {
        List<String> activities = getUserActivities(user);
        Intent i = new Intent(context, OptionsList.class);
        i.putExtra("user", user);
        i.putExtra("activityList", activities.toArray());
        context.startActivity(i);
    }

    private List<String> getUserActivities(User user) {
        List<String> activities = null;
        if (user.getType() == UserType.STUDENT) {
            // list of things the student can do
            activities = Arrays.asList("Listado de materias", "Agregar materia", "Anotarse a examen");
        } else if (user.getType() == UserType.PROFESSOR) {
            // list of things the professor can do
            activities = Arrays.asList("Listado de materias", "Agregar nota", "Agendar Examen");
        }
        return activities;
    }

}
