package com.everbright.wangyusen.contacs_app;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /** Called when the user taps the Send button */
        public void sendMessage(View view) {
            TextView textView = (TextView) findViewById(R.id.textView);
            Contacts s = new Contacts(getApplicationContext());
            s.getContacts_name();
            textView.setText(s.getDisplay());

        }

}



