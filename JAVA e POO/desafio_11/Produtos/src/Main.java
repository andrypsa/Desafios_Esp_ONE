import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando lista de produtos
        List<Produto> produtos = new ArrayList<>();

        // Adicionando produtos com o construtor
        produtos.add(new Produto("Notebook", 3500.00, 2));
        produtos.add(new Produto("Mouse", 120.50, 5));
        produtos.add(new Produto("Teclado", 230.00, 3));

        // Imprimindo tamanho da lista
        System.out.println("Tamanho da lista: " + produtos.size());

        // Recuperando produto pelo índice
        System.out.println("Produto no índice 1: " + produtos.get(1));

        // Imprimindo todos os produtos (chama automaticamente o toString)
        System.out.println("\nLista de Produtos:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        // Criando um Produto Perecível
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 6.50, 10, LocalDate.of(2025, 9, 30));
        System.out.println("\nProduto Perecível:");
        System.out.println(leite);
    }
}
