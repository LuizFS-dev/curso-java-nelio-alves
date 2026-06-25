import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            if (X % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

}
