package com.example.gk.owntryfaragmentstwo;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Last extends Fragment {
    EditText editText;
    Button button;

    public Last() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trd, container, false);
        editText = view.findViewById(R.id.trdEdit);
        button = view.findViewById(R.id.lastbtn);
        return view;
    }

    public void get(String get) {
        editText.setText(get);
    }


}
