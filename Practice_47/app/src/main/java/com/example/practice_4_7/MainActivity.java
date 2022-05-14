package com.example.practice_4_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    CheckBox CB1;
    CheckBox CB2;
    CheckBox CB3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 4-7");

        CB1=(CheckBox) findViewById(R.id.cBox1);
        CB2=(CheckBox) findViewById(R.id.cBox2);
        CB3=(CheckBox) findViewById(R.id.cBox3);
        btn1=(Button) findViewById(R.id.button1);

        CB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (CB1.isChecked() == true){
                    btn1.setEnabled(true);
                }
                else{
                    btn1.setEnabled(false);
                }
            }
        });

        CB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (CB2.isChecked() == true){
                    btn1.setClickable(true);
                }
                else{
                    btn1.setClickable(false);
                }
            }
        });

        CB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(CB3.isChecked()==true){
                    btn1.setRotation(45);
                }
                else{
                    btn1.setRotation(0);
                }

            }
        });

    }
}