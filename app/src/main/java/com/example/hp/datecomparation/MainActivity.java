package com.example.hp.datecomparation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    String str01="03/05/2016";
    String str02="07/03/2016";
    SimpleDateFormat dateFormat;
    Date date01;
    Date date02;

    public MainActivity() throws ParseException {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        dateFormat= new SimpleDateFormat("dd/MM/yyyy");
        try {
            date01= dateFormat.parse(str01);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            date02=dateFormat.parse(str02);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Log.d("thaohandsome", "-----------------------------------------------------------------------------------: "+date01);
        Log.d("thaohandsome", "onCreate: "+date01);
        Log.d("thaohandsome", "onCreate: "+date02);
        if (date01.compareTo(date02)<=0){
            Log.d("thaohandsome", "date1 is less date2: ");
        }
        else {
            Log.d("thaohandsome", "date1 is greater date2: ");

        }
    }
}
