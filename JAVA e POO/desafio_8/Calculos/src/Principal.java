public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro(50.0, "Autor X");
        ProdutoFisico produtoFisico = new ProdutoFisico(100.0);

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produtoFisico.calcularPrecoFinal());
    }
}