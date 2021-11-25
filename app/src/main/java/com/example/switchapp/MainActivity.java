package com.example.switchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
Switch switchone,switchtwo;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchone=findViewById(R.id.switch1);
        switchtwo=findViewById(R.id.switch2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status1,status2;


                if (switchone.isChecked()){
                    status1=switchone.getTextOn().toString();
                }
                else {
                    status1=switchone.getTextOff().toString();
                }

                if (switchtwo.isChecked()){
                    status2=switchtwo.getTextOn().toString();
                }
                else {
                    status2=switchtwo.getTextOff().toString();
                }
                Toast.makeText(getApplicationContext(),status1+"\n"+status2,Toast.LENGTH_SHORT).show();
            }
        });


    }
}