import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("3. Sair.");
        
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = teclado.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é: " + areaQuadrado);

        } else if (opcao == 2) {
            System.out.print("Digite o valor do raio do círculo: ");
            double raio = teclado.nextDouble();
            double areaCirculo = 3.14 * raio * raio;
            System.out.println("A área do círculo é: " + areaCirculo);

        } else if (opcao == 3) {
            System.out.println("Programa encerrado!");

        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }

        teclado.close();
    }
}
