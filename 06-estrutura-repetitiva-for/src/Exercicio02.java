import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        var N = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < N; i++) {
            var X = sc.nextInt();
            if (X >= 10 && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in\n%d out", in, out );
        
        sc.close();
    }
}
