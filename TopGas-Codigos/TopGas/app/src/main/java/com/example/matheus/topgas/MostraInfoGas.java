package com.example.matheus.topgas;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;


public class MostraInfoGas extends AppCompatActivity {


    EditText txtPosto;
    EditText txtCor;
    EditText txtAspecto;
    EditText txtTeorAlcool;
    EditText txtOctanagem;
    EditText txtComposicao;
    EditText txtDestilacao;
    EditText txtValor;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_info_gas);

        txtPosto = (EditText) findViewById(R.id.txtPosto);
        txtCor = (EditText) findViewById(R.id.txtCor);
        txtAspecto = (EditText) findViewById(R.id.txtAspecto);
        txtTeorAlcool = (EditText) findViewById(R.id.txtTeorAlcool);
        txtOctanagem = (EditText) findViewById(R.id.txtOctanagem);
        txtComposicao = (EditText) findViewById(R.id.txtComposicao);
        txtDestilacao = (EditText) findViewById(R.id.txtDestilacao);
        txtValor = (EditText) findViewById(R.id.txtValor);




    }
}
