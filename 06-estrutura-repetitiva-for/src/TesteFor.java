import java.util.*;

public class TesteFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] vezes = new int[sc.nextInt()];
        int soma = 0;       

        for (int i = 0; i < vezes.length; i++) {
            int x = sc.nextInt();
            soma += x;
        }
        System.out.println("soma: " + soma);
        sc.close();
    }
}
