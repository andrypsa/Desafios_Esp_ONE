import java.util.Scanner;     

public class DiaDaSemana {     
    public static void main(String[] args) {      
        Scanner teclado = new Scanner(System.in);    
        System.out.print("Digite o dia da semana (em letras minúsculas): ");      
        String dia = teclado.nextLine(); 
        teclado.close();      

        if (dia.equals("segunda") || dia.equals("terca") ||      
            dia.equals("quarta") || dia.equals("quinta") ||      
            dia.equals("sexta")) {      
            System.out.println(dia + " é um dia útil.");      
        } else {      
            System.out.println(dia + " não é um dia útil.");      
        }      
    }      
}   