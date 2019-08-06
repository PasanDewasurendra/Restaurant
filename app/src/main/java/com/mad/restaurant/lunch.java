package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lunch extends AppCompatActivity {

    ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        onclickadditem();
    }
    public void onclickadditem(){

       imageButton =(ImageButton)findViewById(R.id.imageButton3);
       imageButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
        //       Intent intent=new Intent(lunch.this,MainActivity.class);
       //        startActivity(intent);
           }
       });
    }
}
