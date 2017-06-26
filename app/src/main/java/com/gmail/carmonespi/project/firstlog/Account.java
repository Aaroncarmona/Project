package com.gmail.carmonespi.project.firstlog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.carmonespi.project.R;

public class Account extends Fragment{

    private View view;

    public Account(){

    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_account, container , false);
        return view;

    }
}