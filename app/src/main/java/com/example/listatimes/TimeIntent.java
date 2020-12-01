package com.example.listatimes;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TimeIntent extends AppCompatActivity {

    TextView textViewNome, textViewCidade, textViewTitulos;
    ImageView imgView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_time);
        textViewNome = findViewById(R.id.textViewNome);
        textViewCidade = findViewById(R.id.textViewCidade);
        imgView = findViewById(R.id.imageView);
        textViewTitulos = findViewById(R.id.textViewTitulos);

        Intent it = getIntent();
        if(it!=null){
            Bundle params = it.getExtras();
            if(params!=null){
                int pos = params.getInt("time");
                Time time = MainActivity.times.get(pos);
                textViewNome.setText(time.getNome());
                textViewCidade.setText(time.getCidadeEstado());
                imgView.setImageResource(time.getImg());
                textViewTitulos.setText(time.getTitulos());
            }
        }
    }
}
