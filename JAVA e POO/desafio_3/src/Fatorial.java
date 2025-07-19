import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = teclado.nextInt();

    int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }