import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {
                
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        var X = sc.nextInt();

        for (int i = 0; i < X; i++) {
            
            var n1 = sc.nextDouble();
            var n2 = sc.nextDouble();
            if(n2 == 0){
                System.out.println("HERESIA!!!");
            } else {
                double soma = n1 / n2;
                System.out.printf("%.1f\n", soma);
            }
        }
        sc.close();
    }

}
