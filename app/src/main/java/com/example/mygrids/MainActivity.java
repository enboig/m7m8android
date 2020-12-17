package com.example.mygrids;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView texte;
    Integer comptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comptador = 0;

        texte = findViewById(R.id.resultat);

        findViewById(R.id.b_add).setOnClickListener((View v) -> {
            comptador++;
            texte.setText(String.valueOf(comptador));
        });


        findViewById(R.id.b_sub).setOnClickListener((View v) -> {
            comptador--;
            texte.setText(String.valueOf(comptador));
        });


        findViewById(R.id.b_increase).setOnClickListener((View v) -> {
            if (texte.getTextSize() < 300.0) {
                float oneSp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 1, getResources().getDisplayMetrics());
                texte.setTextSize((texte.getTextSize() / oneSp) + 3);
            }
        });

        findViewById(R.id.b_decrease).setOnClickListener((View v) -> {
            if (texte.getTextSize() > 10.0) {
                float oneSp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 1, getResources().getDisplayMetrics());
                texte.setTextSize((texte.getTextSize() / oneSp) - 2);
            }
        });

        findViewById(R.id.b_hide).setOnClickListener((View v) -> texte.setVisibility(v.INVISIBLE));

        findViewById(R.id.b_show).setOnClickListener((View v) ->    texte.setVisibility(v.VISIBLE));

        findViewById(R.id.b_color).setOnClickListener((View v) -> {
            Random rnd = new Random();
            texte.setTextColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        });

        findViewById(R.id.b_background).setOnClickListener((View v) -> {
            Random rnd = new Random();
            texte.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
        });


    }
}