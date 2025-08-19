
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("001", 1500.0));
        contas.add(new ContaBancaria("002", 2500.0));
        contas.add(new ContaBancaria("003", 1800.0));

        ContaBancaria maiorSaldo = contas.get(0);

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta;
            }
        }

        System.out.println("Conta com maior saldo: " + maiorSaldo.getNumeroConta() + " - Saldo: " + maiorSaldo.getSaldo());
    }
}