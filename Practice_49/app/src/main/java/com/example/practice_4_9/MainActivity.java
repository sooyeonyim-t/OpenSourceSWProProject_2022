package com.example.practice_4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView img1;
    int temp=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-9");

        btn1=(Button) findViewById(R.id.btn1);
        img1=(ImageView) findViewById(R.id.img1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                temp=temp+10;
                img1.setRotation(temp);
            }
        });
    }
}