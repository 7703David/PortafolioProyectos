package FarenheitCelsius;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MiprimerGUI extends JFrame {//Creaci�n clase p�blica

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//CONVERTIDOR DE TEMPERATURAS - F�->C�
	private JPanel contentPane;
	private JTextField textFileFahrenheit;
	private JTextField textFieldCelsius;

	/**
	 * Launch the application.
	 */
	//M�todo Principal
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiprimerGUI frame = new MiprimerGUI();
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
	//Constructor
	public MiprimerGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MiprimerGUI.class.getResource("/FarenheitCelsius/IconoTemp.png")));
		setResizable(false);
		setTitle("Convertidor de Temperaturas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JLabel lblMouse = new JLabel("Mouse:");
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				lblMouse.setText("Mouse: "+e.getX()+","+e.getY());
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit");
		lblFahrenheit.setBounds(89, 81, 78, 14);
		contentPane.add(lblFahrenheit);
		
		textFileFahrenheit = new JTextField();
		textFileFahrenheit.setBounds(177, 78, 130, 20);
		contentPane.add(textFileFahrenheit);
		textFileFahrenheit.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius -->");
		lblCelsius.setBounds(89, 112, 78, 14);
		contentPane.add(lblCelsius);
		
		textFieldCelsius = new JTextField();
		textFieldCelsius.setEditable(false);
		textFieldCelsius.setBounds(177, 109, 130, 20);
		contentPane.add(textFieldCelsius);
		textFieldCelsius.setColumns(10);
		
		JButton btnConvertidor = new JButton("Convertir");
		btnConvertidor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				conversionBoton();
			}
		});
		btnConvertidor.setBounds(317, 91, 89, 23);
		contentPane.add(btnConvertidor);
		
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
		
		lblMouse.setBounds(10, 33, 141, 14);
		contentPane.add(lblMouse);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setIcon(new ImageIcon(MiprimerGUI.class.getResource("/FarenheitCelsius/FondoTemp.jpg")));
		lblFondo.setBounds(0, 21, 434, 240);
		contentPane.add(lblFondo);
	}

	private void conversionBoton() {
		double fahrenheit=0;
		try {
		fahrenheit = Double.parseDouble(textFileFahrenheit.getText());
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(contentPane,"Ingres� un caracter NO num�rico","Error",0);
			textFileFahrenheit.setText("0");
			fahrenheit = 0;			
		}
		
		double celsius = Convertidores.ConversionFahrenheit(fahrenheit);
		textFieldCelsius.setText(Double.toString(celsius));
		
	}
}
