import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        // ArrayList
        List<String> listaArray = new ArrayList<>();
        listaArray.add("A");
        listaArray.add("B");
        listaArray.add("C");

        System.out.println("ArrayList:");
        for (String s : listaArray) {
            System.out.println(s);
        }

        // LinkedList
        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("X");
        listaLinked.add("Y");
        listaLinked.add("Z");

        System.out.println("\nLinkedList:");
        for (String s : listaLinked) {
            System.out.println(s);
        }
    }
}