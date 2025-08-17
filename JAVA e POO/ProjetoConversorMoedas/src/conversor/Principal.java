package conversor;

import java.util.Map;
import java.util.Scanner;

public class Principal {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        ConversorMoedas conversor = new ConversorMoedas();

        if (!conversor.carregarTaxas("USD")) {
            System.out.println("Não foi possível carregar as taxas. Verifique sua API key.");
            teclado.close();
            return;
        }

        boolean continuarPrograma = true;

        while (continuarPrograma) {
            int opcao = lerOpcaoMenu();
            if (opcao == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            String moedaDestino = getMoeda(opcao);
            if (moedaDestino == null) {
                if (!perguntaContinuar("Opção inválida. Deseja tentar novamente? (s/n): ")) {
                    System.out.println("Programa encerrado.");
                    break;
                } else {
                    continue;
                }
            }

            Double valor = lerValor();
            if (valor == null) {
                if (!perguntaContinuar("Valor inválido. Deseja tentar novamente? (s/n): ")) {
                    System.out.println("Programa encerrado.");
                    break;
                } else {
                    continue;
                }
            }

            try {
                double resultado = conversor.converter("USD", moedaDestino, valor);
                System.out.printf("%.2f USD -> %s = %.2f%n", valor, moedaDestino, resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro na conversão: " + e.getMessage());
            }

            if (!perguntaContinuar("Deseja fazer outra conversão? (s/n): ")) {
                System.out.println("Programa encerrado.");
                break;
            }
        }

        teclado.close();
    }

    private static int lerOpcaoMenu() {
        System.out.println("\n=== Conversor de Moedas ===");
        System.out.println("Escolha a opção:");
        System.out.println("1 - USD -> ARS");
        System.out.println("2 - USD -> BOB");
        System.out.println("3 - USD -> BRL");
        System.out.println("4 - USD -> CLP");
        System.out.println("5 - USD -> COP");
        System.out.println("6 - USD -> USD");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");

        if (teclado.hasNextInt()) {
            return teclado.nextInt();
        } else {
            teclado.next(); // descarta entrada inválida
            return -1;
        }
    }

    private static String getMoeda(int opcao) {
        switch (opcao) {
            case 1: return "ARS";
            case 2: return "BOB";
            case 3: return "BRL";
            case 4: return "CLP";
            case 5: return "COP";
            case 6: return "USD";
            default: return null;
        }
    }

    private static Double lerValor() {
        System.out.print("Digite o valor em USD: ");
        if (teclado.hasNextDouble()) {
            return teclado.nextDouble();
        } else {
            teclado.next(); // descarta entrada inválida
            return null;
        }
    }

    private static boolean perguntaContinuar(String mensagem) {
        System.out.print(mensagem);
        String resposta = teclado.next();
        return resposta.equalsIgnoreCase("s");
    }
}