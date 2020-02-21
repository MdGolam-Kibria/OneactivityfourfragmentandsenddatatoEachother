package com.example.gk.owntryfaragmentstwo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements Communicate {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FastFragment fastFragment = new FastFragment();
        SnsFragment snsFragment = new SnsFragment();
        Trd trd = new Trd();
        Last last = new Last();
        fragmentTransaction.add(R.id.containear1, fastFragment, "fast fragment");
        fragmentTransaction.add(R.id.containear2, snsFragment, "sns fragment");
        fragmentTransaction.add(R.id.containear3, trd, "trd");
        fragmentTransaction.add(R.id.containear4, last, "last");
        fragmentTransaction.commit();

    }

    @Override
    public void respond(String data) {
        SnsFragment snsFragment = (SnsFragment) getFragmentManager().findFragmentByTag("sns fragment");
        snsFragment.setValue(data);
    }

    @Override
    public void trd(String data) {
        Trd trd = (Trd) getFragmentManager().findFragmentByTag("trd");
        trd.getValue(data);
    }

    @Override
    public void last(String data) {
        Last last = (Last) getFragmentManager().findFragmentByTag("last");
        last.get(data);

    }
}
