public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double calcularMedia() {
        return somaAvaliacoes / numAvaliacoes;
    }
}
