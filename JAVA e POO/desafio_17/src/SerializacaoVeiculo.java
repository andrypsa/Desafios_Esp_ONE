import com.google.gson.Gson;

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
}

public class SerializacaoVeiculo {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2023);

        Gson gson = new Gson();

        String json = gson.toJson(veiculo);

        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(json);
    }
}
