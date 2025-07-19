import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != 11) {
            System.out.println("Qual sua nota de avaliação de 0 a 10 para este filme? Digite 11 para sair");
            nota = leitura.nextDouble();

            if (nota != 11) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }

        }
        System.out.println("Média de avaliações: " + mediaAvaliacao / 3);
    }
}
