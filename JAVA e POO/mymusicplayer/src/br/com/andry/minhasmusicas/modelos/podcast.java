package br.com.andry.minhasmusicas.modelos;

public class podcast extends audio {
    private String apresentador;
    private String descricaoEp;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricaoEp() {
        return descricaoEp;
    }

    public void setDescricaoEp(String descricaoEp) {
        this.descricaoEp = descricaoEp;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
