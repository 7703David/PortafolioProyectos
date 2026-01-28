package HerenciaTransportes;

public class Transporte {
	int capacidad;
	
	public Transporte() {		//constructor
		System.out.println("Se ha creado el transporte");
	}
	
	void avanzar() {
		System.out.println("El transporte est� avanzando");
	}
	
	void detener() {
		System.out.println("El transporte se est� deteniendo");
	}
}
