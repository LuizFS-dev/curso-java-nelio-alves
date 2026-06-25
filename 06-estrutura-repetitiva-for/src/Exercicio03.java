import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        var X = sc.nextInt();

        for (int i = 0; i < X; i++) {
            var n1 = sc.nextDouble();
            var n2 = sc.nextDouble();
            var n3 = sc.nextDouble();
            double soma = (((n1 * 0.6) + n2 * 0.9) + n3 * 1.5) / 3;
            // Para maior precisao evitar mult/soma c números quebrados.
            // double soma = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10;
            System.out.printf("%.1f\n", soma);
        }
        sc.close();
    }
}
