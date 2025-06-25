public class DolarParaReal {
    public static void main(String[] args) throws Exception {

        double valorEmDolares = 106.00;
        double cotacaoDolar = 4.94;
        // calculo para descobrir qual valor em reais é correspondente à cotação do dolar.
        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.println(String.format("U$ %.2f doláres, equivalem a R$ %.2f reais.", valorEmDolares, valorEmReais));
    }
}
