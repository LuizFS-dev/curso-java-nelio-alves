public class Relogio {
    public static void main(String[] args) {

        int horas = 00, dias = 01;
        int minutos = 00, mes = 01;
        int segundos = 00, ano = 0001;

        while (true) {
            System.out.printf("DATA: %02d:%02d:%04d\nHORAS: %02d:%02d:%02d\n", dias, mes, ano, horas, minutos, segundos);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException stopWatch) {
                System.out.println("O cronometro parou!");
                break;
            }

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            if (horas == 24) {
                horas = 0;
                dias++;
            }
            if (dias == 29 && mes != 13) {
                dias = 01;
                mes++;
            } else if (dias == 30) {
                mes = 01;
                dias = 01;
                ano++;
            }

        }
    }
}
