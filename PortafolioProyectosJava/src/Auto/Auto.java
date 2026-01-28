package Auto;


public class Auto {
	
	//declaraci�n de atributos
	String marca;
	String color;
	int anio;
	int precio;
	
	//uso variables booleanas
	boolean estado = false;
	
	//Declaraci�n del constructor
	public Auto() {
		System.out.println("Se ha creado el objeto Auto!!");
	}
	
	//M�todos; encender, mover, apagar
	void color(String marca,String color) {
		System.out.println("La marca del auto es "+marca);
		System.out.println("El color del auto es: "+color);
		return;
	}
	
	
	
	public void encender() {
		if(estado==true) {
			System.out.println("El Auto ya est� encendido");
		}
		else {
			System.out.println("El Auto se ha encendido");
			estado=true;
		}
	}
	public void avanzar() {
		if(estado=true) {
			System.out.println("El Auto est� avanzado");
		}
		else {
			System.out.println("El Auto no puede avanzado, est� apagado");
		}
	}
	public void apagar() {
		if(estado==true) {
			System.out.println("El Auto se ha apagado");
			estado=false;
		}
		else {
			System.out.println("El Auto ya est� apagado");
		}
	}
	
}
