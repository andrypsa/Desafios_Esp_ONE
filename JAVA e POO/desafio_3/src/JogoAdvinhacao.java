import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(10);
        int tentativas = 0;
        int numeroDigitado = 0;
        int maxTentativas = 5;

        while (tentativas < maxTentativas) {
        System.out.println("Jogo de Adivinhação: Tente adivinhar o número entre 0 e 10!");            
        int palpite = teclado.nextInt();
        tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break; 
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
        }

        if (tentativas == 5 && numeroAleatorio != numeroDigitado) {
            System.out.println("Fim de jogo. Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
        }
        teclado.close();
    }
}
