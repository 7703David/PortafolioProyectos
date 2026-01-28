package Colecciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//Ingresar un número entero positivo en la posición que se elija del array
public class Main {
	public static void main(String [] Args) {
	
		// 4 tipos de utilidades: ArrayList, Stack(pila),Queue(cola),Hashtable(es como un mapa)
		// ArrayList(Arreglo de datos): guarda la informaci�n de forma lista
		
		ArrayList datos = new ArrayList();//Definido de forma din�mica, tambi�n se puede definir un tama�o
		
		// 1. A�adir datos
		datos.add("Dato1");//String
		datos.add(123);//Int
		datos.add(15.4);//Float
		datos.add("A");//Char
		datos.add(4,15000);//pisici�n, variable
		datos.add(3,"Hola Mundo");
		datos.add(1,3.1416);
		
		System.out.println("ArrayList (arreglo de datos)");
		System.out.println(datos);
		
		datos.remove(1);
		System.out.println(datos);
		
		// 1.1 Entregar datos a trav�s de variable
		int valor=100;
		datos.add(valor);
		System.out.println(datos);
		
		//1.2Capturar en una variable un valor v�lido entero pisotivo y adicionarlo a la estructura datos
		int Entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero positivo"));
		while(Entero<=0) {
			Entero = Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese un entero positivo"));
		}
		int Posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posici�n"));
		while(Posicion<0) {
			Posicion = Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese la posicion d�nde dese almacenar"));
		}
		datos.add(Posicion,Entero);
		System.out.println(datos);
	}
	
}
