public class Produto {
    protected double preco; // protected para permitir acesso pelas subclasses

    public Produto(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
