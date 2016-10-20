package com.rakesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class History extends AppCompatActivity {
  @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
       TextView tv = (TextView) findViewById(R.id.textView);
       TextView tv1 = (TextView) findViewById(R.id.textView1);
       TextView tv2 = (TextView) findViewById(R.id.textView2);
       TextView tv3 = (TextView) findViewById(R.id.textView3);
       TextView tv4 = (TextView) findViewById(R.id.textView4);
       TextView tv5 = (TextView) findViewById(R.id.textView5);
       TextView tv6 = (TextView) findViewById(R.id.textView6);
       TextView tv7 = (TextView) findViewById(R.id.textView7);
       TextView tv8 = (TextView) findViewById(R.id.textView8);
       TextView tv9 = (TextView) findViewById(R.id.textView9);
       TextView tv10 = (TextView) findViewById(R.id.textView10);
       TextView tv11 = (TextView) findViewById(R.id.textView11);
       TextView tv12 = (TextView) findViewById(R.id.textView12);
       if (tv.getText().toString().isEmpty()) {
          tv.setEnabled(true);


        }
            else if(!tv.getText().toString().isEmpty()){
              tv1.setEnabled(true);

            }

       }

    }



