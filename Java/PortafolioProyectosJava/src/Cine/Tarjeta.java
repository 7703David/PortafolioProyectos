package Cine;

import java.util.Hashtable;

public class Tarjeta {

	String Nombre;
	String Contrasenia;
	
	public Tarjeta(String Nombre, String Contrasenia) {
		this.Nombre = Nombre;
		this.Contrasenia = Contrasenia;
	}
	
	public Hashtable<String,String> crear_tarjeta(String Nombre,String Contrasenia) {
		Hashtable<String,String> user = new Hashtable<String,String>();
		user.put(Nombre,Contrasenia);
		return user;
	}
}
