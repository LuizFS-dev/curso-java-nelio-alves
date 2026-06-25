# Módulo 06: Estrutura Repetitiva (While)

*Curso de Java e POO - Prof. Nélio Alves*
*Data de execução: Junho de 2026*

Nesta etapa, pratiquei a lógica de manter o bloco em execução enquanto uma condição específica for verdadeira. Pelo que entendi, parece ser ideal para cenários onde a quantidade de repetições não é predefinida (como validação de senhas ou leitura de dados até um ponto de parada).

## Exercícios Resolvidos

* [Exercicio01.java](./src/Exercicio01.java) - Validação de acesso com senha em loop, encerrando a execução apenas quando a entrada correta for informada.
* [Exercicio02.java](./src/Exercicio02.java) - Leitura contínua de coordenadas (X, Y) e classificação de quadrantes, parando quando um dos valores for nulo.
* [Exercicio03.java](./src/Exercicio03.java) - Simulação de sistema de posto de combustíveis: lê preferências de clientes e incrementa contadores, encerrando com um input específico.

## Projeto Autônomo: Simulador Fixo Internacional (Plano Cotsworth)

* [Relogio.java](./src/Relogio.java) - Implementação de um cronômetro e calendário baseado no Plano Cotsworth (13 meses de 28 dias).

### O que pratiquei neste projeto:
* **Simulação de Clock:** Uso de loop infinito `while (true)` controlado por pausas de execução de 1 segundo através do método `Thread.sleep()`.
* **Tratamento de Exceções:** Implementação de bloco `try-catch` para capturar e tratar a exceção `InterruptedException` exigida pela thread do sistema.
* **Lógica Cumulativa Complexa:** Encadeamento de estruturas condicionais para gerenciar o estouro de segundos, minutos, horas e a regra de transição do 13º mês que inclui o dia extra de virada de ano (que inclusive me fez ficar melhor em debuggar).
* **Formatação de Console:** Uso avançado de máscaras do `printf` (`%02d` e `%04d`) para garantir a exibição do relógio com zeros à esquerda.


## Conceitos Compreendidos
* Controle de loops através de variáveis de teste modificadas dentro do bloco.
* Prevenção de loops infinitos garantindo a atualização correta da condição de parada.
* Uso estrategico de variáveis predeterminadas para facilitar o debugging.  