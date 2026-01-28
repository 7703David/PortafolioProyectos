package HerenciaFigurasGeometricas;

public class circulo extends Figuras{

	public circulo(double lado1, double lado2, double base, double altura, double radio) {
		super(lado1,lado2,base, altura,radio);
		
		System.out.println("Se ha creado el objeto circulo");
	}
	
	double area(double radio) {
		double area = 3.1416*Math.pow(radio, 2);
		return area;
	}
	
	double perimetro(double radio) {
		double perimetro = ((2*3.1416)*radio);
		return perimetro;
	}
}
