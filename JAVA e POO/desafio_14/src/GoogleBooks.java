
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import static java.net.http.HttpClient.newHttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca: ");
        var tituloLivro = teclado.nextLine();

        String chave = "CHAVE_FICARÁ_AQUI";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;

        HttpClient client = newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

