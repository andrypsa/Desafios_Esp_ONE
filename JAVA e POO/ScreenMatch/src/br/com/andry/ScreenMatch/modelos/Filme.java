package br.com.andry.ScreenMatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double notaImdb;
    private int duracaoEmMinutos;
    private String qualidadeFilme;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getNotaImdb() {
        return this.notaImdb;
    }
    
    public void setNotaImdb(double notaImdb) {
        this.notaImdb = notaImdb;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getQualidadeFilme() {
        return this.qualidadeFilme;
    }
    
    public void setQualidadeFilme(String qualidadeFilme) {
        this.qualidadeFilme = qualidadeFilme;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }
}