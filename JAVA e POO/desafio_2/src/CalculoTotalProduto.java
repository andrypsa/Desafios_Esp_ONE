public class CalculoTotalProduto {
    public static void main(String[] args) throws Exception {

        double precoProduto = 25.90;
        int quantidade = 6;
       
        double valorTotal = precoProduto * quantidade;

        System.out.println(String.format("O valor total dos produtos é de R$ %.2f reais.", valorTotal));
    }
}
