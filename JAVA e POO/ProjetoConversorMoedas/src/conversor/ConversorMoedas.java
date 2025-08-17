package conversor;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class ConversorMoedas {

    private Map<String, Double> taxas;

    public ConversorMoedas() {
        this.taxas = new HashMap<>();
    }

    // Classe interna para mapear o JSON
    private class RatesResponse {
        Map<String, Double> conversion_rates;
    }

    public boolean carregarTaxas(String moedaBase) {
        try {
            String apiKey = "2524aedd1ba30509c9a724c2";
            String urlStr = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";
            URL url = new URL(urlStr);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            if (con.getResponseCode() != 200) {
                System.out.println("Erro ao acessar API: " + con.getResponseCode());
                return false;
            }

            Gson gson = new Gson();
            RatesResponse response = gson.fromJson(new InputStreamReader(con.getInputStream()), RatesResponse.class);

            // Filtra apenas as moedas do desafio
            String[] moedasDesafio = {"ARS", "BOB", "BRL", "CLP", "COP", "USD"};
            for (String moeda : moedasDesafio) {
                if (response.conversion_rates.containsKey(moeda)) {
                    taxas.put(moeda, response.conversion_rates.get(moeda));
                }
            }

            System.out.println("Conexão OK! Base: " + moedaBase);
            System.out.println("Taxas carregadas: " + taxas);
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao carregar taxas: " + e.getMessage());
            return false;
        }
    }

    public double converter(String moedaBase, String moedaDestino, double valor) {
        if (moedaBase.equals(moedaDestino)) {
            return valor;
        }
        Double taxa = taxas.get(moedaDestino);
        if (taxa == null) {
            throw new IllegalArgumentException("Moeda não disponível: " + moedaDestino);
        }
        return valor * taxa;
    }

    public Map<String, Double> getTaxas() {
        return new HashMap<>(taxas); // retorna cópia para segurança
    }
}