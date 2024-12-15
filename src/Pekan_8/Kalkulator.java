package Pekan_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {

    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Kalkulator Sederhana");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Membuat panel display
        JTextField display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        // Membuat panel tombol
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Array tombol
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Variabel untuk menyimpan angka dan operasi
        final double[] firstNumber = {0};
        final String[] operator = {""};

        // Listener tombol
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                
                if ("0123456789.".contains(command)) {
                    // Angka atau titik
                    display.setText(display.getText() + command);
                } else if ("/*-+".contains(command)) {
                    // Operator
                    firstNumber[0] = Double.parseDouble(display.getText());
                    operator[0] = command;
                    display.setText("");
                } else if ("=".equals(command)) {
                    // Hitung hasil
                    double secondNumber = Double.parseDouble(display.getText());
                    double result = 0;

                    switch (operator[0]) {
                        case "+":
                            result = firstNumber[0] + secondNumber;
                            break;
                        case "-":
                            result = firstNumber[0] - secondNumber;
                            break;
                        case "*":
                            result = firstNumber[0] * secondNumber;
                            break;
                        case "/":
                            result = firstNumber[0] / secondNumber;
                            break;
                    }

                    display.setText(String.valueOf(result));
                    operator[0] = ""; // Reset operator
                }
            }
        };

        // Tambahkan tombol ke panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(listener);
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        
        // Tampilkan frame
        frame.setVisible(true);
    }
}
