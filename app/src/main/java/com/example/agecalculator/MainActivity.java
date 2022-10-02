package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText BirthYear;  //this is to get birthYear from user
    TextView DisAns; // this object is to display age to user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BirthYear = findViewById(R.id.tbInputNo);
        DisAns = findViewById(R.id.lblAns);

    }

    public  void calcAge(View view){
       Integer birthYear = Integer.valueOf(BirthYear.getText().toString());
       Integer currentYear = Calendar.getInstance().get(Calendar.YEAR);
       Integer ans = currentYear-birthYear;

       DisAns.setText("Your age is " +ans+" years old.");
    }


}