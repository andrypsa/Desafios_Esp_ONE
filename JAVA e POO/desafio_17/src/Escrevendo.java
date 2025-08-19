import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escrevendo {
    public static void main(String[] args) {

        String nomeArquivo = "arquivo.txt";
        
        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter fw = new FileWriter(nomeArquivo);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(conteudo); 
            pw.close();           
            fw.close();           

            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
