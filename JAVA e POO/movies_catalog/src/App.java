public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Diário de uma paixão");

        int anoDeLancamento = 2004;
        System.out.println("O ano de lançamento foi: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaImdb = 7.8;

        double media = (8.3 + 4.5 + 6.1) / 3;
        System.out.println(media);
        String sinopse;
        // Text block //
        sinopse = """ 
        Duke é um senhor que vive em uma clínica de repouso e lê diariamente um diário para uma paciente com Alzheimer, na esperança de que ela recupere a memória. O diário conta a história de amor entre Allie e Noah, jovens apaixonados que foram separados por circunstâncias da vida, mas se reencontram anos depois.
        Allie, já noiva de outro homem, precisa escolher entre a segurança e o amor verdadeiro. Com o tempo, fica claro que a história narrada é, na verdade, a do próprio Duke, que acredita no poder do amor para superar até as barreiras da memória e da doença.
        """;
        System.out.println(sinopse);
        //introduzindo o conceito de casting explícito -(int)-//
        int classificacao = (int) (media /2);
        System.out.println("Este filme obteve a classificação geral de " + classificacao + " estrelas.");
    }
}
