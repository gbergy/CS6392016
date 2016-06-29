package com.cs6392016.gbergy.stateslistproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
                "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii",
                "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine",
                "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
                "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
                "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
                "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee",
                "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia",
                "Wisconsin", "Wyoming"};
        List<String> statesAL = new ArrayList<String>(Arrays.asList(states));

        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.listviewitem,
                R.id.textviewitem,
                statesAL);

        ListView lv = (ListView) rootView.findViewById(R.id.listViewLayout);
        lv.setAdapter(stateAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                ViewGroup vg = (ViewGroup) view;
//                ImageView iv = (ImageView) vg.findViewById(R.id.map);
                if (position == 9) {
                    Log.i("You Clicked", "Georgia the 10th State");
//                  iv.setVisibility(View.VISIBLE);
                    String geoUri = String.format("geo:33.753504,-84.390265?z=10");
                    Uri geo = Uri.parse(geoUri);
                    Intent intent = new Intent(Intent.ACTION_VIEW, geo);
                    startActivity(intent);
                }
            }
        });

        return rootView;
    }
}
