package com.example.gk.owntryfaragmentstwo;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
 import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Trd extends Fragment {
EditText editText;
Button button;
Communicate communicate;

    public Trd() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_trd, container, false);
        editText = view.findViewById(R.id.trdEdit);
        button = view.findViewById(R.id.trdbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                communicate.last(value);
            }
        });
        return view;
    }
    public void getValue(String get){
        editText.setText(get);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicate = (Communicate) context;
    }
}
