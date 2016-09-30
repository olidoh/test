package com.example.dohrenbusch.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    private static int zaehler = 1;
    private int lokalerZaehler = zaehler++;

    private static final String TAG = "testLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textFeld);
        tv.setText("onCreate");
    }

    protected void onStart()
    {
        super.onStart();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("START");
        log("onStart");
    }

    protected void onResume()
    {
        super.onResume();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Resume");
        log("onResume");



    }

    protected void onPause()
    {
        super.onPause();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Pause");
        log("onPause");
    }

    protected void onStop()
    {
        super.onStop();
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("STOP");
        log("onStop");
    }

    private void log(String methodName)
    {
        Log.d(TAG, methodName + "() #" + lokalerZaehler);
    }
}
