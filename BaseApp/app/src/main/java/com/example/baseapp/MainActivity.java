package com.example.baseapp;

/* **********************************************
 * 프로그램명 :  좀 그럴듯한 앱
 * 작성자 : 2020039017 임수연
 * 작성일 : 2021.03.23
 *프로그램 설명 :  글자나타내기, 홈페이지 열기, 라디오버튼 등의 기능을 구현한 프로그램
 ************************************************/

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    Button button1,button2;
    String text,url;
    RadioGroup rG1;
    RadioButton r,s;
    ImageView imgs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좀 그럴듯한 앱");

        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edit1=(EditText)findViewById(R.id.Edit1);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        rG1=(RadioGroup)findViewById(R.id.Rg1);
        r=(RadioButton)findViewById(R.id.R);
        s=(RadioButton)findViewById(R.id.S);
        imgs=(ImageView)findViewById(R.id.Imgs);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text=edit1.getText().toString();
                Toast.makeText(getApplicationContext(),text, Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Url= edit1.getText().toString();
                Intent mIntent=new Intent(Intent.ACTION_VIEW,Uri.parse(Url));
                startActivity(mIntent);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rG1.getCheckedRadioButtonId()==R.id.R){
                    imgs.setImageResource(R.drawable.ic_launcher_background);
                }
            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rG1.getCheckedRadioButtonId()==R.id.S){
                    imgs.setImageResource(R.drawable.ic_launcher_foreground);
                }
            }
        });

    }
}