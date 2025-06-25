public class Formatando {
    public static void main(String[] args) throws Exception {
        String nome = "Andrielly";
        int idade = 30;
        double valor = 41.00;

        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei R$ %.2f reais", nome, idade, valor));
    }
}
