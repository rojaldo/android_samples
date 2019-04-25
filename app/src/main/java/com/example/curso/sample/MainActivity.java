package com.example.curso.sample;

import android.content.Intent;
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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonCalculator;
    private View.OnClickListener myClickListener;
    private Button buttonLifeCycle;
    private Button buttonFragment;
    private Button buttonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonCalculator = findViewById(R.id.button_calculator);
        this.buttonLifeCycle = findViewById(R.id.button_lca);
        this.buttonFragment = findViewById(R.id.button_fragment);
        this.buttonList = findViewById(R.id.button_list);
        Log.i("MainActivity.onCreate()", "Activity created");

        myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (v.getId()){
                    case R.id.button_calculator:
                        intent = new Intent(MainActivity.this, CalculatorActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.button_lca:
                        intent = new Intent(MainActivity.this, LifeCycleTestActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.button_fragment:
                        intent = new Intent(MainActivity.this, MyFragmentActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.button_list:
                        intent = new Intent(MainActivity.this, ListActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        this.buttonCalculator.setOnClickListener(this.myClickListener);
        this.buttonLifeCycle.setOnClickListener(this.myClickListener);
        this.buttonFragment.setOnClickListener(this.myClickListener);
        this.buttonList.setOnClickListener(this.myClickListener);

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
