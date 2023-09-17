package org.example;

import javax.swing.*;

public class Frame {
    JPanel panel;
    JButton button;
    JTextField text;
    JTextArea num;

    Frame( ) {
        panel = new JPanel();
        num = new JTextArea();
        text = new JTextField();
        button = new JButton("Enter");
        JFrame frame = new JFrame("My window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
