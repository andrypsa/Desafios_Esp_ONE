import java.util.Scanner;
public class Descontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da compra: "); 
        double valorCompra = teclado.nextDouble(); 

        if (valorCompra >= 100.0) { 
            double desconto = valorCompra * 0.10; 
            double valorComDesconto = valorCompra - desconto; 
            System.out.printf("Desconto de 10%% aplicado.\nNovo valor: R$ %.2f\n", valorComDesconto); 
        } else { 
            System.out.printf("Desconto não aplicado.\nValor total: R$ %.2f\n", valorCompra); 
        } 

        teclado.close(); 
    } 
} 