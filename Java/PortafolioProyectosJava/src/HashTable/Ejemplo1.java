package HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejemplo1 {
//HASHTABLE
	public static void main (String [] args) {
		Hashtable<Integer,String> Hash = new Hashtable<Integer,String>();
		
		Hash.put(0,"Juan");
		Hash.put(1,"Pepe");
		Hash.put(2,"Pablo");
		Hash.put(3,"Luis");
		
		System.out.println(Hash);
		
		System.out.println("\n");
		//Imprimir llaves
		
		for(Enumeration<Integer> e= Hash.keys();e.hasMoreElements();) {
			System.out.println("Llave: "+e.nextElement());
		}
		
		System.out.println("\n");
		//Imprimir valores
		Enumeration<String> e = Hash.elements();
		while(e.hasMoreElements()) {
			System.out.println("Valor: "+e.nextElement());
		}
		
		System.out.println("\n");
		//Imprimir llaves y valores
		System.out.println("Llaves y Valores: ");
		for(Object object : Hash.keySet()) {
				System.out.print(object + "-->"+Hash.get(object)+"\n");
		}
				
		System.out.println("\n");
		//Consola de menus
		char accion=JOptionPane.showInputDialog("Ingrese la opción a elegir\n[+] agregar o editar datos\n[-] eliminar dato\n[?] consultar").charAt(0);
		while(!(accion=='+'||accion=='-'||accion=='?')) {
		}
		switch (accion) {
		case '+':
			int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos datos quiere agregar o editar"));
			while(num<=0) {
					num = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese cuantos datos quiere agregar o editar"));
			}
			for (int i = 0; i < num; i++) {
				int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde guardar el dato agregado o la llave del dato a editar"));
				while(posicion<0) {
					posicion = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese donde guardar el dato agregado"));
				}
				String valor = JOptionPane.showInputDialog("Ingrese donde guardar el dato agregado");
				Hash.put(posicion, valor);
				System.out.println("Nuevas(Agregado/Editado) Llaves y Valores: ");
				for(Object object : Hash.keySet()) {
						System.out.print(object + "-->"+Hash.get(object)+"\n");
				}
				
			}
					break;
				case '-' :
					int Borrar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la llave del dato a borrar"));
					System.out.println("VALOR A ELIMINAR: "+Hash.get(Borrar));
					Hash.remove(Borrar);
					System.out.println("Nuevas(Eliminado) Llaves y Valores: ");
					for(Object object : Hash.keySet()) {
							System.out.print(object + "-->"+Hash.get(object)+"\n");
					}
					break;
				case '?' :
					int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la llave del dato que desea ver"));
					System.out.println("VALOR CONSULTADO: "+Hash.get(n));
					break;
				default:
					System.out.println("Fin");
					break;
		}
	}
}
