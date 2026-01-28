package HashTable;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JOptionPane;

public class CrearRegistro {
//TAREA: INVESTIGACIÓN HASHTABLE
	//Crear HASHTABLE de 5 registros con una llave (id) para un nombre
	public static void main(String [] args) {
		CrearRegistro MiAplicacion = new CrearRegistro();
		MiAplicacion.iniciar();
	}
	private void iniciar() {
		//Crear la hash table
		Hashtable<Integer,String> tablaNombres = new Hashtable<Integer,String>();
		
		for(int i=0;i<5;i++) {
			//Pedir la llave donde se almacenar� el dato
			Integer key=Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave"));
			//Pedir el dato
			String nombre=JOptionPane.showInputDialog("Ingrese nombre");
			//Almacenar en hashtable
			tablaNombres.put(key,nombre);
		}
		//Para recorrer los datos
		recorrerTablaHash(tablaNombres);
	}
	private void recorrerTablaHash(Hashtable<Integer, String> tabla) {
		Enumeration<String> enumeration=tabla.elements();//Recorre el String, en este dato los nombres
		Enumeration<Integer> enumerationKeys=tabla.keys();//Recorre las llaves
		while(enumeration.hasMoreElements()) {
			System.out.println(enumerationKeys.nextElement()+" - "+enumeration.nextElement());
		}
	}
}