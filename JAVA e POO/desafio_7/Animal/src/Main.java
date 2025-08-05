public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println("Cachorro:");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("\nGato:");
        gato.emitirSom();
        gato.arranharMoveis();
    }
}