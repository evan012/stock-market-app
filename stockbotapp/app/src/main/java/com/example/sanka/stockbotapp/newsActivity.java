package com.example.sanka.stockbotapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class newsActivity extends AppCompatActivity {
    Button newsRefresh;
    WebView webView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button b3;
        Button b4;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        b3 = findViewById(R.id.goingCrypto);
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this, cryptoSearch1.class);
                startActivity(intent);
            }
        });
        b4 = findViewById(R.id.goingStock);
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
