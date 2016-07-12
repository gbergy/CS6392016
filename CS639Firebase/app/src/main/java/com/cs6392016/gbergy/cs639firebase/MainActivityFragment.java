package com.cs6392016.gbergy.cs639firebase;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private Button btnSubmit;
    private EditText etID, etFirstName;
    private Firebase rootRef;
    private FirebaseDatabase db;
    private DatabaseReference dbRef;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        btnSubmit = (Button) rootView.findViewById(R.id.btnSubmit);
        etID = (EditText) rootView.findViewById(R.id.etID);
        etFirstName =(EditText) rootView.findViewById(R.id.etFirstName);
        rootRef = new Firebase("https://cs-639-firebase.firebaseio.com");


        btnSubmit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id = etID.getText().toString().trim();
                String firstname = etFirstName.getText().toString().trim();
                Student student = new Student();
                student.setFirstname(firstname);
                student.setId(id);

                rootRef.child("Student").push().setValue(student);
                Log.i("All Good", "Value " + firstname + " & " + id + " added");

            }
        });

        return rootView;
    }

 }

