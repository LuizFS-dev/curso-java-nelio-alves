import java.util.*;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        // Uma maaneira mais elegante? :p

        // String resultado = (A % B == 0 || B % A == 0) ? "Sao Multiplos" : "Nao sao
        // Multiplos";
        // System.out.println(resultado);

        if ((A % B == 0) || (B % A == 0)) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

    }

}
