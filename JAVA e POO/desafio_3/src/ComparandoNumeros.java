import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo.");
        } else {
            System.out.println("O segundo número é maior que o primeiro.");
        }

        teclado.close();
    }
}