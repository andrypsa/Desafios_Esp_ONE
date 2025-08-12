package br.com.andry.minhasmusicas.principal;

import br.com.andry.minhasmusicas.modelos.meusfavoritos;
import br.com.andry.minhasmusicas.modelos.musica;
import br.com.andry.minhasmusicas.modelos.podcast;

public class Principal {
    public static void main(String[] args) throws Exception {
        musica minhaMusica = new musica();
        minhaMusica.setTitulo("Birds of a feather");
        minhaMusica.setCantor("Billie Eilish");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("Codando");
        meuPodcast.setApresentador("Rogério Maiéra");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        meusfavoritos favoritos = new meusfavoritos();
        favoritos.inclui(meuPodcast);
        favoritos.inclui(minhaMusica);
    }
}