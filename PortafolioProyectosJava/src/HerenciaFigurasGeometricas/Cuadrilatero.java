package HerenciaFigurasGeometricas;

public class Cuadrilatero extends Figuras{

	public Cuadrilatero(double lado1, double lado2, double base, double altura, double radio) {
		super(lado1,lado2,base, altura, radio);
		
		System.out.println("Se ha creado el objeto cuadrilatero");
		}

		double area(double lado1, double lado2) {
			
			double area = lado1*lado2;
			return area;
		}
		double perimetro(double lado1, double lado2) {
			
			double perimetro = ((lado1+lado2)*2);	
			return perimetro;
		}
		void tipo(double lado1, double lado2){
			if(lado1==lado2){
				System.out.println("El cuadrilatero es un cuadrado");
			}
			else {
				System.out.println("El cuadrilatero es un rect�ngulo o romboide");
			}
		}
	}

