import java.util.*;

public class Exercicio08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var renda = sc.nextDouble();
        double imposto = 0.0;

        if (renda > 4500) {
            imposto += (renda - 4500) * 0.28;
            renda = 4500;
        } if (renda > 3000) {
            imposto += (renda - 3000) * 0.18;
            renda = 3000;
        } if (renda > 2000) {
            imposto += (renda - 2000) * 0.08;
            renda = 2000;
        } if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}
