package HerenciaAudio;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String [] args) {
		
		int nivelRuido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de volumen en decibeles: "));
		while (nivelRuido<=0||nivelRuido>136) {
			JOptionPane.showMessageDialog(null,"ERROR, el nivel de decibeles debe ser de 0 a 135");
		}
		
		Parlante obj = new Parlante(nivelRuido);		
		obj.encender();
		obj.volumen();
		obj.apagar();
		obj.volumen();
		obj.encender();
		obj.apagar();
		obj.apagar();
	}
}
