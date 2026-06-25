import java.util.*;

public class TesteDoWhile {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char loop = 's';

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            var X = sc.nextDouble();
            double farh = X * 9 / 5 + 32;
                        
            System.out.printf("Equivalente em fahrenheit: %.1f\n", farh);
            
            System.out.print("Deseja repetir (s/n)? ");
            loop = sc.next().charAt(0);
        } while (loop != 'n');

        sc.close();
    }
}
