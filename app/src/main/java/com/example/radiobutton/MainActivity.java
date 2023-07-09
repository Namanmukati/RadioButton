package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup) findViewById(R.id.radioGroup);
    }
    public void  onclickbuttonMethod(View v){
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radioButton = (RadioButton)findViewById(selectedId);
        if (selectedId==-1){
            Toast.makeText(this, "Nothing Selected", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }


}