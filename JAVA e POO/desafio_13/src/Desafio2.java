public class Desafio2 implements Comparable<Desafio2> {
    private String nome;

    public Desafio2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Desafio2 outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
