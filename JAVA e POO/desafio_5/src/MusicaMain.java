public class MusicaMain {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Caviar";
        minhaMusica.artista = "Zeca Pagodinho";
        minhaMusica.anoLancamento = 2002;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avaliar(7);
        minhaMusica.avaliar(4);
        minhaMusica.avaliar(9.1);

        System.out.println("Número de avaliações: " + minhaMusica.numAvaliacoes);
        System.out.println("Média das avaliações: " + minhaMusica.calcularMedia());
    }
}