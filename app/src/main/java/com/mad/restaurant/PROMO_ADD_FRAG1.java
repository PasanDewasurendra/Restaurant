package com.mad.restaurant;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PROMO_ADD_FRAG1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PROMO_ADD_FRAG1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PROMO_ADD_FRAG1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_promo__add__frag1, container, false);
    }

}