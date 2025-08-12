public class Principal {
public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3000.0);
        Servico s = new Servico("Manutenção", 100.0);

        p.aplicarDesconto(10);
        s.aplicarDesconto(5);

        System.out.println("Preço total do produto: " + p.calcularPrecoTotal(2));
        System.out.println("Preço total do serviço: " + s.calcularPrecoTotal(3));
    }
}
