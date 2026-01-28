package com.miapp.crypto;

import com.miapp.crypto.RSAUtil;
import com.miapp.crypto.RSAUtil.KeyPair;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingWorker;

/**
 * Interfaz gráfica para RSA con pestañas:
 * - Pestaña "Claves": generación, carga y guardado de claves.
 * - Pestaña "Operaciones": cifrado y descifrado según clave cargada.
 */
public class RSAAppGUI extends JFrame {
    private KeyPair keys;
    private JComboBox<String> comboLength;
    private JTextField txtN, txtE, txtD;
    private JButton btnGenKeys, btnLoadKeys, btnSaveKeys;

    private JTextArea txtInput, txtOutput;
    private JButton btnEncrypt, btnDecrypt;

    public RSAAppGUI() {
        super("RSA");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 550);
        setLocationRelativeTo(null);

        // Crear pestañas
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Claves", createKeysPanel());
        tabs.addTab("Operaciones", createOperationsPanel());
        add(tabs);
    }

    private JPanel createKeysPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(new EmptyBorder(10,10,10,10));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        // Selector de longitud
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Longitud de primos (bits):"), gbc);
        comboLength = new JComboBox<>(new String[]{"512","1024","1536","2048"});
        comboLength.setSelectedItem("1024");
        gbc.gridx = 1;
        panel.add(comboLength, gbc);

        // Botones generar, cargar, guardar
        btnGenKeys = new JButton("Generar claves");
        btnLoadKeys = new JButton("Cargar claves");
        btnSaveKeys = new JButton("Guardar claves");
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        JPanel btnPanel = new JPanel();
        btnPanel.add(btnGenKeys);
        btnPanel.add(btnLoadKeys);
        btnPanel.add(btnSaveKeys);
        panel.add(btnPanel, gbc);

        // Campos n, e, d
        gbc.gridwidth = 1;
        gbc.gridy = 2; gbc.gridx = 0;
        panel.add(new JLabel("n:"), gbc);
        txtN = new JTextField(50); txtN.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtN, gbc);
        gbc.gridy = 3; gbc.gridx = 0;
        panel.add(new JLabel("e:"), gbc);
        txtE = new JTextField(30); txtE.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtE, gbc);
        gbc.gridy = 4; gbc.gridx = 0;
        panel.add(new JLabel("d:"), gbc);
        txtD = new JTextField(50); txtD.setEditable(false);
        gbc.gridx = 1;
        panel.add(txtD, gbc);

        // Listeners
        btnGenKeys.addActionListener(e -> showKeyGenProgress());
        btnLoadKeys.addActionListener(e -> loadKeysFromFile());
        btnSaveKeys.addActionListener(e -> saveKeysToDirectory());

        return panel;
    }

    private JPanel createOperationsPanel() {
        JPanel panel = new JPanel(new BorderLayout(10,10));
        panel.setBorder(new EmptyBorder(10,10,10,10));

        // Entrada y Salida
        txtInput = new JTextArea(); txtInput.setBorder(BorderFactory.createTitledBorder("Texto de entrada"));
        txtOutput = new JTextArea(); txtOutput.setBorder(BorderFactory.createTitledBorder("Texto de salida"));
        JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                new JScrollPane(txtInput), new JScrollPane(txtOutput));
        split.setDividerLocation(250);
        panel.add(split, BorderLayout.CENTER);

        // Botones cifrar/descifrar
        btnEncrypt = new JButton("Cifrar");
        btnDecrypt = new JButton("Descifrar");
        btnEncrypt.setEnabled(false);
        btnDecrypt.setEnabled(false);
        JPanel pnlActions = new JPanel();
        pnlActions.add(btnEncrypt);
        pnlActions.add(btnDecrypt);
        panel.add(pnlActions, BorderLayout.SOUTH);

        // Listeners y habilitación
        btnEncrypt.addActionListener(e -> encryptMessage());
        btnDecrypt.addActionListener(e -> decryptMessage());

        return panel;
    }

    private void updateOperationButtons() {
        boolean hasPub = keys != null && keys.e != null;
        boolean hasPriv = keys != null && keys.d != null;
        btnEncrypt.setEnabled(hasPub);
        btnDecrypt.setEnabled(hasPriv);
    }

    private void showKeyGenProgress() {
        int bits = Integer.parseInt((String)comboLength.getSelectedItem());
        JDialog dlg = new JDialog(this, "Generando claves...", true);
        JProgressBar bar = new JProgressBar(); bar.setIndeterminate(true);
        JLabel lbl = new JLabel("Generando primos de " + bits + " bits, por favor espere...");
        dlg.add(lbl, BorderLayout.NORTH);
        dlg.add(bar, BorderLayout.CENTER);
        dlg.pack(); dlg.setLocationRelativeTo(this);

        SwingWorker<KeyPair, Void> worker = new SwingWorker<>() {
            @Override protected KeyPair doInBackground() {
                return RSAUtil.generateKeyPair(bits);
            }
            @Override protected void done() {
                try {
                    keys = get();
                    txtN.setText(keys.n.toString());
                    txtE.setText(keys.e.toString());
                    txtD.setText(keys.d.toString());
                    updateOperationButtons();
                    JOptionPane.showMessageDialog(RSAAppGUI.this, "Claves generadas correctamente.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(RSAAppGUI.this, "Error: " + ex.getMessage());
                } finally {
                    dlg.dispose();
                }
            }
        };
        worker.execute(); dlg.setVisible(true);
    }

    private void saveKeysToDirectory() {
        if (keys == null) {
            JOptionPane.showMessageDialog(this, "No hay claves para guardar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccionar carpeta para guardar claves");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (chooser.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        File dir = chooser.getSelectedFile();

        String base = "clave_";
        File pub = new File(dir, base + "publica.key");
        File priv = new File(dir, base + "privada.key");
        int count = 1;
        while (pub.exists() || priv.exists()) {
            pub = new File(dir, base + "publica_" + count + ".key");
            priv = new File(dir, base + "privada_" + count + ".key");
            count++;
        }
        try (FileWriter wpub = new FileWriter(pub);
             FileWriter wpriv = new FileWriter(priv)) {
            wpub.write("n=" + keys.n + "\n");
            wpub.write("e=" + keys.e + "\n");
            wpriv.write("n=" + keys.n + "\n");
            wpriv.write("d=" + keys.d + "\n");
            JOptionPane.showMessageDialog(this,
                "Claves guardadas en:\n" + pub.getAbsolutePath() + "\n" + priv.getAbsolutePath(),
                "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar claves: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadKeysFromFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccionar archivo de clave");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try (BufferedReader r = new BufferedReader(new FileReader(f))) {
                String l; BigInteger n=null,e=null,d=null;
                while ((l=r.readLine())!=null) {
                    if (l.startsWith("n=")) n = new BigInteger(l.substring(2));
                    else if (l.startsWith("e=")) e = new BigInteger(l.substring(2));
                    else if (l.startsWith("d=")) d = new BigInteger(l.substring(2));
                }
                if (n!=null && (e!=null || d!=null)) {
                    keys = new KeyPair(n,e,d);
                    txtN.setText(n.toString());
                    txtE.setText(e!=null?e.toString():"");
                    txtD.setText(d!=null?d.toString():"");
                    updateOperationButtons();
                    JOptionPane.showMessageDialog(this, "Clave cargada correctamente.");
                } else throw new IOException("Formato inválido.");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void encryptMessage() {
        try {
            if (keys==null || keys.e==null) throw new IllegalStateException("Cargar clave pública primero.");
            BigInteger m = RSAUtil.stringToBigInteger(txtInput.getText());
            BigInteger c = RSAUtil.encrypt(m, keys.e, keys.n);
            txtOutput.setText(c.toString());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cifrar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void decryptMessage() {
        try {
            if (keys==null || keys.d==null) throw new IllegalStateException("Cargar clave privada primero.");
            BigInteger c = new BigInteger(txtInput.getText());
            BigInteger m = RSAUtil.decrypt(c, keys.d, keys.n);
            txtOutput.setText(RSAUtil.bigIntegerToString(m));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al descifrar: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RSAAppGUI().setVisible(true));
    }
}
