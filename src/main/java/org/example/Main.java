package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        jogoPedra Resumo = new jogoPedra();

        JFrame frame = new JFrame();
        frame.setContentPane(Resumo.JogoP);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(500,500);
    }
}