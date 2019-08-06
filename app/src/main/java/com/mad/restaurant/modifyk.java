package com.mad.restaurant;



import android.os.Bundle;
import android.support.v4.app.Fragment;

//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class modifyk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifyk);
    }
    public void changeFragment(View v){


        if(v==findViewById(R.id.fb1)){
            Fragment fragment=new frag_modification();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_change,fragment );
            ft.commit();
        }


        if(v==findViewById(R.id.fb2)){
            Fragment fragment=new frag_modification2();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_change,fragment );
            ft.commit();
        }


        if(v==findViewById(R.id.fb3)){
            Fragment fragment=new frag_modification3();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_change,fragment );
            ft.commit();
        }
    }
}
