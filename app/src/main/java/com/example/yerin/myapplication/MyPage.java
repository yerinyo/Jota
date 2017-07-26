package com.example.yerin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MyPage extends AppCompatActivity implements View.OnContextClickListener{


    private Button btnedit;
    private TextView school, department, id, warning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnedit = (Button)findViewById(R.id.btn_edit);
        initView();
    }

    private void initView() {
    school = ()

    }
}
