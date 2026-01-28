package HerenciaAudio;

public class Sonido {

	private int nivelRuido;
	
	public Sonido(int nivelRuido){
		this.nivelRuido = nivelRuido;
	}

	public int getnivelRuido() {
		return nivelRuido;
	}
	boolean estado = false;
	
	void encender() {
		if(estado==false) {
			System.out.println("El medio de sonido est� encendiendo");
			estado=true;
		}
		else {
			System.out.println("El medio de sonido est� encendido");
		}
	}
	
	void apagar() {
		if(estado==true) {
			System.out.println("El medio de sonido se est� apagando");
			estado=false;
		}
		else {
			System.out.println("El medio de sonido ya est� apagado");
		}
	}
	
	void volumen() {
		if(estado==true) {
			System.out.println("El medio de sonido se est� reproduciendo");
			System.out.println("El nivel de volumen es de: "+getnivelRuido()+"dB");
		}
		else {
			System.out.println("El medio de sonido no est� reproduciendo, debe estar apagado");
		}
	}
}
