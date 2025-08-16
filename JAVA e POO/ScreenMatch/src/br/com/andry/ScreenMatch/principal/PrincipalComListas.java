package br.com.andry.ScreenMatch.principal;

import br.com.andry.ScreenMatch.modelos.Filme;
import br.com.andry.ScreenMatch.modelos.Serie;
import br.com.andry.ScreenMatch.modelos.Titulo;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilmeFavorito = new Filme("A fuga das galinhas", 2000);
        meuFilmeFavorito.avalia(10);
        Filme novoFilmeFavorito = new Filme("Uma sexta-feira muito louca", 2003);
        novoFilmeFavorito.avalia(9);
        var filmeDaAndry = new Filme("The Avangers", 2012);
        Serie serie = new Serie("Smallville", 2001);

        Filme f1 = filmeDaAndry;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaAndry);
        lista.add(meuFilmeFavorito);
        lista.add(novoFilmeFavorito);
        lista.add(serie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }
    }
}