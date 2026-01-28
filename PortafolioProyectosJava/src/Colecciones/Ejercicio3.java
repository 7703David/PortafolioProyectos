package Colecciones;
import java.util.ArrayList;

import javax.swing.JOptionPane;
//Agrega a una ArrayList las notas de diferentes materias e imprime la lista y la cantidad de materias aprobadas y las que no
public class Ejercicio3 {

	public static void main(String [] Args) {
		
		ArrayList notas = new  ArrayList();
		
		//N�mero de notas
		int NumNotas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de notas"));
		double Notas = 0,suma = 0, Promedio = 0;
		int NotasAprob=0;
		int NotasReprob=0;
		while(NumNotas<0) {
			NumNotas = Integer.parseInt(JOptionPane.showInputDialog("Error,Ingrese el n�mero de notas"));
		}
		for(int i=0;i<NumNotas;i++) {
			Notas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota "+(i+1)+": "));
			while(Notas<0||Notas>5) {
				Notas = Double.parseDouble(JOptionPane.showInputDialog("Error,Ingrese la nota \"+NumNotas+\": "));
			}
			if(Notas>2.9 && Notas<5.1) {
				NotasAprob++;
			}
			else {
				NotasReprob++;
			}
			suma+=Notas;
			Promedio = (suma/ NumNotas);
			notas.add(Notas);
		}
		System.out.println("Las notas obtenidas son: "+notas);
		//Notas aprobadas y No aprobadas
		System.out.println("El número de notas aprobadas es: "+NotasAprob);
		System.out.println("El número de notas NO aprobadas es: "+NotasReprob);
		//Promedio
		System.out.println("El promedio de notas es de: "+Promedio);
		
	}
}
