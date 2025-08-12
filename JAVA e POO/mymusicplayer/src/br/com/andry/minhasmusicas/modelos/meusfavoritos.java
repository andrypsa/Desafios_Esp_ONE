package br.com.andry.minhasmusicas.modelos;

public class meusfavoritos {
    public void inclui(audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e " + "preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é uma excelente opção para momentos de lazer!");
        }
    }
}
