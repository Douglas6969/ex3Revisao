package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class jogoPedra extends JFrame {
    private JTextField textField1;
    private JButton playButton;
    private JRadioButton pedra;
    private JRadioButton papel;
    private JRadioButton tesoura;
    public JPanel JogoP;
    private JPanel panel2;

    public Integer opcaoJogador;
public jogoPedra() {
    playButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int opcaoMaquina = random.nextInt(3);

            String[] opcoes = {"pedra", "papel", "tesoura"};




            if (opcaoJogador == 0){
            if (opcaoMaquina == 0){
                JOptionPane.showMessageDialog(null,"Empate!");
                textField1.setText("Pedra");
            }
            else if (opcaoMaquina == 1){
                JOptionPane.showMessageDialog(null,"Perdeu!");
                textField1.setText("Papel");
            }else if(opcaoMaquina == 2){
                JOptionPane.showMessageDialog(null,"Venceu!");
                textField1.setText("Tesoura");
            }}

            else if (opcaoJogador == 1){
                if (opcaoMaquina == 0){
                    JOptionPane.showMessageDialog(null,"vemceu!");
                    textField1.setText("Pedra");
                }
                else if (opcaoMaquina == 1){
                        JOptionPane.showMessageDialog(null,"Empate!");
                    textField1.setText("Papel");
                }else if(opcaoMaquina == 2){
                    JOptionPane.showMessageDialog(null,"Perdeu!");
                    textField1.setText("Tesoura");

                }
            }
            else if (opcaoJogador == 2){
                if (opcaoMaquina == 0){
                    JOptionPane.showMessageDialog(null,"Perdeu!");
                    textField1.setText("Pedra");
                }
                else if (opcaoMaquina == 1){
                    JOptionPane.showMessageDialog(null,"Venceu!");
                    textField1.setText("Papel");
                }else if(opcaoMaquina == 2){
                    JOptionPane.showMessageDialog(null,"Empate!");
                    textField1.setText("Tesoura");
            }}



            }
           });
    ButtonGroup buttonGroup = new ButtonGroup();



    buttonGroup.add(pedra);
    buttonGroup.add(papel);
    buttonGroup.add(tesoura);





    pedra.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            opcaoJogador = 0;
        }
    });
    papel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            opcaoJogador = 1;
        }
    });
    tesoura.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            opcaoJogador = 2;
        }
    });
}
    }


