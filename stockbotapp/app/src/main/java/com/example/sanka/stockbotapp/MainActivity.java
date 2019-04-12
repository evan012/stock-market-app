package com.example.sanka.stockbotapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
public class MainActivity extends AppCompatActivity {
    EditText editText;
    String answer;

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b1;
        Button b2;


        Button submit;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.news);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, newsActivity.class);
                startActivity(intent);
            }
        });
        b2 = findViewById(R.id.cryptoSearch);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cryptoSearch1.class);
                startActivity(intent);
            }
        });
        editText = (EditText) findViewById(R.id.editText);

        submit = (Button) findViewById(R.id.submit);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer = editText.getText().toString();
                Toast.makeText(getApplicationContext(), answer, Toast.LENGTH_SHORT).show();
                webView.loadUrl("https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + answer + "&apikey=GYGUM8OW9YSQICDQ");


            }
        });

    }

}
