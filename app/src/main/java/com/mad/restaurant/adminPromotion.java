package com.mad.restaurant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class adminPromotion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_promotion);

    }

    public void changefragment(View view) {
        Fragment fragment;

        if (view == findViewById(R.id.btnfragmnt1)) {
            fragment = new PROMO_ADD_FRAG1();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntdefault, fragment);
            ft.commit();

        }

        if(view==findViewById(R.id.btnfragmnt2)) {
            fragment = new PROMO_UPDATE_Frag2();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntdefault, fragment);
            ft.commit();

        }
        if(view==findViewById(R.id.btnfragmnt3)) {
            fragment = new PROMO_DELETE_Frag3();

            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fgmntdefault, fragment);
            ft.commit();

        }

        }
    }



