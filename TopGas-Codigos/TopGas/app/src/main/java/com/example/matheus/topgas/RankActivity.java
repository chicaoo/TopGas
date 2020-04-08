package com.example.matheus.topgas;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.example.matheus.topgas.Conexao.ConectaWebServices;
import com.example.matheus.topgas.Dados.Gasolina;
import com.example.matheus.topgas.Dados.Posto;

import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;

public class RankActivity extends AppCompatActivity {

    FloatingActionButton btnVoltar;
    ListView lstDados;
    ArrayList<Posto> lista;
    public ListAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        StringBuilder resposta = new StringBuilder();

        lstDados = (ListView) findViewById(R.id.lstDados);
        Gson gson = new Gson();

        //lstDados.setAdapter();




        /*
        Type listtype = new TypeToken<ArrayList<lista>>(){}.getType();
        lista.add(return new Gson().fromJson(resposta.toString(), Posto.class));
        */

        btnVoltar = (FloatingActionButton) findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent voltarMenu = new Intent(RankActivity.this, MainActivity.class);
                startActivity(voltarMenu);
            }
        });



        lstDados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent informacoes = new Intent(RankActivity.this, MostraInfoGas.class);
                startActivity(informacoes);
            }
        });

    }
}
