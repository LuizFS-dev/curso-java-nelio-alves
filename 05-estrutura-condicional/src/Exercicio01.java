import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int X = sc.nextInt();

        String resultado = (X > 0) ? "POSITIVO" : "NAO NEGATIVO";

        System.out.println(resultado);

        sc.close();
    }

}
