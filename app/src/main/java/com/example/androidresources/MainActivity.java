package com.example.androidresources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = new TextView(this);
//        t.setText("Aplicativo Android");
        t.setText(R.string.texto_tela);

        setContentView(t);
    }
}
