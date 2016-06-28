package com.cs6392016.gbergy.greggoldbergmidterm;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public static final Double CONVERSION_RATE = 586.84;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.fragment_main, container, false);
        final EditText dollars = (EditText) v.findViewById(R.id.dollars);
        final TextView francs = (TextView) v.findViewById(R.id.francs);

        Button btnCalc = (Button)v.findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {

                final Double dollarsToConvert = Double.parseDouble(dollars.getText().toString());
                final Double francsAmount = dollarsToConvert * CONVERSION_RATE;

                Log.i("Dollar Amount Entered: ", dollars.getText().toString());
                Log.i("Francs Amount is :", francsAmount.toString());

                francs.setText(String.format("%.2f", francsAmount));
            }
        });

        return v;
    }

}
