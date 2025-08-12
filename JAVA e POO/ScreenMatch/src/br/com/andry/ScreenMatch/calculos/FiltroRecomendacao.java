package br.com.andry.ScreenMatch.calculos;

public class FiltroRecomendacao {
    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("É um bom filme para assistir depois");
        }
    }
}