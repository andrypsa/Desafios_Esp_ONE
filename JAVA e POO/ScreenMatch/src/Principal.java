import br.com.andry.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.andry.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.andry.ScreenMatch.modelos.Episodio;
import br.com.andry.ScreenMatch.modelos.Filme;
import br.com.andry.ScreenMatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilmeFavorito = new Filme();
        meuFilmeFavorito.setNome("A fuga das galinhas");
        meuFilmeFavorito.setAnoDeLancamento(2000);
        meuFilmeFavorito.setDuracaoEmMinutos(84);
        meuFilmeFavorito.setIncluidoNoPlano(true);
        meuFilmeFavorito.setNotaImdb(7.1);
        meuFilmeFavorito.setQualidadeFilme("HD");
        System.out.println("Duração do filme: " + meuFilmeFavorito.getDuracaoEmMinutos());

        meuFilmeFavorito.exibeFichaTecnica();
        meuFilmeFavorito.avalia(5);
        meuFilmeFavorito.avalia(6);
        meuFilmeFavorito.avalia(9);

        System.out.println("Total de avaliações: " + meuFilmeFavorito.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações do filme foi de: " + meuFilmeFavorito.obterMedia());
        // meuFilmeFavorito.somaDasAvaliacoes = 10;
        // meuFilmeFavorito.totalDeAvaliacoes = 1;
        System.out.println(meuFilmeFavorito.obterMedia());

        Serie smallville = new Serie();
        smallville.setNome("Smallville");
        smallville.setAnoDeLancamento(2001);
        smallville.exibeFichaTecnica();
        smallville.setTemporadas(10);
        smallville.setEpisodiosPorTemporada(22);
        smallville.setMinutosPorEpisodio(42);
        System.out.println("Duração para maratonar Smallville: " + smallville.getDuracaoEmMinutos());

        Filme novoFilmeFavorito = new Filme();
        novoFilmeFavorito.setNome("Uma sexta-feira muito louca");
        novoFilmeFavorito.setAnoDeLancamento(2003);
        novoFilmeFavorito.setDuracaoEmMinutos(97);
        novoFilmeFavorito.setIncluidoNoPlano(true);
        novoFilmeFavorito.setNotaImdb(6.4);
        novoFilmeFavorito.setQualidadeFilme("HD");
        System.out.println("Duração do filme: " + novoFilmeFavorito.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilmeFavorito);
        calculadora.inclui(novoFilmeFavorito);
        calculadora.inclui(smallville);
        System.out.println("O tempo total para maratonar tudo é de: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilmeFavorito);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(smallville);
        ep.setTotalVisualizacoes(300);
        filtro.filtrar(ep);
    }

}
