package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class beverages extends AppCompatActivity {
      ImageButton imageButtonbe1,imageButtonbe2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beverages);
        onclickgoback();
        onclickgomenu();
    }

    public void onclickgomenu(){

        imageButtonbe2 =(ImageButton)findViewById(R.id.imageButton3);
        imageButtonbe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i2=new Intent(breakfast.this,.class);
//                startActivity(i2);
            }
        });
    }
    public void onclickgoback(){
        imageButtonbe1=(ImageButton)findViewById(R.id.ibd);
        imageButtonbe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(beverages.this,mealsbeverages.class);
                startActivity(i1);
            }
        });
    }
}
