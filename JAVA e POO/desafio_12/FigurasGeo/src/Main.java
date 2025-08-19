import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3));
        formas.add(new Quadrado(4));

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}