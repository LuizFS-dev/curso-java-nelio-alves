import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "PAR" : "IMPAR";

        System.out.println(resultado);

        sc.close();
    }
}