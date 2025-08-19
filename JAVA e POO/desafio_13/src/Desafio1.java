import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(9);
        numeros.add(1);

        Collections.sort(numeros);

        System.out.println("Lista ordenada:");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}