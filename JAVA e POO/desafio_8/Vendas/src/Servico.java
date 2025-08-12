public class Servico implements Vendas {
    private String descricao;
    private double precoHora;

    public Servico(String descricao, double precoHora) {
        this.descricao = descricao;
        this.precoHora = precoHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas");
        }
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            throw new IllegalArgumentException("Desconto inválido");
        }
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
