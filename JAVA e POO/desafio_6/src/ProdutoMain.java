public class ProdutoMain {
    public static void main(String[] args) {
        Produto ProdutoMain  = new Produto("Fone de ouvido", 170.0);

        System.out.println("Produto: " + ProdutoMain.getNome());
        System.out.println("Preço original: R$ " + ProdutoMain.getPreco());

        ProdutoMain.aplicarDesconto(10); // aplica 10% de desconto

        System.out.println("Preço com desconto: R$ " + ProdutoMain.getPreco());
    }
}