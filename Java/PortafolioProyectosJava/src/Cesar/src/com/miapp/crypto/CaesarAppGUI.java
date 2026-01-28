package com.miapp.crypto;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;

/**
 * Interfaz gráfica para cifrado y descifrado con método César.
 */
public class CaesarAppGUI extends JFrame {
    private JTextArea txtInput;
    private JTextField txtShift;
    private JTextArea txtOutput;
    private JButton btnEncrypt, btnDecrypt, btnClear;

    public CaesarAppGUI() {
        super("Cifrado César - Actividad de Criptografía");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setLocationRelativeTo(null);

        // Panel principal con BorderLayout
        JPanel main = new JPanel(new BorderLayout(10,10));
        main.setBorder(new EmptyBorder(10,10,10,10));
        setContentPane(main);

        // NORTH: título
        JLabel lblTitle = new JLabel("Cifrado César - Actividad de Criptografía", SwingConstants.CENTER);
        lblTitle.setFont(lblTitle.getFont().deriveFont(Font.BOLD, 18f));
        main.add(lblTitle, BorderLayout.NORTH);

        // CENTER: entrada, corrimiento, botones, resultado
        JPanel center = new JPanel();
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));

        // Texto a procesar
        center.add(new JLabel("Entrada:"));
        txtInput = new JTextArea(4, 40);
        center.add(new JScrollPane(txtInput));
        center.add(Box.createVerticalStrut(10));

        // Panel corrimiento y botones
        JPanel pnlMid = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        pnlMid.add(new JLabel("Valor de corrimiento (n):"));
        txtShift = new JTextField("3", 5);
        pnlMid.add(txtShift);
        btnEncrypt = new JButton("Cifrar");
        btnDecrypt = new JButton("Descifrar");
        btnClear = new JButton("Limpiar");
        pnlMid.add(btnEncrypt);
        pnlMid.add(btnDecrypt);
        pnlMid.add(btnClear);
        center.add(pnlMid);
        center.add(Box.createVerticalStrut(10));

        // Resultado
        center.add(new JLabel("Salida:"));
        txtOutput = new JTextArea(4, 40);
        txtOutput.setEditable(false);
        center.add(new JScrollPane(txtOutput));

        main.add(center, BorderLayout.CENTER);

        // SOUTH: teoría del cifrado César
        JTextArea txtTheory = new JTextArea();
        txtTheory.setEditable(false);
        txtTheory.setLineWrap(true);
        txtTheory.setWrapStyleWord(true);
        txtTheory.setText(
            "Teoría del Cifrado César\n" +
            "Fórmula de cifrado: E_n(x) = (x + n) mod 27\n" +
            "Fórmula de descifrado: D_n(x) = (x - n) mod 27\n\n" +
            "Donde x es el código del carácter y n es el valor de corrimiento."
        );
        txtTheory.setBorder(BorderFactory.createTitledBorder("Teoría del Cifrado César"));
        main.add(new JScrollPane(txtTheory), BorderLayout.SOUTH);

        // Listeners
        btnEncrypt.addActionListener(e -> onEncrypt());
        btnDecrypt.addActionListener(e -> onDecrypt());
        btnClear.addActionListener(e -> {
            txtInput.setText("");
            txtOutput.setText("");
        });
    }

    private void onEncrypt() {
        try {
            int shift = Integer.parseInt(txtShift.getText());
            txtOutput.setText(CaesarUtil.encrypt(txtInput.getText(), shift));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor de corrimiento inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void onDecrypt() {
        try {
            int shift = Integer.parseInt(txtShift.getText());
            txtOutput.setText(CaesarUtil.decrypt(txtInput.getText(), shift));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Valor de corrimiento inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CaesarAppGUI().setVisible(true);
        });
    }
}