






package com.rakesh.myapplication;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //String used
    public String lastAns = "     ";
    //bool used
    public boolean dot;


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
    Button buttonac;
    //Misc Buttons
    Button buttonpl;
    Button buttondot;
    Button buttonpr;
    Button buttonans;
    Button buttondel;
    //Scientific Buttons
    Button buttonfact;
    Button buttonroot;
    Button buttonpi;
  //  Button buttonxy;
    Button buttonper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Auto-Create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Screen Locked to only PortrateMode
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Our plain Text Views
        final TextView ET=(TextView) findViewById(R.id.textView);
        final TextView ET1=(TextView)findViewById(R.id.textView1);

        //InputFilter[] FilterArray = new InputFilter[1];
        // FilterArray[0] = new InputFilter.LengthFilter(11);
        //ET.setFilters(FilterArray);
        //NumberedButtons
        buttonzero = (Button) findViewById(R.id.buttonzero);
        buttonone = (Button) findViewById(R.id.buttonone);
        buttontwo = (Button) findViewById(R.id.buttontwo);
        buttonthree = (Button) findViewById(R.id.buttonthree);
        buttonfour = (Button) findViewById(R.id.buttonfour);
        buttonfive = (Button) findViewById(R.id.buttonfive);
        buttonsix = (Button) findViewById(R.id.buttonsix);
        buttonseven = (Button) findViewById(R.id.buttonseven);
        buttoneight = (Button) findViewById(R.id.buttoneight);
        buttonnine = (Button) findViewById(R.id.buttonnine);
        //Arith buttons
        buttonplus = (Button) findViewById(R.id.buttonplus);
        buttonmin = (Button) findViewById(R.id.buttonmin);
        buttoneql = (Button) findViewById(R.id.buttoneql);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonfact = (Button) findViewById(R.id.buttonfact);
        //Misc buttons
        buttonans = (Button) findViewById(R.id.buttonans);
        buttonac = (Button) findViewById(R.id.buttonac);
        buttondot = (Button) findViewById(R.id.buttondot);
        buttondel = (Button) findViewById(R.id.buttondel);
        //Scientific Buttons
        //buttonxy = (Button) findViewById(R.id.buttonxy);
        buttonroot = (Button) findViewById(R.id.buttonroot);
        buttonpi = (Button) findViewById(R.id.buttonpi);
        buttonpl = (Button) findViewById(R.id.buttonpl);
        buttonpr = (Button) findViewById(R.id.buttonpr);
        buttonper=(Button)findViewById(R.id.buttonper);
        //Make an array list to make it look good :D
        final ArrayList<Button> buttons = new ArrayList<>();
        buttons.add(buttonzero);
        buttons.add(buttonone);
        buttons.add(buttontwo);
        buttons.add(buttonthree);
        buttons.add(buttonfour);
        buttons.add(buttonfive);
        buttons.add(buttonsix);
        buttons.add(buttonseven);
        buttons.add(buttoneight);
        buttons.add(buttonnine);
        buttons.add(buttonplus);
        buttons.add(buttonmin);
        buttons.add(buttonmul);
        buttons.add(buttondiv);
        buttons.add(buttonfact);
        buttons.add(buttondot);
        buttons.add(buttondel);

        //Scientific Buttons
        ArrayList<Button> scientificbuttons = new ArrayList<>();
        scientificbuttons.add(buttonroot);
        scientificbuttons.add(buttonans);
        //scientificbuttons.add(buttonxy);
        scientificbuttons.add(buttonpl);
        scientificbuttons.add(buttonpr);
        scientificbuttons.add(buttonpi);
        scientificbuttons.add(buttonper);



        for (final Button button : buttons) {
            button.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.buttonzero:

                            ET.append(buttonzero.getText());
                            break;
                        case R.id.buttonone:
                            ET.append(buttonone.getText());
                            break;
                        case R.id.buttontwo:
                            // checkEvaluatedState();
                            ET.append(buttontwo.getText());
                            break;
                        case R.id.buttonthree:
                            //   checkEvaluatedState();
                            ET.append(buttonthree.getText());
                            break;
                        case R.id.buttonfour:
                            //  checkEvaluatedState();
                            ET.append(buttonfour.getText());
                            break;
                        case R.id.buttonfive:
                            //  checkEvaluatedState();
                            ET.append(buttonfive.getText());
                            break;
                        case R.id.buttonsix:
                            //  checkEvaluatedState();
                            ET.append(buttonsix.getText());
                            break;
                        case R.id.buttonseven:
                            // checkEvaluatedState();
                            ET.append(buttonseven.getText());
                            break;
                        case R.id.buttoneight:
                            // checkEvaluatedState();
                            ET.append(buttoneight.getText());
                            break;
                        case R.id.buttonnine:
                            // checkEvaluatedState();
                            ET.append(buttonnine.getText());
                            break;
                        case R.id.buttonplus:
                            dot=false;
                            if (ET.getText().toString().equals("+")){
                                ET.setText(null);
                                    }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("+")||
                                    ET.getText().toString().endsWith("++"))
                                        {
                            ET.setText(ET.getText());
                                        }
                            else if(ET.getText().toString().endsWith("-")||
                                    ET.getText().toString().endsWith("*")||
                                    ET.getText().toString().endsWith("/"))
                        {
                            ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                            ET.append("+");
                        }
                            else  if(ET.getText()!=null) {
                                ET.append("+");
                            }
                            break;
                        case R.id.buttonmin:
                            dot=false;
                            if (ET.getText().toString().equals("-")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("-")||
                                    ET.getText().toString().endsWith("--"))
                            {
                                ET.setText(ET.getText());
                            }
                            else if(ET.getText().toString().endsWith("+"))
                            {ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                ET.append("-");
                            }
                            else if(ET.getText()!=null){
                                ET.append("-");
                            }

                            break;
                        case R.id.buttonmul:
                            dot=false;
                            if (ET.getText().toString().equals("*")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("*")||
                                    ET.getText().toString().endsWith("**"))
                            {
                                ET.setText(ET.getText());
                            }
                            else if(
                                    ET.getText().toString().endsWith("+")||
                                    ET.getText().toString().endsWith("/")||
                                    ET.getText().toString().endsWith("-"))
                            {
                                ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                ET.append("*");
                            }

                            else if (ET.getText()!=null) {
                                ET.append("*");
                            }

                            break;
                        case R.id.buttondiv:
                            dot=false;
                            if (ET.getText().toString().equals("/")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("/")||
                                    ET.getText().toString().endsWith("//"))
                            {
                                ET.setText(ET.getText());
                            }
                            else if(
                                    ET.getText().toString().endsWith("*")||
                                    ET.getText().toString().endsWith("+")||
                                    ET.getText().toString().endsWith("-"))
                            {
                                ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                ET.append("/");
                            }
                            else if(ET.getText()!= null) {
                                ET.append("/");
                            }

                            break;
                        case R.id.buttonfact:

                            if (ET.getText().toString().equals("!")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("!")||
                                    ET.getText().toString().endsWith("!!"))
                            {
                                ET.setText(ET.getText());
                            }
                            else if(
                                    ET.getText().toString().endsWith("+")||
                                            ET.getText().toString().endsWith("/")||
                                            ET.getText().toString().endsWith("-")||ET.getText().toString().endsWith("*"))
                            {
                                ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                ET.append("!");
                            }
                            else
                            {
                                ET.append("!");
                            }

                            break;
                        case R.id.buttondot:

                            if (ET.getText().toString().equals(".")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith(".")||
                                    ET.getText().toString().endsWith(".."))
                            {
                                ET.setText(ET.getText());
                                dot=true;
                            }
                            else if (dot){
                                ET.setText(ET.getText());
                            }
                            else {
                                ET.append(".");
                                dot=true;
                            }

                            break;
                        default:
                            ET.setText("");
                            break;

                            }

                }

            }));
        }


        buttondel.setOnClickListener((new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dot=false;
                try {
                    if (ET.getText().toString() != null) {
                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));

                    } else {
                        buttondel.setEnabled(false);
                    }
                } catch (StringIndexOutOfBoundsException ignored) {
                }
            }
        }));


        for (Button button : scientificbuttons) {
            button.setOnClickListener((new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    switch (view.getId()) {
                        case R.id.buttonroot:

                            if(ET.getText().toString().equals("√")){
                                ET.append("√");
                            }
                            else {ET.append("√");}
                             break;
                        case R.id.buttonper:
                            if (ET.getText().toString().equals("%")){
                                ET.setText(null);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith("%")||
                                    ET.getText().toString().endsWith("%"))
                            {
                                ET.setText(ET.getText());
                            }
                            else {
                                ET.append("%");
                            }

                            break;
                        case R.id.buttonpi:

                            //checkEvaluatedState();
                            if (ET.getText().toString().equals("π")){
                                ET.setText("π");
                            }
                            else if (ET.getText().toString().endsWith("π")||
                                    ET.getText().toString().endsWith("ππ"))
                            {
                                ET.setText(ET.getText());
                            }
                            else {
                                ET.append("π");
                            }

                            break;
                        case R.id.buttonpl:
                            if(ET.getText().toString().equals(")")){
                                ET.append(")");
                            }
                            else {ET.append(")");}
                            break;
                        case R.id.buttonpr:
                            if(ET.getText().toString().equals("(")){
                                ET.append("(");
                            }
                            else {ET.append("(");}
                            break;
                        case R.id.buttonans:
                            if (ET.getText().toString().equals(lastAns)){
                                ET.setText(lastAns);
                            }
                            else if (ET.getText().toString().equals("")||ET.getText().toString().endsWith(lastAns)||
                                    ET.getText().toString().endsWith(lastAns+lastAns))
                            {
                                ET.setText(ET.getText());
                            }
                            else {
                                ET.append(lastAns);
                            }

                            break;
                            default:
                                ET.setText(null);

                    }

                }

            }));




        }

        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot=false;
                ET.setText(null);
                ET1.setText(null);
            }
        });
        buttoneql.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot=false;
               if(ET.getText().toString().endsWith("+")
                 || ET.getText().toString().endsWith("-") ||ET.getText().toString().endsWith("/")||ET.getText().toString().endsWith("*")||
                 ET.getText().toString().endsWith("√")||
                 ET.getText().toString().endsWith("pi")||ET.getText().toString().endsWith("^")||ET.getText().toString().endsWith("(")||ET.getText().toString().endsWith("%"))
                {
                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                        Parser p = new ArityParser();
                        String expression = ET.getText().toString();
                        String result = p.parser(expression);
                    if (result.endsWith(".0")) {
                        result=(result.substring(0, result.length() - 2));
                        lastAns = result;
                        ET1.setText(expression);
                        ET.setText(result);

                    }else {
                        lastAns = result;
                        ET.setText(result);
                        ET1.setText(expression);;
                    }
                    }
                else if (ET.getText().toString().equals("")){
                    ET.setText("");
                   ET1.setText("");

                }
                else
                 {
                    Parser p = new ArityParser();
                    String expression = ET.getText().toString();
                        String result = p.parser(expression);
                     if (result.endsWith(".0")) {
                         result=(result.substring(0, result.length() - 2));
                         lastAns = result;
                         ET1.setText(expression);;
                         ET.setText(result);

                     }else {
                         lastAns = result;
                         ET.setText(result);
                     }
                    }


                    }


        }

        ));
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
        if (id == R.id.settings) {
            return true;
        }
        else if(id==R.id.history)
        {
            Intent intent = new Intent(getApplicationContext(),History.class);
            startActivity(intent);
            return true;
        }
        else if (id==R.id.share)
        {
            String EXTRA_STR="Please Download this amazing Calculator App by *RaLabs*";
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, EXTRA_STR);
            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   }




