import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        // Declarando a lista como a interface List (polimorfismo)
        List<String> lista;

        // Usando ArrayList
        lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C#");

        System.out.println("Lista como ArrayList:");
        for (String s : lista) {
            System.out.println(s);
        }

        // Usando LinkedList
        lista = new LinkedList<>();
        lista.add("HTML");
        lista.add("CSS");
        lista.add("JavaScript");

        System.out.println("\nLista como LinkedList:");
        for (String s : lista) {
            System.out.println(s);
        }
    }
}

