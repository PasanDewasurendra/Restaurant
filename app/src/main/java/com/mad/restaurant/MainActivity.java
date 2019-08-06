package com.mad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {


     Button button7,button8,button9,button10,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

        public void onclickButton7(View v) {
            button7 = findViewById(R.id.button7);

            Intent intent = new Intent(MainActivity.this, Drinks.class);
            startActivity(intent);


        }
        public void onclickButton8(View v) {

            button8 = findViewById(R.id.button8);

            Intent intent = new Intent(MainActivity.this,Submarians.class);
            startActivity(intent);



        }
        public void onclickButton9(View v) {

            button9 = findViewById(R.id.button9);
            Intent intent = new Intent(MainActivity.this,Burgers.class);
            startActivity(intent);



        }
        public void onclickButton10(View v) {

            button10 = findViewById(R.id.button10);
            Intent intent = new Intent(MainActivity.this,Sandwiches.class);
            startActivity(intent);



        }
        public void onclickButton11(View v) {

            button11 = findViewById(R.id.button11);
            Intent intent = new Intent(MainActivity.this,icecream.class);
            startActivity(intent);



        }



    }




