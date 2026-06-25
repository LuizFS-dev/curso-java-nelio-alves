import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            var X = sc.nextInt();
            var Y = sc.nextInt();
            if (X == 0 || Y == 0) {
                break;
            } else if (X > 0 && Y > 0) {
                System.out.println("primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }

        sc.close();
    }

}
