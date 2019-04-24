package com.example.curso.sample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDisplay;
    private Button button2;
    private Button button1;
    private View.OnClickListener myClickListener;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonSlash;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonStar;
    private Button button3;
    private Button buttonMinus;
    private Button buttonDot;
    private Button button0;
    private Button buttonEqual;
    private Button buttonPlus;
    private String display = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewDisplay = (TextView) findViewById(R.id.textView);
        this.button7 = (Button) findViewById(R.id.button_7);
        this.button8 = (Button) findViewById(R.id.button_8);
        this.button9 = (Button) findViewById(R.id.button_9);
        this.buttonSlash = (Button) findViewById(R.id.button_slash);
        this.button4 = (Button) findViewById(R.id.button_4);
        this.button5 = (Button) findViewById(R.id.button_5);
        this.button6 = (Button) findViewById(R.id.button_6);
        this.buttonStar = (Button) findViewById(R.id.button_star);
        this.button1 = (Button) findViewById(R.id.button_1);
        this.button2 = (Button) findViewById(R.id.button_2);
        this.button3 = (Button) findViewById(R.id.button_3);
        this.buttonMinus = (Button) findViewById(R.id.button_minus);
        this.buttonDot = (Button) findViewById(R.id.button_dot);
        this.button0 = (Button) findViewById(R.id.button_0);
        this.buttonEqual = (Button) findViewById(R.id.button_equal);
        this.buttonPlus = (Button) findViewById(R.id.button_plus);


        myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_1:
                        display = display + "1";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_2:
                        display = display + "2";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_3:
                        display = display + "3";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_4:
                        display = display + "4";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_5:
                        display = display + "5";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_6:
                        display = display + "6";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_7:
                        display = display + "7";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_8:
                        display = display + "8";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_9:
                        display = display + "9";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_0:
                        display = display + "0";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_slash:
                        display = display + "/";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_star:
                        display = display + "x";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_minus:
                        display = display + "-";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_plus:
                        display = display + "+";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_dot:
                        display = display + ".";
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_equal:
                        display = display + "=";
                        textViewDisplay.setText(display);
                        break;

                }

            }
        };
        this.button1.setOnClickListener(this.myClickListener);
        this.button2.setOnClickListener(this.myClickListener);
        this.button3.setOnClickListener(this.myClickListener);
        this.button4.setOnClickListener(this.myClickListener);
        this.button5.setOnClickListener(this.myClickListener);
        this.button6.setOnClickListener(this.myClickListener);
        this.button7.setOnClickListener(this.myClickListener);
        this.button8.setOnClickListener(this.myClickListener);
        this.button9.setOnClickListener(this.myClickListener);
        this.button0.setOnClickListener(this.myClickListener);
        this.buttonPlus.setOnClickListener(this.myClickListener);
        this.buttonMinus.setOnClickListener(this.myClickListener);
        this.buttonSlash.setOnClickListener(this.myClickListener);
        this.buttonStar.setOnClickListener(this.myClickListener);
        this.buttonDot.setOnClickListener(this.myClickListener);
        this.buttonEqual.setOnClickListener(this.myClickListener);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
}
