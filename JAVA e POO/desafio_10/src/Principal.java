import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(new Pessoa("Ana", 25));
        listaDePessoas.add(new Pessoa("Bruno", 30));
        listaDePessoas.add(new Pessoa("Carla", 28));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa: " + listaDePessoas.get(0));

        System.out.println("\nLista completa:");
        for (Pessoa p : listaDePessoas) {
            System.out.println(p);
        }
    }
}