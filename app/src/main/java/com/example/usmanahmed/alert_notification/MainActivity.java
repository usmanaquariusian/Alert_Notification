package com.example.usmanahmed.alert_notification;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText txt1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1= findViewById(R.id.txt1);
        bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert= new AlertDialog.Builder(MainActivity.this);
                String str;
                str=txt1.getText().toString();
                alert.setMessage(str);
                alert.create();
                alert.show();
            }
        });
    }
}
