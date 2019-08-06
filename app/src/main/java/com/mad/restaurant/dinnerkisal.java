package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class dinnerkisal extends AppCompatActivity {
      ImageButton imageButtond1,getImageButtond2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinnerkisal);
        onclickgoback();
        onclickgomenu();
    }

    public void onclickgomenu(){

        getImageButtond2 =(ImageButton)findViewById(R.id.imageButton3);
        getImageButtond2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i2=new Intent(dinnerkisal.this,.class);
//                startActivity(i2);
            }
        });
    }
    public void onclickgoback(){
        imageButtond1=(ImageButton)findViewById(R.id.ibd);
        imageButtond1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(dinnerkisal.this,mealsbeverages.class);
                startActivity(i1);
            }
        });
    }
}
