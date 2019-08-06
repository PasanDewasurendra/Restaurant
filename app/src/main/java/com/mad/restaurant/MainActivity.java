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

    public void onclick(){

        button7 = findViewById(R.id.button7);


        if( button7.toString()=="button7"){

            Intent intent = new Intent(MainActivity.this, Drinks.class);
            startActivity(intent);

        }
        button8=findViewById(R.id.button8);
        if(button8.toString()=="button7"){

            Intent intent = new Intent(MainActivity.this,Submarians.class);
            startActivity(intent);
        }
        button9=findViewById(R.id.button9);
        if(button9.toString()=="button9"){

            Intent intent = new Intent(MainActivity.this,Burgers.class);
            startActivity(intent);

        }
        button10=findViewById(R.id.button10);
        if(button10.toString()=="button10"){
            Intent intent = new Intent(MainActivity.this,Sandwiches.class);
            startActivity(intent);


        }
        button11=findViewById(R.id.button11);{
            if(button11.toString()=="button11"){

                Intent intent = new Intent(MainActivity.this,icecream.class);
                startActivity(intent);

            }
        }
    }
}
