import com.google.gson.Gson;

class Titulo {
    private String nome;
    private int ano;
    private String autor;

    public Titulo(String nome, int ano, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }
}

public class SerializacaoTitulo {
    public static void main(String[] args) {

        Titulo titulo = new Titulo("Dom Casmurro", 1899, "Machado de Assis");

        Gson gson = new Gson();

        String json = gson.toJson(titulo);

        System.out.println("Objeto serializado para JSON:");
        System.out.println(json);
    }
}