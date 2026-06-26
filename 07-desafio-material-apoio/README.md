# Módulo 07: Outros Tópicos Básicos (Funções e Sintaxe)

*Data de execução: Junho de 2026*

Este módulo serve como um bloco de transição entre a lógica estruturada e os conceitos iniciais de modularização. Pratiquei a criação de subprogramas (funções/métodos estáticos) para isolar responsabilidades e manter o método principal limpo.

## Exercícios e Desafios

* [DesafioApex.java](./src/DesafioApex.java) - Resolução do problema exemplo para leitura de três números inteiros e identificação do maior valor. 

### O que pratiquei neste código:
* **Modularização de Lógica:** Criação do método `max(int X, int Y, int Z)` usando uma variável auxiliar (`aux`) e desvios condicionais para isolar o algoritmo de checagem.
* **Isolamento de Saída:** Implementação do método `showResult(int value)` dedicado exclusivamente à exibição formatada do resultado no terminal, limpando o escopo do `main`.
* **Assinatura e Escopo:** Prática com passagem de parâmetros por valor e entendimento de escopo de variáveis locais.

## Conceitos Compreendidos

* A importância de quebrar um problema grande em funções menores para reaproveitamento de código, aplicaçao do conceito DRY e organização visual.
* Como o método `main` deve funcionar idealmente apenas como o "orquestrador" do fluxo, delegando o processamento pesado e a exibição para blocos especializados.