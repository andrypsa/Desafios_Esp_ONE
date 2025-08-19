
import java.util.Scanner;

public class Numeros {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = teclado.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = teclado.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
