import java.util.*;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hInicio, hFinal, duracao;

        hInicio = sc.nextInt();
        hFinal = sc.nextInt();

        duracao = (hInicio < hFinal) ? (hFinal - hInicio) : (24 - hInicio + hFinal);

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }

}
