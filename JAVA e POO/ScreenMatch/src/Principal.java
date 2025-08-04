import br.com.andry.ScreenMatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilmeFavorito = new Filme();
        meuFilmeFavorito.setNome("A fuga das galinhas");
        meuFilmeFavorito.setAnoDeLancamento(000);
        meuFilmeFavorito.setDuracaoEmMinutos(84);
        meuFilmeFavorito.setIncluidoNoPlano(true);
        meuFilmeFavorito.setNotaImdb(7.1);
        meuFilmeFavorito.setQualidadeFilme("HD");

        meuFilmeFavorito.exibeFichaTecnica();
        meuFilmeFavorito.avalia(5);
        meuFilmeFavorito.avalia(6);
        meuFilmeFavorito.avalia(9);

        System.out.println("Total de avaliações: " + meuFilmeFavorito.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações do filme foi de: " + meuFilmeFavorito.obterMedia());
        // meuFilmeFavorito.somaDasAvaliacoes = 10;
        // meuFilmeFavorito.totalDeAvaliacoes = 1;
        System.out.println(meuFilmeFavorito.obterMedia());

    }
}
