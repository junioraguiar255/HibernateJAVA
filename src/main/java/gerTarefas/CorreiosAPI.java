/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerTarefas;

import dominio.Endereco;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;


public class CorreiosAPI {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public static Endereco buscarEndereco(String cep) {
        try {
            // Monta a URL de busca com o CEP informado
            URL url = new URL(BASE_URL + cep + "/json/");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");

            // Realiza a conexão e lê a resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String linha;
            StringBuilder resposta = new StringBuilder();
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();

            // Parseia a resposta em um objeto Endereco
            Endereco endereco = parseResposta(resposta.toString());

            return endereco;

        } catch (Exception e) {
            System.out.println("Erro ao buscar endereço: " + e.getMessage());
            return null;
        }
    }

    private static Endereco parseResposta(String resposta) {
        System.out.println("Resposta: " + resposta); // Debug

        // Faz o parse da resposta em um objeto Endereco
        Gson gson = new Gson();
        Endereco endereco = gson.fromJson(resposta, Endereco.class);

        //System.out.println("cep: " + endereco.getCep()); // Debug
       // System.out.println("logradouro: " + endereco.getLogradouro()); // Debug
       // System.out.println("complemento: " + endereco.getComplemento()); // Debug
        //System.out.println("bairro: " + endereco.getBairro()); // Debug
       // System.out.println("localidade: " + endereco.getLocalidade()); // Debug
        //System.out.println("uf: " + endereco.getUf()); // Debug

    return endereco;
    }




    private static String getValorCampo(String resposta, String campo) {
        // Extrai o valor do campo na resposta JSON
        String padrao = "\"" + campo + "\":\"";
        int posicao = resposta.indexOf(padrao);
        if (posicao < 0) {
            return "";
        }
        int inicio = posicao + padrao.length();
        int fim = resposta.indexOf("\"", inicio);
        return resposta.substring(inicio, fim);
    }
}
