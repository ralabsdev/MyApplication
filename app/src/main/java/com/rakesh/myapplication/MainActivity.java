






package com.rakesh.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //String used
    public String lastAns = " ";
    public String exp="";

    //bool used
    public boolean dot=true,deg=false;


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
    Button buttonxy;
    Button buttontan;
    Button buttonper;
    Button buttonlog;
    Button buttonsin;
    Button buttoncos;
    Button buttonbx;
    Button buttonln;
    Button buttone;
    Button buttondeg;
    Button buttonrad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Auto-Create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Our plain Text Views
        final TextView ET=(TextView) findViewById(R.id.textView3);
        final TextView ET1=(TextView)findViewById(R.id.textView4);
        final TextView ET2=(TextView)findViewById(R.id.textView6);
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
        buttondeg=(Button)findViewById(R.id.buttondeg);
        buttonrad=(Button)findViewById(R.id.buttonrad);
        //Scientific Buttons
        buttonroot = (Button) findViewById(R.id.buttonroot);
        buttonpi = (Button) findViewById(R.id.buttonpi);
        buttonpl = (Button) findViewById(R.id.buttonpl);
        buttonpr = (Button) findViewById(R.id.buttonpr);
        buttonper=(Button)findViewById(R.id.buttonper);
        buttonxy= (Button) findViewById(R.id.buttonxy);
        buttontan= (Button) findViewById(R.id.buttontan);
        buttonlog= (Button) findViewById(R.id.buttonlog);
        buttonsin= (Button) findViewById(R.id.buttonsin);
        buttoncos= (Button) findViewById(R.id.buttoncos);
        buttonbx= (Button) findViewById(R.id.buttonbx);
        buttonln= (Button) findViewById(R.id.buttonln);
        buttone= (Button) findViewById(R.id.buttone);


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
        buttons.add(buttonroot);
        buttons.add(buttonans);
        buttons.add(buttonxy);
        buttons.add(buttonpl);
        buttons.add(buttonpr);
        buttons.add(buttonpi);
        buttons.add(buttonper);
        buttons.add(buttonsin);
        buttons.add(buttoncos);
        buttons.add(buttontan);
        buttons.add(buttonln);
        buttons.add(buttonlog);
        buttons.add(buttone);
        buttons.add(buttonbx);
        buttons.add(buttondeg);
        buttons.add(buttonrad);






            for (final Button button : buttons) {
                try {
                    button.setOnClickListener((new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {

                            switch (view.getId()) {
                                case R.id.buttonzero:

                                    ET.append("0");
                                    break;
                                case R.id.buttonone:
                                    ET.append("1");
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
                                    dot = false;
                                    if (ET.getText().toString().equals("+")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("+") ||
                                            ET.getText().toString().endsWith("++")) {
                                        ET.setText(ET.getText());
                                    } else if (ET.getText().toString().endsWith("-") ||
                                            ET.getText().toString().endsWith("*") ||
                                            ET.getText().toString().endsWith("/")) {
                                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                        ET.append("+");
                                    } else if (ET.getText() != null) {
                                        ET.append("+");
                                    }
                                    break;
                                case R.id.buttonmin:
                                    dot = false;
                                    if (ET.getText().toString().equals("-")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("-") ||
                                            ET.getText().toString().endsWith("--")) {
                                        ET.setText(ET.getText());
                                    } else if (ET.getText().toString().endsWith("+")) {
                                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                        ET.append("-");
                                    } else if (ET.getText() != null) {
                                        ET.append("-");
                                    }

                                    break;
                                case R.id.buttonmul:
                                    dot = false;
                                    if (ET.getText().toString().equals("*")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("*") ||
                                            ET.getText().toString().endsWith("**")) {
                                        ET.setText(ET.getText());
                                    } else if (
                                            ET.getText().toString().endsWith("+") ||
                                                    ET.getText().toString().endsWith("/") ||
                                                    ET.getText().toString().endsWith("-")) {
                                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                        ET.append("*");
                                    } else if (ET.getText() != null) {
                                        ET.append("*");
                                    }

                                    break;
                                case R.id.buttondiv:
                                    dot = false;
                                    if (ET.getText().toString().equals("/")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("/") ||
                                            ET.getText().toString().endsWith("//")) {
                                        ET.setText(ET.getText());
                                    } else if (
                                            ET.getText().toString().endsWith("*") ||
                                                    ET.getText().toString().endsWith("+") ||
                                                    ET.getText().toString().endsWith("-")) {
                                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                        ET.append("/");
                                    } else if (ET.getText() != null) {
                                        ET.append("/");
                                    }

                                    break;
                                case R.id.buttonfact:

                                    if (ET.getText().toString().equals("!")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("!") ||
                                            ET.getText().toString().endsWith("!!")) {
                                        ET.setText(ET.getText());
                                    } else if (
                                            ET.getText().toString().endsWith("+") ||
                                                    ET.getText().toString().endsWith("/") ||
                                                    ET.getText().toString().endsWith("-") || ET.getText().toString().endsWith("*")) {
                                        ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                                        ET.append("!");
                                    } else {
                                        ET.append("!");
                                    }

                                    break;
                                case R.id.buttondot:
                                    dot = false;
                                    if (ET.getText().toString().equals(".")) {
                                        ET.setText(null);
                                        dot = true;
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith(".") ||
                                            ET.getText().toString().endsWith("..")) {
                                        ET.setText(ET.getText());
                                        dot = true;
                                    } else if (dot) {
                                        ET.setText(ET.getText());
                                    } else {
                                        ET.append(".");
                                        dot = true;

                                    }
                                case R.id.buttonroot:
                                    if (ET.getText().toString().equals(buttonroot.getText())) {
                                        ET.append(buttonroot.getText());
                                    } else {
                                        ET.append(buttonroot.getText());
                                    }
                                    break;
                                case R.id.buttonper:
                                    if (ET.getText().toString().equals(buttonper.getText())) {
                                        ET.setText("");
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith((String) buttonper.getText()) ||
                                            ET.getText().toString().endsWith((String) buttonper.getText() + buttonper.getText())) {
                                        ET.setText(ET.getText());
                                    } else {
                                        ET.append(buttonper.getText());
                                    }
                                    break;
                                case R.id.buttonpi:
                                    if (ET.getText().toString().equals("π")) {
                                        ET.setText("π");
                                    } else if (ET.getText().toString().endsWith("π") ||
                                            ET.getText().toString().endsWith("ππ")) {
                                        ET.setText(ET.getText());
                                    } else {
                                        ET.append("π");
                                    }

                                    break;
                                case R.id.buttonpl:
                                    ET.append(")");
                                    break;
                                case R.id.buttonpr:
                                    ET.append("(");
                                    break;
                                case R.id.buttonans:
                                    if (ET.getText().toString().equals(lastAns)) {
                                        ET.setText(lastAns);
                                    } else if (ET.getText().toString().endsWith(lastAns) ||
                                            ET.getText().toString().endsWith(lastAns + lastAns)) {
                                        ET.setText(ET.getText());
                                    } else {
                                        ET.append(lastAns);
                                    }
                                    break;
                                case R.id.buttonbx:

                                    dot=false;
                                    ET.setText(null);
                                    ET1.setText(null);
                                    break;
                                case R.id.buttonlog:
                                    ET.append("log(");
                                    break;
                                case R.id.buttonln:
                                    ET.append("ln(");
                                    break;
                                case R.id.buttone:
                                    ET.append("e");
                                    break;
                                case R.id.buttonxy:
                                    if (ET.getText().toString().equals("^")) {
                                        ET.setText(null);
                                    } else if (ET.getText().toString().equals("") || ET.getText().toString().endsWith("^") ||
                                            ET.getText().toString().endsWith("^^")) {
                                        ET.setText(ET.getText());
                                    } else {
                                        ET.append("^");
                                    }
                                    break;
                                case R.id.buttonsin:
                                    ET.append("sin(");
                                    break;
                                case R.id.buttoncos:
                                    ET.append("cos(");
                                    break;
                                case R.id.buttontan:
                                    ET.append("tan(");
                                    break;
                                case R.id.buttondeg:
                                    deg = true;
                                    ET2.setText("Deg");
                                    break;
                                case R.id.buttonrad:
                                    deg = false;
                                    ET2.setText("Rad");
                                    break;
                                default:
                                    ET.setText(null);
                                    break;


                            }
                        }


                    }));
                } catch (NullPointerException e) {
                }
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


        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ET.getText().toString().equals("1/")) {
                    ET.setText("1/");
                } else if (ET.getText().toString().endsWith("1/1/")) {
                    ET.setText(ET.getText());
                } else {
                    ET.append("1/");
                }
            }
        });

        buttoneql.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dot=false;
                if(ET.getText().toString().endsWith("+")|| ET.getText().toString().endsWith("-")||
                        ET.getText().toString().endsWith("/")||
                        ET.getText().toString().endsWith("*")||ET.getText().toString().endsWith("√")||
                        ET.getText().toString().endsWith("pi")||ET.getText().toString().endsWith("^")||
                        ET.getText().toString().endsWith("(")||ET.getText().toString().endsWith("%"))
                {
                    ET.setText(ET.getText().toString().substring(0, ET.length() - 1));
                    Parser p = new ArityParser();
                    String expression = ET.getText().toString();
                    String result = p.parser(expression);
                    if (result.endsWith(".0")) {
                        result=(result.substring(0, result.length() - 2));
                        lastAns = result;
                        ET1.setText(expression);
                        exp= (String) ET1.getText();
                        ET.setText(result);
                    }else {
                        lastAns = result;
                        ET.setText(result);
                        ET1.setText(expression);
                        exp= ET1.getText()+"="+result;
                    }
                }
                else if (ET.getText().toString().equals("")){
                    ET.setText("");
                    ET1.setText("");
                    exp= "";

                }
                else if (deg)
                {

                    Parser p = new ArityParser();
                    String expression = ET.getText().toString();
                    if (expression.contains("sin("))
                    {
                        int si=expression.indexOf("sin(");
                        int ei=expression.indexOf("",si+4);
                        String num=expression.substring(si+4,ei);
                        expression=expression.replace("sin(","sin((pi/180)*"+num);
                    }
                    if (expression.contains("cos("))
                    {
                        int si=expression.indexOf("cos(");
                        int ei=expression.indexOf("",si+4);
                        String num=expression.substring(si+4,ei);
                        expression=expression.replace("cos(","cos((pi/180)*"+num);
                    }
                    if (expression.contains("tan("))
                    {
                        int si=expression.indexOf("tan(");
                        int ei=expression.indexOf("",si+4);
                        String num=expression.substring(si+4,ei);
                        expression=expression.replace("tan(","tan((pi/180)*"+num);
                    }
                    String result = p.parser(expression);
                    lastAns = result;
                    if (result.endsWith(".0")) {
                        result = (result.substring(0, result.length() - 2));
                        lastAns = result;
                        ET1.setText(expression);
                        ET.setText(result);
                    }
                    lastAns = result;
                    ET1.setText(expression);
                    ET.setText(result);
                 }
                else {

                    Parser p = new ArityParser();
                    String expression = ET.getText().toString();
                    String result = p.parser(expression);
                    if (result.endsWith(".0")) {
                        result = (result.substring(0, result.length() - 2));
                        lastAns = result;
                        ET1.setText(expression);
                        ET.setText(result);


                    } else {
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

        if (id==R.id.share)
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




