import java.util.Scanner;
public class Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2 + ".");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        teclado.close();
    }
}
