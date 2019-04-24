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

    private final int INIT = 0;
    private final int FIRST_FIGURE = 1;
    private final int SECOND_FIGURE = 2;
    private final int RESULT = 3;

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

    private int currentState = INIT;
    private double firstFigure = 0;
    private double secondFigure = 0;
    private double result = 0;
    private String operator = "";

    void handleNumber(int myNumber){
        switch (this.currentState){
            case INIT:
                this.firstFigure = myNumber;
                this.display = "" + myNumber;
                this.currentState = FIRST_FIGURE;
                break;
            case FIRST_FIGURE:
                this.firstFigure = this.firstFigure * 10 + myNumber;
                this.display = this.display + myNumber;
                break;
            case SECOND_FIGURE:
                this.secondFigure = this.secondFigure * 10 + myNumber;
                this.display = this.display + myNumber;
                break;
            case RESULT:
                this.firstFigure = myNumber;
                this.secondFigure = 0;
                this.result = 0;
                this.operator = "";
                this.display = "" + myNumber;
                this.currentState = FIRST_FIGURE;
                break;
        }

    }

    void handleSymbol(String mySymbol){
        switch (this.currentState){
            case INIT:
                break;
            case FIRST_FIGURE:
                if(mySymbol == "+" || mySymbol == "-" || mySymbol == "x" || mySymbol == "/" ){
                    this.operator = mySymbol;
                    this.currentState = SECOND_FIGURE;
                    this.display = this.display + mySymbol;
                }
                break;
            case SECOND_FIGURE:
                if(mySymbol == "=" ){
                    this.resolve();
                    this.display = this.display + mySymbol + this.result;
                    this.currentState = RESULT;
                }
                break;
            case RESULT:
                if(mySymbol == "+" || mySymbol == "-" || mySymbol == "x" || mySymbol == "/" ) {
                    this.firstFigure = this.result;
                    this.secondFigure = 0;
                    this.operator = mySymbol;
                    this.display = this.result + this.operator;
                    this.currentState = SECOND_FIGURE;
                }
                break;
        }
    }

    private void resolve() {
        switch (this.operator){
            case "+":
                this.result = this.firstFigure + this.secondFigure;
                break;
            case "-":
                this.result = this.firstFigure - this.secondFigure;
                break;
            case "x":
                this.result = this.firstFigure * this.secondFigure;
                break;
            case "/":
                this.result = this.firstFigure / this.secondFigure;
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewDisplay = findViewById(R.id.textView);
        this.button7 = findViewById(R.id.button_7);
        this.button8 = findViewById(R.id.button_8);
        this.button9 = findViewById(R.id.button_9);
        this.buttonSlash = findViewById(R.id.button_slash);
        this.button4 = findViewById(R.id.button_4);
        this.button5 = findViewById(R.id.button_5);
        this.button6 = findViewById(R.id.button_6);
        this.buttonStar = findViewById(R.id.button_star);
        this.button1 = findViewById(R.id.button_1);
        this.button2 = findViewById(R.id.button_2);
        this.button3 = findViewById(R.id.button_3);
        this.buttonMinus = findViewById(R.id.button_minus);
        this.buttonDot = findViewById(R.id.button_dot);
        this.button0 = findViewById(R.id.button_0);
        this.buttonEqual = findViewById(R.id.button_equal);
        this.buttonPlus = findViewById(R.id.button_plus);


        myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button_1:
                        handleNumber(1);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_2:
                        handleNumber(2);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_3:
                        handleNumber(3);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_4:
                        handleNumber(4);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_5:
                        handleNumber(5);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_6:
                        handleNumber(6);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_7:
                        handleNumber(7);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_8:
                        handleNumber(8);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_9:
                        handleNumber(9);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_0:
                        handleNumber(0);
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_slash:
                        handleSymbol("/");
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_star:
                        handleSymbol("x");
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_minus:
                        handleSymbol("-");
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_plus:
                        handleSymbol("+");
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_dot:
                        handleSymbol(".");
                        textViewDisplay.setText(display);
                        break;
                    case R.id.button_equal:
                        handleSymbol("=");
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
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
