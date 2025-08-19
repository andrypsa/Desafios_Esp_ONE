import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Titulo {
    private String nome;
    private int ano;
    private String autor;

    public Titulo(String nome, int ano, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome() { return nome; }
    public int getAno() { return ano; }
    public String getAutor() { return autor; }
}

public class SerializacaoTituloPretty {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Dom Casmurro", 1899, "Machado de Assis");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(titulo);

        System.out.println("Objeto serializado para JSON formatado:");
        System.out.println(json);
    }
}
