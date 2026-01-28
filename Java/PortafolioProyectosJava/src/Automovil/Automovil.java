package Automovil;

public class Automovil
{
	//Atributos
	String marca;
	int modelo;
	int precio;
	
	boolean estado = false;
	
	//constructor
	public Automovil()
	{
		System.out.println("Se ha creado un objeto de tipo automovil ");
		//this.marca=marca;
		//this.modelo=modelo;
		//this.precio=precio;
	}
	//Métodos o funciones: void=Se realizan las operaciones y en tal caso se generan resultados
	public void encender()
	{
		if(estado==true)
		{
		System.out.println("El automóvil ya está encendido");
		}
		else
		{
			System.out.println("El automóvil se ha encendido");
			estado=true;
		}
	}
	public void apagar()
	{
		if(estado==true)
		{
			System.out.println("El automóvil se apagó");
			estado=false;
		}
		else
		{
			System.out.println("El automóvil se ha apagado");
		}
	}
	public void avanzar()
	{
		if(estado==true)
		{
			System.out.println("El automóvil está avanzando");
		}
		else
		{
			System.out.println("El automóvil no puede avanzar, está apagado");
		}
	}
}
