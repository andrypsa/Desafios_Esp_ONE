import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Farinha e trigo", 7.99, 3);
        Produto produto2 = new Produto("Fermento em pó", 6.49, 1);
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Leite", 4.99, 3, "2025-09-15");

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        System.out.println("\nLista de produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("\nCriando um novo produto:");
        Produto produtoNovo = new Produto("Chocolate em pó", 15.99, 1);
        System.out.println(produtoNovo);

        System.out.println("\nCriando um produto perecível:");
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Ovos", 10.75, 30, "2025-08-31");
        System.out.println(produtoPerecivel);
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
}

class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " - Data de Validade: " + dataValidade;
    }
}
