import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Desafio2> titulos = new ArrayList<>();
        titulos.add(new Desafio2("Matrix"));
        titulos.add(new Desafio2("Avatar"));
        titulos.add(new Desafio2("Inception"));
        titulos.add(new Desafio2("Interestelar"));

        Collections.sort(titulos);

        System.out.println("Títulos ordenados:");
        for (Desafio2 t : titulos) {
            System.out.println(t);
        }
    }
}
