package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lunch extends AppCompatActivity {

    ImageButton imageButton1,imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        onclickgomenu();
        onclickgoback();
    }
    public void onclickgomenu(){

       imageButton2 =(ImageButton)findViewById(R.id.imageButton3);
       imageButton2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        //       Intent intent2=new Intent(lunch.this,MainActivity.class);
       //        startActivity(intent2);
           }
       });
    }
    public void onclickgoback(){
        imageButton1=(ImageButton)findViewById(R.id.ibd);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lunch.this,mealsbeverages.class);
                startActivity(intent);
            }
        });
    }
}
