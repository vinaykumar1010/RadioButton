package com.vinappstudio.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
public RadioGroup RadioGroup;
public RadioButton RadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup = findViewById(R.id.radioGroup_id);
        RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(android.widget.RadioGroup radioGroup, int i) {
                RadioButton  = findViewById(i) ;
            switch(RadioButton.getId()){
                case R.id.yes_id:{
                    Log.d("RD" , "YES" );
                } break;
                case R.id.maybe_id:{
                    Log.d("RD" , "MAYBE");
                }break;
                case R.id.no_id:{
                    Log.d("RD" ,"No");
                }break;

                }
            }
        });

    }
}