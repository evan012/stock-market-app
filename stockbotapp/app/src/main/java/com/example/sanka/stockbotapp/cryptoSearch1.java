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

public class cryptoSearch1 extends AppCompatActivity {
    EditText editText2;
    String answer1;
    Button theSubmitter;
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b5;
        Button b6;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto_search1);
        b5 = findViewById(R.id.goinStock);
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cryptoSearch1.this, MainActivity.class);
                startActivity(intent);
            }
        });
        b6 = findViewById(R.id.goinNews);
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cryptoSearch1.this, newsActivity.class);
                startActivity(intent);
            }
        });
        editText2 = (EditText) findViewById(R.id.editText2);

        theSubmitter = (Button) findViewById(R.id.theSubmitter);
        webView1 = (WebView) findViewById(R.id.webView2);
        webView1.getSettings().setJavaScriptEnabled(true);
        theSubmitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = editText2.getText().toString();
                Toast.makeText(getApplicationContext(), answer1, Toast.LENGTH_SHORT).show();
                webView1.loadUrl("https://www.alphavantage.co/query?function=DIGITAL_CURRENCY_DAILY&symbol=" + answer1 + "&market=USD&apikey=GYGUM8OW9YSQICDQ");


            }
        });
    }
}
