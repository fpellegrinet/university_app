package com.university.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.university.R;
import com.university.domain.User;

public class OptionsList extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options_list);

        Intent intent = getIntent();
        User user = (User) intent.getSerializableExtra("user");
        String[] activities = intent.getStringArrayExtra("activityList");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };

        RelativeLayout activityList = (RelativeLayout)findViewById(R.id.activityList);
        for (String activity : activities) {
            Button button = new Button(this);
            button.setText(activity);
            button.setOnClickListener(onClickListener);
            activityList.addView(button);
        }
    }
}
