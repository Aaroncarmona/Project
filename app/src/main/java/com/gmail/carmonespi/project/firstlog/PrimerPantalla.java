package com.gmail.carmonespi.project.firstlog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.carmonespi.project.R;

public class PrimerPantalla extends Fragment{

    private View view;

    public PrimerPantalla(){

    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_primer_pantalla, container , false);
        return view;

    }
}