package Cine;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JSplitPane;
import java.awt.event.ItemListener;
import java.util.Hashtable;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class Manejo_Cine extends JFrame {

	private JPanel cP;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manejo_Cine frame = new Manejo_Cine();
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
	public Manejo_Cine() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 485);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opciones");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		cP = new JPanel();
		cP.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cP);
		cP.setLayout(null);
		
		JLabel lblFondoCine = new JLabel("");
		lblFondoCine.setIcon(new ImageIcon(Manejo_Cine.class.getResource("/Cine/FondoCine.png")));
		lblFondoCine.setBounds(15, 0, 645, 88);
		cP.add(lblFondoCine);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table.setCellSelectionEnabled(true);
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"A01", "A02", "A03", "A04", "A05", "A06", "A07", "A08", "A09", "A10"},
				{"B01", "B02", "B03", "B04", "B05", "B06", "B07", "B08", "B09", "B10"},
				{"C01", "C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", "C10"},
				{"D01", "D02", "D03", "D04", "D05", "D06", "D07", "D08", "D09", "D10"},
				{"E01", "E02", "E03", "E04", "E05", "E06", "E07", "E08", "E09", "E10"},
				{"F01", "F02", "F03", "F04", "F05", "F06", "F07", "F08", "F09", "F10"},
				{"G01", "G02", "G03", "G04", "G05", "G06", "G07", "G08", "G09", "G10"},
				{"H01", "H02", "H03", "H04", "H05", "H06", "H07", "H08", "H09", "H10"},
				{"I01", "I02", "I03", "I04", "I05", "I06", "I07", "I08", "I09", "I10"},
				{"J01", "J02", "J03", "J04", "J05", "J06", "J07", "J08", "J09", "J10"},
			},
			new String[] {
				"", "", "", "", "", "", "", "", "", ""
			}
		));
		table.setBounds(201, 128, 274, 160);
		cP.add(table);
		JLabel lblTextoPantalla = new JLabel("PANTALLA");
		lblTextoPantalla.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoPantalla.setForeground(Color.BLACK);
		lblTextoPantalla.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTextoPantalla.setBounds(282, 99, 85, 18);
		cP.add(lblTextoPantalla);
		
		JLabel lblDineroCaja = new JLabel("Total dinero en caja: ");
		lblDineroCaja.setBounds(10, 99, 205, 14);
		cP.add(lblDineroCaja);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccionar sillas:");
		lblNewLabel_2.setBounds(10, 146, 114, 14);
		cP.add(lblNewLabel_2);
		
		JComboBox cBoFila = new JComboBox();
		cBoFila.setBounds(15, 204, 134, 22);
		cP.add(cBoFila);
		
		JComboBox cBoTipoSilla = new JComboBox();
		cBoTipoSilla.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String TipoSilla = (String) cBoTipoSilla.getSelectedItem();
				if (TipoSilla.equals("General")) {
					cBoFila.removeAllItems();
					cBoFila.addItem("A01");cBoFila.addItem("A02");cBoFila.addItem("A03");cBoFila.addItem("A04");cBoFila.addItem("A05");
					cBoFila.addItem("A06");cBoFila.addItem("A07");cBoFila.addItem("A08");cBoFila.addItem("A09");cBoFila.addItem("A10");
					cBoFila.addItem("B01");cBoFila.addItem("B02");cBoFila.addItem("B03");cBoFila.addItem("B04");cBoFila.addItem("B05");
					cBoFila.addItem("B06");cBoFila.addItem("B07");cBoFila.addItem("B08");cBoFila.addItem("B09");cBoFila.addItem("B10");
					cBoFila.addItem("C01");cBoFila.addItem("C02");cBoFila.addItem("C03");cBoFila.addItem("C04");cBoFila.addItem("C05");
					cBoFila.addItem("C06");cBoFila.addItem("C07");cBoFila.addItem("C08");cBoFila.addItem("C09");cBoFila.addItem("C10");
					cBoFila.addItem("D01");cBoFila.addItem("D02");cBoFila.addItem("D03");cBoFila.addItem("D04");cBoFila.addItem("D05");
					cBoFila.addItem("D06");cBoFila.addItem("D07");cBoFila.addItem("D08");cBoFila.addItem("D09");cBoFila.addItem("D10");
					cBoFila.addItem("E01");cBoFila.addItem("E02");cBoFila.addItem("E03");cBoFila.addItem("E04");cBoFila.addItem("E05");
					cBoFila.addItem("E06");cBoFila.addItem("E07");cBoFila.addItem("E08");cBoFila.addItem("E09");cBoFila.addItem("E10");
					cBoFila.addItem("F01");cBoFila.addItem("F02");cBoFila.addItem("F03");cBoFila.addItem("F04");cBoFila.addItem("F05");
					cBoFila.addItem("F06");cBoFila.addItem("F07");cBoFila.addItem("F08");cBoFila.addItem("F09");cBoFila.addItem("F10");
					cBoFila.addItem("G01");cBoFila.addItem("G02");cBoFila.addItem("G03");cBoFila.addItem("G04");cBoFila.addItem("G05");
					cBoFila.addItem("G06");cBoFila.addItem("G07");cBoFila.addItem("G08");cBoFila.addItem("G09");cBoFila.addItem("G10");
				}
				else {
					cBoFila.removeAllItems();
					cBoFila.addItem("H01");cBoFila.addItem("H02");cBoFila.addItem("H03");cBoFila.addItem("H04");cBoFila.addItem("H05");
					cBoFila.addItem("H06");cBoFila.addItem("H07");cBoFila.addItem("H08");cBoFila.addItem("H09");cBoFila.addItem("H10");
					cBoFila.addItem("I01");cBoFila.addItem("I02");cBoFila.addItem("I03");cBoFila.addItem("I04");cBoFila.addItem("I05");
					cBoFila.addItem("I06");cBoFila.addItem("I07");cBoFila.addItem("I08");cBoFila.addItem("I09");cBoFila.addItem("I10");
					cBoFila.addItem("J01");cBoFila.addItem("J02");cBoFila.addItem("J03");cBoFila.addItem("J04");cBoFila.addItem("J05");
					cBoFila.addItem("J06");cBoFila.addItem("J07");cBoFila.addItem("J08");cBoFila.addItem("J09");cBoFila.addItem("J10");
				}
			}
		});
		cBoTipoSilla.addItem("General");
		cBoTipoSilla.addItem("Preferencial");
		cBoTipoSilla.setBounds(15, 171, 134, 22);
		cP.add(cBoTipoSilla);
		
		JTextPane textPaneInfo = new JTextPane();
		textPaneInfo.setEditable(false);
		textPaneInfo.setBounds(15, 237, 134, 145);
		cP.add(textPaneInfo);
		
		Hashtable Asiento = new Hashtable();
		JButton btnAsiento = new JButton("Agregar Asiento");
		btnAsiento.addActionListener(new ActionListener() {
			int cont=0;
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
				String TipoSillas = (String) cBoTipoSilla.getSelectedItem();
				String Filas = (String) cBoFila.getSelectedItem();
				Asiento.put(Filas,TipoSillas);
				cont++;
				textPaneInfo.setText(Asiento+"");
			}
		});
		btnAsiento.setBounds(10, 393, 128, 23);
		cP.add(btnAsiento);
		
		JLabel lblTituloReserva = new JLabel("Reserva");
		lblTituloReserva.setBounds(482, 99, 71, 14);
		cP.add(lblTituloReserva);
		
		Hashtable Reserva = new Hashtable();
		Hashtable NombreReserva =new Hashtable();
		JButton btnNuevaReserva = new JButton("Agregar");
		btnNuevaReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Filas = (String) cBoFila.getSelectedItem();
				String TipoSillas = (String) cBoTipoSilla.getSelectedItem();
				int Id =0;
				try{
					Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n�mero de Id de la persona que hace la reserva"));
				}catch(NumberFormatException evt) {
					JOptionPane.showMessageDialog(null,"Ingrese s�lo n�meros");
				}
				if(Id==0) {
					JOptionPane.showMessageDialog(null, "No se ha hecho la reserva, vuelva a intentar");
				}else {
					Reserva.put(Filas,TipoSillas);
					NombreReserva.put(Filas,Id);
					cBoFila.removeItem(Filas);
				}
			}
		});
		btnNuevaReserva.setBounds(482, 125, 89, 23);
		cP.add(btnNuevaReserva);
		
		JButton btnEliminarReserva = new JButton("Eliminar");
		btnEliminarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String AReservado = JOptionPane.showInputDialog("Ingrese el asiento reservado");
				Reserva.remove(AReservado);
				JOptionPane.showMessageDialog(null, Reserva);
				if(!(AReservado.isEmpty())) {
					JOptionPane.showMessageDialog(null, "NO se pudo eliminar la reserva");
				}
				else {
					cBoFila.addItem(AReservado);
				}
			}
		});
		btnEliminarReserva.setBounds(571, 125, 89, 23);
		cP.add(btnEliminarReserva);
		
		JButton btnCargarReserva = new JButton("Cargar");
		btnCargarReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Reserva.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay reservas");
				}
				else {
					JOptionPane.showMessageDialog(null, Reserva+"\n"+NombreReserva);
				}
			}
		});
		btnCargarReserva.setBounds(517, 156, 89, 23);
		cP.add(btnCargarReserva);
		
		JLabel lblTituloPago = new JLabel("Pagar con: ");
		lblTituloPago.setBounds(485, 204, 134, 14);
		cP.add(lblTituloPago);
		
		JButton btnEfectivo = new JButton("Efectivo");
		btnEfectivo.addActionListener(new ActionListener() {
			int pagar_general=0;
			int pagar_preferencial=0;
			int total_pagar=0;
			public void actionPerformed(ActionEvent e) {
				String TipoSillas = (String) cBoTipoSilla.getSelectedItem();
				String Filas = (String) cBoFila.getSelectedItem();
				Asiento.put(Filas,TipoSillas);
				int valor_general=8000;
				int valor_preferencial=11000;
				if(TipoSillas.equals("General")) {
					pagar_general=+valor_general;
				}
				else {
					pagar_preferencial=+valor_preferencial;
				}
				total_pagar=pagar_preferencial+pagar_general;
				JOptionPane.showMessageDialog(null,"Desbes pagar: $"+total_pagar+"\npor: "+Filas);
				int DineroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Dinero ingresado para realizar el pago"));
				while(DineroIngresado<total_pagar) {
					DineroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Dinero ingresado para realizar el pago, Falta Dinero"));
				}
				JOptionPane.showMessageDialog(null,"Devolver al usuario: $"+(DineroIngresado-total_pagar));
				cBoFila.removeItem(Filas);
			}
		});
		btnEfectivo.setBounds(485, 229, 89, 23);
		cP.add(btnEfectivo);
		
		JLabel lblTituloTarjeta = new JLabel("Manejo de tarjeta");
		lblTituloTarjeta.setBounds(485, 274, 130, 14);
		cP.add(lblTituloTarjeta);
		
		Hashtable tarjeta = new Hashtable();
		JButton btnCrearTarjeta = new JButton("Crear");
		btnCrearTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Id = 0;
				try {
				Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese n�mero de identificaci�n para crear la tarjeta"));
				}catch(NumberFormatException evt) {
					JOptionPane.showMessageDialog(null, "Ingrese s�lo n�meros");
				}
				if(Id==0) {
				JOptionPane.showMessageDialog(null, "Tarjeta no creada", "Error", 0);	
				}
				else {
				tarjeta.put(Id,70000);
				JOptionPane.showMessageDialog(null, "Tarjeta creada con �xito:\n"+"Id: "+Id+"\nSaldo: $"+70000);
				}
			}
		});
		btnCrearTarjeta.setBounds(571, 299, 89, 23);
		cP.add(btnCrearTarjeta);
		
		JButton btnRecargaTarjeta = new JButton("Recargar");
		btnRecargaTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin = 0;
				try {
				pin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de Id del due�o de la tarjeta"));
				}catch(NumberFormatException evt) {
					JOptionPane.showMessageDialog(null, "Ingrese s�lo n�meros");
				}
				int Recarga = Integer.parseInt(JOptionPane.showInputDialog("Valor a recargar"));
				while(Recarga<50000) {
					Recarga = Integer.parseInt(JOptionPane.showInputDialog("Valor a recargar\nMinimo $50000"));
				}
				int x=(int)tarjeta.get(pin)+Recarga;
				tarjeta.replace(pin,x);
			}
		});
		btnRecargaTarjeta.setBounds(482, 299, 89, 23);
		cP.add(btnRecargaTarjeta);				
		
		JButton btnTarjeta = new JButton("Tarjeta");
		btnTarjeta.addActionListener(new ActionListener() {
			int pagar_general=0;
			int pagar_preferencial=0;
			public void actionPerformed(ActionEvent e) {
				int Id=0;
				try {
					Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n�mero de identificaci�n del due�o de la tarjeta"));
				}catch(NumberFormatException evt){
					JOptionPane.showMessageDialog(null, "Ingrese s�lo n�meros", "Error", 0);
				}
				String TipoSillas = (String) cBoTipoSilla.getSelectedItem();
				String Filas = (String) cBoFila.getSelectedItem();
				Asiento.put(Filas,TipoSillas);
				int valor_general=8000;
				int valor_preferencial=11000;
				if(TipoSillas.equals("General")) {
					pagar_general=+valor_general;
				}
				else {
					pagar_preferencial=+valor_preferencial;
				}
				int total_pagar=pagar_preferencial+pagar_general;
				JOptionPane.showMessageDialog(null,"Se debe pagar: $"+total_pagar+"\npor: "+Filas);
				if(total_pagar<(int)tarjeta.get(Id)) {
					int NuevoSaldo=(int)tarjeta.get(Id)-total_pagar;
					tarjeta.replace(Id,NuevoSaldo);
					cBoFila.removeItem(Filas);
				}
				else {
					JOptionPane.showMessageDialog(null,"Dinero insuficiente","Error",0);
				}
			}
		});
		btnTarjeta.setBounds(571, 229, 89, 23);
		cP.add(btnTarjeta);
		
		JButton btnSaldoTarjeta = new JButton("Consultar");
		btnSaldoTarjeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Id=0;
				try {
					Id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su n�mero de identificaci�n"));
				}catch(NumberFormatException evt) {
					JOptionPane.showMessageDialog(null, "Ingrese s�lo n�meros", "Error", 0);
				}
					if(tarjeta.isEmpty()) {
						JOptionPane.showMessageDialog(null, "No hay tarjetas creadas", "Error", 0);
					}
					else {
						if(tarjeta.get(Id).equals(null)) {
							JOptionPane.showMessageDialog(null, "No tiene una tarjeta con su Id", "Error", 0);
						}else {
						JOptionPane.showMessageDialog(null, "El saldo de: "+Id+"\nEs de: $"+tarjeta.get(Id));
						}
					}
			}
		});
		btnSaldoTarjeta.setBounds(517, 333, 89, 23);
		cP.add(btnSaldoTarjeta);
		
	}
}
