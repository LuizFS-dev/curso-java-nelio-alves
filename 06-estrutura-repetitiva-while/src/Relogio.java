/*
 * TODO: POTENCIAL UPDATE FUTURA - CONVERSOR HISTÓRICO ACUMULADO
  
 * Conceito:
    Calcular o total de dias decorridos desde a transição para o Calendário Gregoriano 
    (15 de outubro de 1582) e aplicar a métrica do Calendário Fixo Internacional (Cotsworth) 
    retroativamente de forma cumulativa até o presente.
  
 *  Fluxo Lógico Proposto:
    1. Estabelecer o marco zero em 1582 e calcular a massa total de dias passados até o milisegundo atual.
    2. Descontar e recalcular as regras de anos bissextos específicos de cada sistema ao longo dos séculos.
    3. Redistribuir essa contagem total de dias na estrutura Cotsworth (13 meses de 28 dias + Year Day).
    4. Renderizar o horário atual convertido com base no desvio histórico real acumulado.
 */

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
