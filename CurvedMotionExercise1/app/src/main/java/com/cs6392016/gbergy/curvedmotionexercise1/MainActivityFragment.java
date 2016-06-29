package com.cs6392016.gbergy.curvedmotionexercise1;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;

/**
 * A placeholder fragment containing a simple view.
 * References: https://developer.android.com/training/material/animations.html
 */
public class MainActivityFragment extends Fragment {

    boolean top = true;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_main, container, false);
        final ImageView imgView = (ImageView) v.findViewById(R.id.imageView);
       // final ImageView imgView2 = (ImageView) v.findViewById(R.id.imageView2);
        final ViewGroup root = (ViewGroup) v.findViewById(R.id.root);
        final Transition transitionMgr = TransitionInflater.from(getActivity()).inflateTransition(R.transition.arc);
        final Scene scene1 = Scene.getSceneForLayout(root,R.layout.scene1, v.getContext());
        final Scene scene2 = Scene.getSceneForLayout(root,R.layout.scene2, v.getContext());

        scene1.enter();
//        imgView.setOnClickListener(new View.OnClickListener(){
//        @Override
//        public void onClick(View v) {
//            TransitionManager.go(scene2, transitionMgr);
//                if (top) {
//                    TransitionManager.go(scene2, transitionMgr);
//                } else {
//                    TransitionManager.go(scene1, transitionMgr);
//                }
//                top = !top;
//            }
//        });

        Button btn = (Button) v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (top) {
                    TransitionManager.go(scene2, transitionMgr);
                }else{
                    TransitionManager.go(scene1, transitionMgr);
                }
                top = !top;
            }
        });

        return v;
    }
}

