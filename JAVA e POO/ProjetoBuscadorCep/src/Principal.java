import java.util.Scanner;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite um número de CEP para consultar:");
        var cep = teclado.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.saveJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
