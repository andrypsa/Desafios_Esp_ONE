import java.util.Scanner;      
public class Emprestimo{      
    public static void main(String[] args) {      
        Scanner teclado = new Scanner(System.in);      
        System.out.print("Digite o valor do empréstimo: ");      
        int valor = teclado.nextInt();      

        if (valor >= 1000 && valor <= 5000) {      
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");      
        } else {      
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");      
        }      
        teclado.close();      
    }      
}   
