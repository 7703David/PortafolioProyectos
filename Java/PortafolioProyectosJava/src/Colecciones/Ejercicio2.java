package Colecciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//Hace la suma del número de contagiados en una semana
public class Ejercicio2 {

	public static void main(String [] Args) {
		
		ArrayList semana = new ArrayList();
		int ContDia=0;
		//CONTAGIOS POR D�A A LA SEMANA
		for(int dia=0;dia<7;dia++) {
			
			ContDia = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos contagios hubo el día "+(dia+1)+" ?"));
			while(ContDia<0) {
				ContDia = Integer.parseInt(JOptionPane.showInputDialog("ERROR,¿Cuantos contagios hubo el día "+(dia+1)+" ?"));
			}
			semana.add(ContDia);
		}
		//PROMEDIO DE CONTAGIOS SEMANAL
		int suma=0;
		for(int dia=0;dia<7;dia++) {
			suma+=ContDia;
		}
		System.out.println(suma);
	}
}
