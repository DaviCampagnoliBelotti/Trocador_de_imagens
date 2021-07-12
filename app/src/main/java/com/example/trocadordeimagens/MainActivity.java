package com.example.trocadordeimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/*  Davi Campagnoli Belotti
    Giuliana Merola
 */

public class MainActivity extends AppCompatActivity {

    private ImageView imgEscudo;
    private Button btnZoro;
    private Button btnLuffy;
    private Button btnSanji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*imgEscudo = findViewById(R.id.ImgEscudo);
        btnZoro = findViewById(R.id.btnZoro);
        btnLuffy = findViewById(R.id.btnLuffy);
        btnSanji = findViewById(R.id.btnSanji);*/

        btnZoro.setOnClickListener(new Escutada());
        btnLuffy.setOnClickListener(new Escutada());
        btnSanji.setOnClickListener(new Escutada());
    }

    class Escutada implements View.OnClickListener{
        @Override
        public void onClick(View view){
            Button b = (Button) view;

            switch (b.getId()){
                case R.id.btnZoro:
                    imgEscudo.setImageResource(R.drawable.zoro);
                    break;
                case R.id.btnLuffy:
                    imgEscudo.setImageResource(R.drawable.luffy);
                    break;
                case R.id.btnSanji:
                    imgEscudo.setImageResource(R.drawable.sanji);
                    break;
            }
        }
    }
}