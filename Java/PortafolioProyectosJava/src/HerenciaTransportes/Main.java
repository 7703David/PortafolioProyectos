package HerenciaTransportes;
public class Main {

	public static void main(String [] args) {
		Automovil carro = new Automovil();
		
		carro.avanzar();
		carro.detener();
		
		Aeronave avion = new Aeronave();
		avion.avanzar();
		avion.detener();
	}
}
