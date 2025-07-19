public class Conditional {
    public static void main(String[] args) {
        int anoDeLancamento = 2000;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 7.8;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2004) {
            System.err.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.err.println("Filme romântico que vale a pena assistir!");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme disponível.");
        } else {
            System.out.println("Filme disponível para locação.");
        }
    }
}
