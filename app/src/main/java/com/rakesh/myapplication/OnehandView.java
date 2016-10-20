package com.rakesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class OnehandView extends AppCompatActivity implements View.OnTouchListener {
    //String used
    public String lastAns = "     ";
    public String exp = "";

    //bool used
    public boolean dot, deg;


    //Numerical buttons
    Button buttonnine;
    Button buttoneight;
    Button buttonseven;
    Button buttonsix;
    Button buttonfive;
    Button buttonfour;
    Button buttonthree;
    Button buttontwo;
    Button buttonone;
    Button buttonzero;
    //Arithmetic Buttons
    Button buttondiv;
    Button buttonmul;
    Button buttonplus;
    Button buttonmin;
    Button buttoneql;

    //Misc Buttons

    Button buttonac;
    Button buttonpl;
    Button buttondot;
    Button buttonpr;
    Button buttonans;
    Button buttondel;
    //Scientific Buttons
    Button buttonfact;
    Button buttonroot;
    Button buttonpi;
    Button buttonper;
    ViewGroup floatView;
    private int _xDelta;
    private int _yDelta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onehand_view);
        floatView = (ViewGroup) findViewById(R.id.floatView);
        final TextView ET = (TextView) findViewById(R.id.textView);
        final TextView ET1 = (TextView) findViewById(R.id.textView1);
        buttonzero = (Button) floatView.findViewById(R.id.buttonzero);
        buttonone = (Button) floatView.findViewById(R.id.buttonone);
        buttontwo = (Button) floatView.findViewById(R.id.buttontwo);
        buttonthree = (Button) floatView.findViewById(R.id.buttonthree);
        buttonfour = (Button) floatView.findViewById(R.id.buttonfour);
        buttonfive = (Button) floatView.findViewById(R.id.buttonfive);
        buttonsix = (Button) floatView.findViewById(R.id.buttonsix);
        buttonseven = (Button) floatView.findViewById(R.id.buttonseven);
        buttoneight = (Button) floatView.findViewById(R.id.buttoneight);
        buttonnine = (Button) floatView.findViewById(R.id.buttonnine);
        //Arith buttons
        buttonplus = (Button) floatView.findViewById(R.id.buttonplus);
        buttonmin = (Button) floatView.findViewById(R.id.buttonmin);
        buttoneql = (Button) floatView.findViewById(R.id.buttoneql);
        buttonmul = (Button) floatView.findViewById(R.id.buttonmul);
        buttondiv = (Button) floatView.findViewById(R.id.buttondiv);
        buttonfact = (Button) floatView.findViewById(R.id.buttonfact);
        //Misc buttons
        buttonans = (Button) floatView.findViewById(R.id.buttonans);
        buttonac = (Button) floatView.findViewById(R.id.buttonac);
        buttondot = (Button) floatView.findViewById(R.id.buttondot);
        buttondel = (Button) floatView.findViewById(R.id.buttondel);
        //Scientific Buttons
        buttonroot = (Button) floatView.findViewById(R.id.buttonroot);
        buttonpi = (Button) floatView.findViewById(R.id.buttonpi);
        buttonpl = (Button) floatView.findViewById(R.id.buttonpl);
        buttonpr = (Button) floatView.findViewById(R.id.buttonpr);
        buttonper = (Button) floatView.findViewById(R.id.buttonper);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(600,500);
        floatView.setLayoutParams(layoutParams);
        floatView.setOnTouchListener(this);
            }
        @Override
    public boolean onTouch(View view, MotionEvent event) {
        final int X = (int) event.getRawX();
        final int Y = (int) event.getRawY();
        switch (event.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                _xDelta = X - lParams.leftMargin;
                _yDelta = Y - lParams.topMargin;
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                break;
            case MotionEvent.ACTION_POINTER_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view
                        .getLayoutParams();
                if((X - _xDelta) > 0 && (X - _xDelta) < 1080 ) {
                    layoutParams.leftMargin = X - _xDelta;

                }

                if((Y - _xDelta) > 0 && (Y - _xDelta) < 1920) {
                    layoutParams.topMargin = Y - _yDelta;

                }


                    view.setLayoutParams(layoutParams);

                break;
        }
        floatView.invalidate();
        return true;
    }

}


