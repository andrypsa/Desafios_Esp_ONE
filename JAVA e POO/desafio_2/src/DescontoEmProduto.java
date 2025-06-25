public class DescontoEmProduto {
    public static void main(String[] args) throws Exception {

        double precoOriginal = 87.00;
        double percentualDesconto = 10.0;
        // calculo para descobrir qual será o valor do desconto em cima do produto.
        double valorDeDesconto = precoOriginal * (percentualDesconto / 100);
        // calculo para encontrar o valor final a ser pago no produto com desconto.
        double precoComDesconto = precoOriginal - valorDeDesconto;

        System.out.println(String.format("O produto que era no valor de R$ %.2f reais, teve um desconto de R$ %.2f e ficou com o valor final de %.2f reais após o cálculo do desconto.", precoOriginal, valorDeDesconto, precoComDesconto));
    }
}
