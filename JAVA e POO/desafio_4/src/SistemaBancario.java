import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) throws Exception {
        String nome = "Tony Stark";
        String tipoConta = "Corrente";
        double saldo = 3600085.00;
        int opcao = 0;

        System.out.println("========================================");
        System.out.println("Seja Bem Vindo ao Sistema do Banco Tech");
        System.out.println("========================================");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo atual: R$ %.2f", saldo);
        System.out.println("\n========================================");

        String menu = """
                \n*** MENU DE OPÇÕES ***
                ========================================
                1. Consultar saldo
                2. Transferir valor
                3. Receber valor
                4. Sair
                ========================================
                """;

        Scanner teclado = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = teclado.nextInt();
            if (opcao == 1) {
                System.out.println("O saldo atualizado é de: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = teclado.nextDouble();
                if (valor > saldo) {
                    System.out.println(
                            "Saldo insuficiente em sua conta para realizar a transferência desejada, digite um valor correspondente ao saldo disponível.");
                } else {
                    saldo -= valor;
                    System.out.println("O novo saldo em sua conta é de: R$ " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Transferência recebida: R$ ");
                double valor = teclado.nextDouble();
                saldo += valor;
                System.out.println("Seu saldo atualizado é de: R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}