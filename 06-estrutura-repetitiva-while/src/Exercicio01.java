import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha = 2002;

        while(true) {
            var X = sc.nextInt();
            if (X != senha) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                break;
            }
        }
        sc.close();
    }
}
