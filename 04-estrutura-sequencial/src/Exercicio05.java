import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pec1, qte1, pec2, qte2;
        double val1, val2, total;

        pec1 = sc.nextInt();
        qte1 = sc.nextInt();
        val1 = sc.nextDouble();

        pec2 = sc.nextInt();
        qte2 = sc.nextInt();
        val2 = sc.nextDouble();

        total = qte1 * val1 + qte2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();

    }
}
