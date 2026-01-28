package Cine;

public class Sesion {

	int asientos;
	int asientos_disponibles;
	int valor_boleta;
	int boletas;
	
	public Sesion(int asientos, int asientos_disponibles, int valor_boleta, int boletas) {
		this.asientos = asientos;
		this.asientos_disponibles = asientos_disponibles;
		this.valor_boleta = valor_boleta;
		this.boletas = boletas;
	}
	public int actualizacion_asientos(int boletas) {
		if(asientos_disponibles<boletas) {
			System.out.println("No hay tantas entradas disponibles");
		}
		else {
			asientos_disponibles = asientos_disponibles - boletas;
		}
		return asientos_disponibles;
	}
	public int valor_pagar(int valor_boleta,int boletas) {
		int valor_vendidas = valor_boleta*boletas;
		return valor_vendidas;
	}
}
