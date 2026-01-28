package Auto;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		//Creación del objeto
		Auto lambo = new Auto();
		
		String marca = JOptionPane.showInputDialog("¿De que marca desea su auto?");
		String color = JOptionPane.showInputDialog("¿De que color desea su auto?");

		lambo.color(marca, color);
		
		lambo.apagar();
		lambo.avanzar();
		lambo.encender();
		lambo.apagar();
		
		
	}
}
