import java.util.*;

public class Exercicio07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        double Y = sc.nextDouble();
        String posicao;

        if (X == 0.0 && Y == 0.0) {
            posicao = "Origem";
        } else if (X == 0.0) {
            posicao = "Eixo Y";
        } else if (Y == 0.0) {
            posicao = "Eixo X";
        } else if (X > 0 && Y > 0) {
            posicao = "Q1";
        } else if (X < 0 && Y > 0) {
            posicao = "Q2";
        } else if (X < 0 && Y < 0) {
            posicao = "Q3";
        } else {
            posicao = "Q4";
        }

        System.out.println(posicao);

        sc.close();
    }

}
