package Empresa;
import javax.swing.JOptionPane;
//Pasar datos entre clases para la información de un empleado

public class Principal {

	public static void main(String [] args) {

		String Nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
		String Apellido=JOptionPane.showInputDialog("Ingrese el apellido del empleado");
		String Cargo=JOptionPane.showInputDialog("Ingrese el cargo del empleado\n-Vendedor\n-Jefe de Zona\n-Secretario");
		while(!(Cargo.equals("Vendedor")||Cargo.equals("Jefe de Zona")||Cargo.equals("Secretario"))) {
			Cargo=JOptionPane.showInputDialog("ERROR,Ingrese el cargo del empleadotal como se muestra a continuaci�n:\n-Vendedor\n-Jefe de Zona\n-Secretario");
		}
		int Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
		while(Edad<18||Edad>60) {
			Edad=Integer.parseInt(JOptionPane.showInputDialog("Error, Ingrese un edad entre 18 y 60 años"));
		}
		String Genero=JOptionPane.showInputDialog("Ingrese el género del empleado:\n-Masculino\n-Femenino\n-No binario");
		while(!(Genero.equals("Masculino")||Genero.equals("Femenino")||Genero.equals("No binario"))) {
			Genero = JOptionPane.showInputDialog("Error, Ingrese el g�nero del empleado como se muestra a continuación:\n-Masculino\n-Femenino\n-No binario");
		}
		
		Empleado DatosE = new Empleado(Nombre,Apellido,Cargo,Edad,Genero);
		DatosE.DatosEmpleado(Nombre, Apellido, Cargo, Edad, Genero);
	}
	
}
