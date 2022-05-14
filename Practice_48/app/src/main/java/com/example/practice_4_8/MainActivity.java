package com.example.practice_4_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ET1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-8");
        ET1=(EditText) findViewById(R.id.editText1);

        ET1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                Toast.makeText(getApplicationContext(),ET1.getText().toString(),Toast.LENGTH_SHORT).show();
                return false;

            }
        });
    }
}