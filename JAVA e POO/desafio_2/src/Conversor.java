public class Conversor {
    public static void main(String[] args) throws Exception {

        double var1 = 3.5;
        //convertendo valor de double para int.
        int numeroInteiro = (int) var1;

        System.out.println("Valor original (double): " + var1);
        System.out.println("Valor após casting (int): " + numeroInteiro);
    }
}