package com.bjh.www.a1026_personalinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton sex1, sex2, job1, job2;
    RadioGroup GroupSex, GroupAge;
    TextView textView_information;
    EditText editText_name, editText_age;
    Button button_name, button_age, button_all;
    String name, age, sex, job;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sex1 = (RadioButton)findViewById(R.id.radioButton_sex1);
        sex2 = (RadioButton)findViewById(R.id.radioButton_sex2);
        job1 = (RadioButton)findViewById(R.id.radioButton_job1);
        job2 = (RadioButton)findViewById(R.id.radioButton_job2);

        GroupSex = (RadioGroup)findViewById(R.id.RadioGroup_sex);
        GroupSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_sex1)
                    sex = sex1.getText().toString();
                else if(checkedId == R.id.radioButton_sex2)
                    sex = sex2.getText().toString();
            }
        });

        GroupAge = (RadioGroup)findViewById(R.id.RadioGroup_job);
        GroupAge.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton_job1)
                    job = job1.getText().toString();
                else if(checkedId == R.id.radioButton_job2)
                    job = job2.getText().toString();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        editText_name = (EditText)findViewById(R.id.editText_name);
        editText_age = (EditText)findViewById(R.id.editText_age);

        name = editText_name.getText().toString();
        age = editText_age.getText().toString();

        textView_information = (TextView)findViewById(R.id.textView_information);

        switch (id) {
            case R.id.button_name:
                result = "이름은 " + name + "입니다.";
                textView_information.setText(result);
                break;
            case R.id.button_age:
                result = "나이는 " + age + "입니다.";
                textView_information.setText(result);
                break;
            case R.id.button_all:
                result = "이름은 " + name + ", 나이는 " + age + "세, 성별은 " + sex + ", 직업은 " + job + "입니다." ;
                textView_information.setText(result);
                break;
        }
    }
}
