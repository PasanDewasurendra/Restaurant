package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class breakfast extends AppCompatActivity {
      ImageButton imageButtonb1,imageButtonb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
        onclickgoback();
        onclickgomenu();

    }
    public void onclickgomenu(){

        imageButtonb2 =(ImageButton)findViewById(R.id.imageButton3);
        imageButtonb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(breakfast.this,modifyk.class);
                startActivity(i2);
            }
        });
    }
    public void onclickgoback(){
        imageButtonb1=(ImageButton)findViewById(R.id.ibd);
        imageButtonb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(breakfast.this,mealsbeverages.class);
                startActivity(i1);
            }
        });
    }
}
