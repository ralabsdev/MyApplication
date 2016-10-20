package com.rakesh.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;



/**
 * Created by rakesh on 06-10-2016.
 */

public class ArityParser extends AppCompatActivity implements Parser  {


    @Override
    public String parser(String expression) {
        try {
            Symbols s = new Symbols();
                float result= (float) s.eval(expression);
                return ""+result;

            }catch (SyntaxException e){return "error";}
        }
    }

