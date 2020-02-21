package com.example.gk.owntryfaragmentstwo;


 import android.app.Fragment;
 import android.content.Context;
 import android.os.Bundle;
 import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SnsFragment extends Fragment{
    EditText editText;
Button button;
Communicate communicate;

    public SnsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sns, container, false);
        editText = view.findViewById(R.id.sndTextView);
        button = view.findViewById(R.id.sndbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                communicate.trd(value);
            }
        });
        return view;
    }
    public void setValue(String getdata){
        editText.setText(getdata);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        communicate = (Communicate) context;
    }
}
