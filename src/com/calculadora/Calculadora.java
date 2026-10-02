package com.calculadora;

import javax.swing.*;
import java.awt.*;

public class Calculadora {

    // Variáveis usadas nas operações
    double numero1;
    double numero2;
    double resultado;

    // Guarda a operação escolhida
    String operacao;

    // Cria o visor
    JTextField visor = new JTextField();

    // Construtor da calculadora
    public Calculadora() {

        // Cria a janela principal
        JFrame janela = new JFrame("Calculadora");

        // Define o tamanho da janela
        janela.setSize(300, 400);

        // Fecha o programa ao clicar no X
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Impede que a janela seja redimensionada
        janela.setResizable(false);

        // Define o layout principal
        janela.setLayout(new BorderLayout());


        // -------------------------
        // VISOR
        // -------------------------

        // Impede que o usuário digite diretamente no visor
        visor.setEditable(false);

        // Define a fonte do visor
        visor.setFont(new Font("Arial", Font.PLAIN, 25));

        // Alinha os números à direita
        visor.setHorizontalAlignment(JTextField.RIGHT);

        // Adiciona o visor na parte de cima
        janela.add(visor, BorderLayout.NORTH);


        // -------------------------
        // PAINEL DOS BOTÕES
        // -------------------------

        // Cria o painel onde ficarão os botões
        JPanel painelBotoes = new JPanel();

        // Organiza os botões em 4 linhas e 4 colunas
        painelBotoes.setLayout(new GridLayout(4, 4));


        // -------------------------
        // CRIAÇÃO DOS BOTÕES
        // -------------------------

        JButton botao7 = new JButton("7");
        JButton botao8 = new JButton("8");
        JButton botao9 = new JButton("9");
        JButton botaoDividir = new JButton("/");

        JButton botao4 = new JButton("4");
        JButton botao5 = new JButton("5");
        JButton botao6 = new JButton("6");
        JButton botaoMultiplicar = new JButton("*");

        JButton botao1 = new JButton("1");
        JButton botao2 = new JButton("2");
        JButton botao3 = new JButton("3");
        JButton botaoSubtrair = new JButton("-");

        JButton botao0 = new JButton("0");
        JButton botaoLimpar = new JButton("C");
        JButton botaoIgual = new JButton("=");
        JButton botaoSomar = new JButton("+");


        // -------------------------
        // BOTÕES DOS NÚMEROS
        // -------------------------

        botao7.addActionListener(e -> {
            visor.setText(visor.getText() + "7");
        });

        botao8.addActionListener(e -> {
            visor.setText(visor.getText() + "8");
        });

        botao9.addActionListener(e -> {
            visor.setText(visor.getText() + "9");
        });

        botao4.addActionListener(e -> {
            visor.setText(visor.getText() + "4");
        });

        botao5.addActionListener(e -> {
            visor.setText(visor.getText() + "5");
        });

        botao6.addActionListener(e -> {
            visor.setText(visor.getText() + "6");
        });

        botao1.addActionListener(e -> {
            visor.setText(visor.getText() + "1");
        });

        botao2.addActionListener(e -> {
            visor.setText(visor.getText() + "2");
        });

        botao3.addActionListener(e -> {
            visor.setText(visor.getText() + "3");
        });

        botao0.addActionListener(e -> {
            visor.setText(visor.getText() + "0");
        });


        // -------------------------
        // SOMA
        // -------------------------

        botaoSomar.addActionListener(e -> {

            // Guarda o primeiro número
            numero1 = Double.parseDouble(visor.getText());

            // Guarda a operação
            operacao = "+";

            // Limpa o visor
            visor.setText("");
        });


        // -------------------------
        // SUBTRAÇÃO
        // -------------------------

        botaoSubtrair.addActionListener(e -> {

            numero1 = Double.parseDouble(visor.getText());

            operacao = "-";

            visor.setText("");
        });


        // -------------------------
        // MULTIPLICAÇÃO
        // -------------------------

        botaoMultiplicar.addActionListener(e -> {

            numero1 = Double.parseDouble(visor.getText());

            operacao = "*";

            visor.setText("");
        });


        // -------------------------
        // DIVISÃO
        // -------------------------

        botaoDividir.addActionListener(e -> {

            numero1 = Double.parseDouble(visor.getText());

            operacao = "/";

            visor.setText("");
        });


        // -------------------------
        // BOTÃO =
        // -------------------------

        botaoIgual.addActionListener(e -> {

            // Guarda o segundo número
            numero2 = Double.parseDouble(visor.getText());

            // Verifica qual operação foi escolhida
            if (operacao.equals("+")) {

                resultado = numero1 + numero2;

            } else if (operacao.equals("-")) {

                resultado = numero1 - numero2;

            } else if (operacao.equals("*")) {

                resultado = numero1 * numero2;

            } else if (operacao.equals("/")) {

                // Impede divisão por zero
                if (numero2 == 0) {

                    visor.setText("Erro");

                    return;
                }

                resultado = numero1 / numero2;
            }

            // Mostra o resultado no visor
            visor.setText(String.valueOf(resultado));
        });


        // -------------------------
        // BOTÃO C
        // -------------------------

        botaoLimpar.addActionListener(e -> {

            // Limpa o visor
            visor.setText("");

            // Zera os números
            numero1 = 0;
            numero2 = 0;
            resultado = 0;

            // Limpa a operação
            operacao = "";
        });


        // -------------------------
        // ADICIONANDO OS BOTÕES
        // -------------------------

        painelBotoes.add(botao7);
        painelBotoes.add(botao8);
        painelBotoes.add(botao9);
        painelBotoes.add(botaoDividir);

        painelBotoes.add(botao4);
        painelBotoes.add(botao5);
        painelBotoes.add(botao6);
        painelBotoes.add(botaoMultiplicar);

        painelBotoes.add(botao1);
        painelBotoes.add(botao2);
        painelBotoes.add(botao3);
        painelBotoes.add(botaoSubtrair);

        painelBotoes.add(botao0);
        painelBotoes.add(botaoLimpar);
        painelBotoes.add(botaoIgual);
        painelBotoes.add(botaoSomar);


        // Adiciona os botões na janela
        janela.add(painelBotoes, BorderLayout.CENTER);

        // Centraliza a janela na tela
        janela.setLocationRelativeTo(null);

        // Torna a janela visível
        janela.setVisible(true);
    }
}