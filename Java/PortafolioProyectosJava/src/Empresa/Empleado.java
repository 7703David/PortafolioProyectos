package Empresa;

public class Empleado extends Empresa{

	public Empleado(String Nombre, String Apellido, String Cargo, int Edad, String Genero) {
		super(Nombre, Apellido, Cargo, Edad, Genero);
	}
	
	void DatosEmpleado(String Nombre, String Apellido,String Cargo, int Edad, String Genero) {
		System.out.println("Nombre: "+Nombre+"\nApellido: "+Apellido+"\nCargo: "+Cargo+"\nEdad: "+Edad+" años\nGenero: "+Genero);
	}
	
}
