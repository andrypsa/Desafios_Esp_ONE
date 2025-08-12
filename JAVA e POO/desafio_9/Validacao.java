import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        final String SENHA_CORRETA = "123456";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String tentativa = teclado.nextLine();
        teclado.close();

        if (tentativa.equals(SENHA_CORRETA)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}