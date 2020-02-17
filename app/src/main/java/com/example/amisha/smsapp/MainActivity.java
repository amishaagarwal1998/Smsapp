package com.example.amisha.smsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Sms {

    EditText e1,e2;
    Button b1;
    SmsManager sm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1,s2;
                s1=e1.getText().toString();
                s2=e2.getText().toString();

                sm=SmsManager.getDefault();
                sm.sendTextMessage(s1,null,s2,null);

            }
        });








    }
}
