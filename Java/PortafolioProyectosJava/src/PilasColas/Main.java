package PilasColas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Main {
//PILAS Y COLAS
	public static void main(String [] args) {
		//PILAS
		
		//Stack: pila(Lifo,ultimo en entrar primero en salir)
		//push: Insertar elementos en pila
		//pop: Eliminar elementos de una pila
		
		//Declaraci�n pila
		/*Stack elemPila = new Stack();
		//Adicion de elementos
		elemPila.push("Nicolle");
		elemPila.push("Brayan");
		elemPila.push("Margarita");
		
		System.out.println("\nElemntos de la pila:");
		System.out.println(elemPila);
		
		String elemento;
		elemento=(String)elemPila.pop();
		System.out.println("\nElemento eliminado de la pila:");
		System.out.println(elemento);
		
		//Ejercicio 1.1
		Stack<String> nombres = new Stack();
		for(int i=0;i<5;i++) {
			String Name = JOptionPane.showInputDialog("Ingrese un nombre");
			nombres.push(Name);
		}
		System.out.println("\nNombres Agregados a la nueva pila:");
		System.out.println(nombres);
		//Elimincaci�n de elementos
		for(int j=0;j<5;j++) {
			String Delete;
			Delete=(String)nombres.pop();
			System.out.println(nombres);
		}
		System.out.println("Pila vac�a");*/
		
		
		//COLAS
		
		//Add: Inserta elementos 
		//Poll: Elimina primer elemento de la cola
		//peek: Consultar cual es el primer elemento de cola
		//El primero que entra es el prinero que sale
		//Declaracion de cola
		/*Queue cola = new LinkedList();
		//Adici�n de datos
		cola.add("Sandra");
		cola.add(15);
		cola.add(25.2);
		cola.add("A");
		System.out.println(cola);//Impresion datos cola
		System.out.println(cola.peek());//consulta primer dato cola
		System.out.println("Elemento eliminado: "+cola.poll());//elimina primer dato cola
		System.out.println("Lista final de elementos: "+cola);//imprimir cola*/
	
		
		// Hacer una cola y eliminar uno a uno el elemento inicial hasta quedar vacía
		
		Queue<String> elementos = new LinkedList<>();

		for (int m = 0; m < 5; m++) {
		    String element = JOptionPane.showInputDialog("Ingrese un elemento a la cola");
		    elementos.add(element);
		    System.out.println(elementos);
		}

		System.out.println("\nElementos de la cola: " + elementos + "\n");

		// Vaciar la cola mientras tenga elementos
		while (!elementos.isEmpty()) {
		    elementos.poll(); // elimina el primer elemento (FIFO)
		    System.out.println(elementos);
		}

		System.out.println("Cola vacía");
	}
}
