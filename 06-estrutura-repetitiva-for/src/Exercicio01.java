import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        var X = sc.nextInt();
        
        for (int i = 1; i <= X; i += 2) {
           System.out.println(i);
        }

        sc.close();
    }
}
