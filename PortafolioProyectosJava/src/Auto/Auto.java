package Auto;


public class Auto {
	
	//declaración de atributos
	String marca;
	String color;
	int anio;
	int precio;
	
	//uso variables booleanas
	boolean estado = false;
	
	//Declaración del constructor
	public Auto() {
		System.out.println("Se ha creado el objeto Auto");
	}
	
	//Métodos; encender, mover, apagar
	void color(String marca,String color) {
		System.out.println("La marca del auto es "+marca);
		System.out.println("El color del auto es: "+color);
		return;
	}
	
	
	
	public void encender() {
		if(estado==true) {
			System.out.println("El Auto ya está encendido");
		}
		else {
			System.out.println("El Auto se ha encendido");
			estado=true;
		}
	}
	public void avanzar() {
		if(estado=true) {
			System.out.println("El Auto está avanzado");
		}
		else {
			System.out.println("El Auto no puede avanzado, está apagado");
		}
	}
	public void apagar() {
		if(estado==true) {
			System.out.println("El Auto se ha apagado");
			estado=false;
		}
		else {
			System.out.println("El Auto ya está apagado");
		}
	}
	
}
