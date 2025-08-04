public class IdadeMain {
    public static void main(String[] args) {
        Idade pessoa1 = new Idade();
        pessoa1.setNome("Gisele");
        pessoa1.setIdade(23);

        Idade pessoa2 = new Idade();
        pessoa2.setNome("Tod");
        pessoa2.setIdade(18);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();

        System.out.println(pessoa1.getNome() + " tem " + (pessoa1.getIdade() + " anos e " + (pessoa2.getNome() + " tem " + (pessoa2.getIdade() + " anos. "))));
    }
}