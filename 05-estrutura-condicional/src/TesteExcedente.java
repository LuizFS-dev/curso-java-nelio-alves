import java.util.Locale;
import java.util.Scanner;

public class TesteExcedente{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int consMinutos = sc.nextInt();
        double valConta = 50.00;
        
        if (consMinutos > 100) {
            valConta += (consMinutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f\n", valConta);

        sc.close();
    }
}