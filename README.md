# Calculadora Simples em Java

Projeto de uma calculadora com interface gráfica desenvolvido em **Java**, utilizando a biblioteca **Swing**.

O objetivo do projeto é praticar conceitos básicos da linguagem Java e entender o funcionamento de uma interface gráfica de forma simples e direta.

## Funcionalidades

A calculadora permite realizar as quatro operações matemáticas básicas:

- Soma
- Subtração
- Multiplicação
- Divisão
- Limpeza do visor
- Tratamento de divisão por zero

## Interface

A interface possui:

- Visor para exibição dos números e resultados
- Botões numéricos de 0 a 9
- Botões de operações matemáticas
- Botão `=`
- Botão `C` para limpar a calculadora

## Tecnologias utilizadas

- Java
- Java Swing
- Oracle JDK 21
- IntelliJ IDEA
- Git
- GitHub

## Estrutura do projeto

O projeto está dividido principalmente em duas classes:

### `App`

Classe responsável por iniciar o programa através do método `main`.

```java
public static void main(String[] args) {
    new Calculadora();
}
```

### `Calculadora`

Classe responsável por:

- Criar a janela
- Criar o visor
- Criar os botões
- Organizar a interface
- Capturar os cliques dos botões
- Realizar as operações matemáticas

## Conceitos praticados

Durante o desenvolvimento deste projeto foram utilizados conceitos como:

- Classes e objetos
- Variáveis
- Métodos
- Condicionais `if` e `else`
- Eventos com `ActionListener`
- Interfaces gráficas com Swing
- `JFrame`
- `JPanel`
- `JButton`
- `JTextField`
- `BorderLayout`
- `GridLayout`
- Conversão de `String` para `double`

## Como executar

Para executar o projeto é necessário possuir o **JDK 21** ou uma versão compatível instalada.

Abra o projeto em uma IDE Java e execute a classe:

```text
App.java
```

## Objetivo do projeto

Este projeto foi desenvolvido com foco em aprendizado, buscando compreender passo a passo como funciona uma aplicação Java com interface gráfica.

A implementação foi mantida propositalmente simples para facilitar o entendimento dos componentes do Swing, eventos dos botões e lógica das operações matemáticas.

## Próximas melhorias

Algumas melhorias que poderão ser adicionadas futuramente:

- Botão de ponto decimal
- Porcentagem
- Alteração do design da interface
- Melhor tratamento de entradas inválidas
- Histórico de operações
- Suporte a operações consecutivas

## Autor

**Felipe Peres d'Oliveira**

Projeto desenvolvido para estudo e prática de desenvolvimento em Java.
