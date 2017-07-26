package com.example.yerin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageSwitcher;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class EditPage extends AppCompatActivity implements View.OnClickListener{

    private ImageSwitcher btnphoto;
    private ImageButton btndone;
    private EditText school, department;
    private TextView id, warning, hi1;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btndone = (ImageButton)findViewById(R.id.btn_done);
        initView();
    }

    private void initView() {

        btndone = (ImageButton)findViewById(R.id.btn_done);
        btnphoto = (ImageSwitcher)findViewById(R.id.btn_photo);
        school = (EditText)findViewById(R.id.edit_school);
        department= (EditText)findViewById(R.id.edit_department);
        id = (TextView)findViewById(R.id.id);
        warning = (TextView)findViewById(R.id.warning);

        btndone.setOnClickListener(this);

        intent = new Intent(Intent.ACTION_DEFAULT);

        btndone.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        startActivity(intent);
    }
}

