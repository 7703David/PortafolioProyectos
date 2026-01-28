package AreaPerimetroTriangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Abir con para trabajarlo WindowBuilder
public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);//Centrar el frame en la pantalla
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Tr\u00E1ngulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrin = new JLabel("\u00C1rea y Per\u00EDmetro Tri\u00E1ngulo");
		lblTituloPrin.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		lblTituloPrin.setBounds(111, 25, 237, 35);
		contentPane.add(lblTituloPrin);
		
		JLabel lblTriangulo = new JLabel("");
		lblTriangulo.setIcon(new ImageIcon(GUI.class.getResource("/AreaPerimetroTriangulo/TrianP.png")));
		lblTriangulo.setBounds(62, 100, 120, 100);
		contentPane.add(lblTriangulo);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBase.setBounds(229, 88, 46, 14);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAltura.setBounds(229, 150, 46, 14);
		contentPane.add(lblAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setToolTipText("");
		textFieldBase.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldBase.setBounds(229, 105, 112, 20);
		contentPane.add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldAltura.setBounds(229, 166, 112, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Captura de datos para la base y la altura
				textFieldBase.grabFocus();//Para que aparezca el cursor en el primer espacio de ingreso de text
				double base = 0;
				try {
					base = Double.parseDouble(textFieldBase.getText());
					if(base<=0) {
						JOptionPane.showMessageDialog(contentPane, "Error, ingres� un valor negativo o igual 0 en la base","Error",0);
						base=0;
					}
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(contentPane, "Ingres� un caracter NO v�lido en la base","Error", 0);
					base=0;
				}
				double altura = 0;
				try {
					altura = Double.parseDouble(textFieldAltura.getText());
					if(altura<=0) {
						JOptionPane.showMessageDialog(contentPane, "Error, ingres� un valor negativo o igual 0 en la altura","Error",0);
						altura=0;
					}
				}catch(NumberFormatException n) {
					JOptionPane.showMessageDialog(contentPane, "Ingres� un caracter NO v�lido en la altura","Error", 0);
					altura=0;
				}
				double area = 0;
				double perimetro = 0;
				double hipotenusa = 0;
				//Operacion para hallar el �rea
				area=(base*altura)/2;
				hipotenusa = Math.sqrt((Math.pow(base, 2)+Math.pow(altura, 2)));
				perimetro = base+altura+hipotenusa;
				//Salida de datos del resultado
				JOptionPane.showMessageDialog(null, "El �rea del tri�ngulo es: "+area+" m�\nEl per�metro del tri�ngulo es: "+perimetro+" m");
			}
		});
		btnCalcular.setBounds(229, 218, 89, 23);
		contentPane.add(btnCalcular);
		
		JMenuBar menuBarra = new JMenuBar();
		menuBarra.setBounds(0, 0, 445, 22);
		contentPane.add(menuBarra);
		
		JMenu mnMenu = new JMenu("Opciones");
		menuBarra.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnMenu.add(mntmNewMenuItem);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon(GUI.class.getResource("/AreaPerimetroTriangulo/Fondo.jpg")));
		lblFondo.setBounds(0, 0, 445, 292);
		contentPane.add(lblFondo);
	}
}