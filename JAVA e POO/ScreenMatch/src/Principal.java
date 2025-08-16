import br.com.andry.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.andry.ScreenMatch.calculos.FiltroRecomendacao;
import br.com.andry.ScreenMatch.modelos.Episodio;
import br.com.andry.ScreenMatch.modelos.Filme;
import br.com.andry.ScreenMatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilmeFavorito = new Filme("A fuga das galinhas", 2000);
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

        Serie smallville = new Serie("Smallville", 2001);
        smallville.exibeFichaTecnica();
        smallville.setTemporadas(10);
        smallville.setEpisodiosPorTemporada(22);
        smallville.setMinutosPorEpisodio(42);
        System.out.println("Duração para maratonar Smallville: " + smallville.getDuracaoEmMinutos());

        Filme novoFilmeFavorito = new Filme("Uma sexta-feira muito louca", 2003);
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

        var filmeDaAndry = new Filme("The Avangers", 2012);
        filmeDaAndry.setDuracaoEmMinutos(143);
        filmeDaAndry.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaAndry);
        listaDeFilmes.add(meuFilmeFavorito);
        listaDeFilmes.add(novoFilmeFavorito);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}