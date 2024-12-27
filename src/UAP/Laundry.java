package UAP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Laundry {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Sistem Laundry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        // Membuat label dan text field untuk input
        JLabel labelName = new JLabel("Nama Pelanggan:");
        JTextField textName = new JTextField();

        JLabel labelWeight = new JLabel("Berat Laundry (kg):");
        JTextField textWeight = new JTextField();

        JLabel labelService = new JLabel("Jenis Layanan:");
        String[] services = {"Reguler", "Express", "Premium"};
        JComboBox<String> comboService = new JComboBox<>(services);

        JLabel labelTotal = new JLabel("Total Biaya:");
        JTextField textTotal = new JTextField();
        textTotal.setEditable(false);

        // Membuat tombol untuk menghitung biaya
        JButton buttonCalculate = new JButton("Hitung Biaya");

        // Menambahkan komponen ke panel
        panel.add(labelName);
        panel.add(textName);
        panel.add(labelWeight);
        panel.add(textWeight);
        panel.add(labelService);
        panel.add(comboService);
        panel.add(labelTotal);
        panel.add(textTotal);

        // Menambahkan action listener untuk tombol
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = textName.getText();
                    double weight = Double.parseDouble(textWeight.getText());
                    String service = (String) comboService.getSelectedItem();

                    // Menentukan harga per kilogram berdasarkan jenis layanan
                    double pricePerKg;
                    if (service.equals("Reguler")) {
                        pricePerKg = 5000;
                    } else if (service.equals("Express")) {
                        pricePerKg = 7000;
                    } else { // Premium
                        pricePerKg = 10000;
                    }

                    // Menghitung total biaya
                    double total = weight * pricePerKg;
                    textTotal.setText("Rp " + total);

                    JOptionPane.showMessageDialog(frame, "Biaya untuk " + name + ": Rp " + total, "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan berat laundry yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Menambahkan tombol ke frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(buttonCalculate);

        // Menambahkan panel ke frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
