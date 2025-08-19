import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Terra");
        nomes.add("Agua");
        nomes.add("Ar");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}