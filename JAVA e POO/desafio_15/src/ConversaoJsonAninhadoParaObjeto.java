import com.google.gson.Gson;

record Editora(String nome, String cidade) {}
record Livro(String titulo, String autor, Editora editora) {}

public class ConversaoJsonAninhadoParaObjeto {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"O Resgate\",\"autor\":\"Sparks\",\"editora\":{\"nome\":\"Arqueiro\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
