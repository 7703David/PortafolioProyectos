package HerenciaFigurasGeometricas;

public class Figuras {

	double lado1;
	double lado2;
	double base;
	double altura;
	double radio;
	
	
	public Figuras(double lado1, double lado2, double base, double altura, double radio) {
		this.base = base;
		this.altura = altura;
		this.radio = radio;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	void MostrarResultados(double area, double perimetro) {
		System.out.println("El area de la figura es: "+area);
		System.out.println("El perimetro de la figura es: "+perimetro);
	}
}