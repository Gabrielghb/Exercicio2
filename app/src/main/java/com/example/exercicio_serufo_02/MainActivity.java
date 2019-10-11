package com.example.exercicio_serufo_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button botao = (Button) findViewById(R.id.botao);
        imagem = (ImageView) findViewById(R.id.imagem);



        botao.setOnClickListener((View.OnClickListener) this);

    }


    public void onClick(View w) {
        int [] image  = {R.drawable.andre, R.drawable.serufo, R.drawable.sibalsky};
        imagem.setImageResource(image[0]);

    }
}
