package Colecciones;
//Agregar n cantidad de números a una ArrayList
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ejercicio {

	public static void main(String [] Args) {
		
		ArrayList<Integer> datos = new ArrayList();//Solo dato entero
		int NDatos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n�mero de datos que desee guardar"));
		while(NDatos<=0) {
			NDatos = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese un valor v�lido"));
		}
		for(int c=0;c<NDatos;c++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero entr 5 y 20"));
			while(num<5||num>20) {
				num = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese un n�mero entr 5 y 20"));
			}
			datos.add(num);
		}
		System.out.println(datos);
	}
}
