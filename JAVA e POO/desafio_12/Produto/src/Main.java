import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 20.0));
        produtos.add(new Produto("Feijão", 12.0));
        produtos.add(new Produto("Macarrão", 8.0));

        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }

        double media = soma / produtos.size();
        System.out.println("Preço médio dos produtos: " + media);
    }
}