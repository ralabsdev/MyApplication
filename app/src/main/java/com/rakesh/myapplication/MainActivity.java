package com.rakesh.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText editText=(EditText)findViewById(R.id.editText);
        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        Button b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);
        Button b6= (Button)findViewById(R.id.button6);
        b6.setOnClickListener(this);
        Button b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(this);
        Button b8 = (Button)findViewById(R.id.button8);
        b8.setOnClickListener(this);
        Button b9 = (Button)findViewById(R.id.button9);
        b9.setOnClickListener(this);
        Button b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(this);
        Button b11 = (Button)findViewById(R.id.button11);
        b11.setOnClickListener(this);
        Button b12 = (Button)findViewById(R.id.button12);
        b12.setOnClickListener(this);
        Button b13 = (Button)findViewById(R.id.button13);
        b13.setOnClickListener(this);
        Button b14 = (Button)findViewById(R.id.button14);
        b14.setOnClickListener(this);
        Button b15 = (Button)findViewById(R.id.button15);
        b15.setOnClickListener(this);
        Button b16= (Button)findViewById(R.id.button16);
        b16.setOnClickListener(this);
        Button b17 = (Button)findViewById(R.id.button17);
        b17.setOnClickListener(this);
        Button b18 = (Button)findViewById(R.id.button18);
        b18.setOnClickListener(this);
        Button b19 = (Button)findViewById(R.id.button19);
        b19.setOnClickListener(this);
        Button b20=(Button)findViewById(R.id.button20);
        b20.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        EditText ET = (EditText)findViewById(R.id.editText);

        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                ET.setText(".");
                break;
            case R.id.button2:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                ET.setText("0");
                break;
            case R.id.button3:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                ET.setText("=");
                break;
            case R.id.button4:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                ET.setText("+");
                break;
            case R.id.button5:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button13:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button14:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button15:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button16:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button17:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button18:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button19:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.button20:
                Toast.makeText(this,""+v.getId(),Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this,"None sellected",Toast.LENGTH_SHORT).show();

        }


    }
}
