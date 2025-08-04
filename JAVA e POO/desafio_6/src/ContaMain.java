public class ContaMain {
    public static void main(String[] args) {
        Conta ContaMain = new Conta();
        ContaMain.setNumeroConta(123);
        ContaMain.setSaldo(2500);
        ContaMain.titular = "Divina";

        System.out.println("Titular: " + ContaMain.titular);
        System.out.println("Número da Conta: " + ContaMain.getNumeroConta());
        System.out.println("Saldo: R$ " + ContaMain.getSaldo());

        ContaMain.setSaldo(3500);
        System.out.println("Novo Saldo: " + ContaMain.getSaldo());
    }
}