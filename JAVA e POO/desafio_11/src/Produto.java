public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor com parâmetros
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    }
}
