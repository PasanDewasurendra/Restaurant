package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mealsbeverages extends AppCompatActivity {
    ImageButton img_btn_breakfast,img_btn_dinner,img_btn_lunch,img_btn_beverages,img_btn_desert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mealsbeverages);
        onClickImageButton();
    }

    public void onClickImageButton(){
        img_btn_beverages=(ImageButton)findViewById(R.id.imageButton3);
        img_btn_breakfast=(ImageButton)findViewById(R.id.imageButton);
        img_btn_desert=(ImageButton)findViewById(R.id.imageButton4);
        img_btn_dinner=(ImageButton)findViewById(R.id.imageButton2);
        img_btn_lunch=(ImageButton)findViewById(R.id.imageButton1);

        img_btn_beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(mealsbeverages.this,beverages.class);
                startActivity(in1);

            }
        });
        img_btn_breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2=new Intent(mealsbeverages.this,breakfast.class);
                startActivity(in2);
            }
        });
        img_btn_desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent in3=new Intent(mealsbeverages.this,.class);
//                ` startActivity(in3);`
            }
        });
        img_btn_dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent in4=new Intent(mealsbeverages.this,dinner.class);
//                startActivity(in4);
            }
        });
        img_btn_lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5=new Intent(mealsbeverages.this,lunch.class);
                startActivity(in5);
            }
        });
    }
}
