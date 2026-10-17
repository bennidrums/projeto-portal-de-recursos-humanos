# Portal de Recursos Humanos

Esse projeto foi desenvolvido como parte da atividade **M26 do curso Back-end Java da EBAC**.

A proposta foi criar um sistema simples de Recursos Humanos pelo terminal, colocando em prática os conceitos de Java e orientação a objetos que venho estudando.

## Funcionalidades

- Cadastrar funcionários e selecionar o cargo.
- Pesquisar funcionários pelo ID.
- Remover funcionários cadastrados.
- Listar os funcionários e seus cargos.
- Registrar horário de entrada e saída para os cargos que precisam bater ponto.
- Aplicar algumas regras de horário e calcular horas trabalhadas e horas extras.

Os cargos disponíveis são Analista, Assistente, Coordenador, Estagiário e Gerente. No projeto, Estagiários e Gerentes não registram ponto.

## Tecnologias e conceitos utilizados

- Java
- Programação Orientada a Objetos
- Classes, objetos e construtores
- Herança
- ArrayList para armazenar os funcionários durante a execução
- Scanner para receber dados pelo terminal
- LocalDateTime e LocalTime para trabalhar com horários
- Duration para calcular o tempo entre a entrada e a saída

## Como executar

1. Abra o projeto em uma IDE que suporte Java, como o IntelliJ IDEA.
2. Confira se o JDK está configurado.
3. Execute a classe `CadastroFuncionarioMain`.
4. Use o menu exibido no terminal para testar as opções.

## Observação

Os funcionários são armazenados em uma lista na memória durante a execução do programa. Por isso, os dados não ficam salvos quando o programa é encerrado.

## Objetivo

Esse projeto foi uma oportunidade de praticar a criação de classes e a organização do código em pacotes, além de trabalhar com herança, listas e regras de negócio em um programa Java.
