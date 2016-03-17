package com.example.pc.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cityLabel;
    private TextView msgTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityLabel = (EditText) findViewById(R.id.sehirAdi);
    }

    public void polisClicked(View view) {

        TextView msgTextView = (TextView) findViewById(R.id.msgPolis);
        msgTextView.setText(cityLabel.getText() + " şehri için Polis İmdat hattı 155");
    }

    public void itfaiyeClicked(View view) {

        TextView msgTextView = (TextView) findViewById(R.id.msgItfaiye);
        msgTextView.setText(cityLabel.getText() + " şehri için İtfaiye hattı 110");
    }
    public void trafikClicked(View view) {

        TextView msgTextView = (TextView) findViewById(R.id.msgTrafik);
        msgTextView.setText(cityLabel.getText() + " şehri için Trafik hattı 154");
    }

    public void acilServisClicked(View view) {

        TextView msgTextView = (TextView) findViewById(R.id.msgAcilServis);
        msgTextView.setText(cityLabel.getText() + " şehri için Acil Servis hattı 112");
    }

    public void ormanYanginiClicked(View view) {

        TextView msgTextView = (TextView) findViewById(R.id.msgOrmanYangini);
        msgTextView.setText(cityLabel.getText() + " şehri için Orman Yangın hattı 170");
    }
}
