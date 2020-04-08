package com.example.matheus.topgas.Conexao;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.matheus.topgas.Dados.Posto;
import com.google.gson.Gson;
import java.util.Scanner;

@RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
public class ConectaWebServices extends AsyncTask<Void, Void, Posto> {

    private final Posto posto;
    public ConectaWebServices(Posto posto){
        this.posto = posto;

    }



    @Override
    protected Posto doInBackground(Void... voids) {
        StringBuilder resposta = new StringBuilder();

        if (this.posto != null){
            try {
                URL url = new URL("http://www.aegissolucoes.com.br/topgas/ws/posto/ler.php" + this.posto);

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Content-type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                connection.setDoOutput(true);
                connection.setConnectTimeout(5000);
                connection.connect();

                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    resposta.append(scanner.next());
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return new Gson().fromJson(resposta.toString(), Posto.class);
    }

  

}



