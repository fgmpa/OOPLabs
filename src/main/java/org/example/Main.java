package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main extends JFrame implements ActionListener {
    static JFrame frame;
    static JTextField text;
    static JPanel panel;
    static JTextArea area;
    public static void main(String[] args) {
        Main listen = new Main();
        JButton button = new JButton("Enter");
        button.addActionListener(listen);

        text = new JTextField(5);
        panel = new JPanel();
        area = new JTextArea(20,30);
        frame = new JFrame();

        panel.add(text);
        panel.add(area);
        panel.add(button);


        frame.add(panel);
        frame.setSize(360, 420);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.revalidate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText(null);
        int N = Integer.parseInt(text.getText());
        int extCounter = N;
        int pos = extCounter - 1;
        int insCounter = N;

        do{
            insCounter = N;
           do {
                if (insCounter > pos) {
                    area.append(String.valueOf(insCounter) + " ");
                }
                else {
                    area.append(" ");
                }
                insCounter--;
            } while (insCounter != 0);
            area.append("\n");
            pos--;
            extCounter--;
        } while (extCounter != 0);
    }
}