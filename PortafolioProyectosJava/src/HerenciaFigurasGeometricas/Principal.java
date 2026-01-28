package HerenciaFigurasGeometricas;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String [] args) {
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
		while(radio<=0) {
			radio = Double.parseDouble(JOptionPane.showInputDialog("ERROR, Ingrese el radio del circulo"));
		}
		double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del cuadril�tero"));
		while(lado1<=0) {
			lado1 = Double.parseDouble(JOptionPane.showInputDialog("ERROR, Ingrese el primer lado del cuadril�tero"));
		}
		double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del cuadril�tero"));
		while(lado2<=0) {
			lado2 = Double.parseDouble(JOptionPane.showInputDialog("ERROR, Ingrese el segundo lado del cuadril�tero"));
		}
		double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del tri�ngulo"));
		while(base<=0) {
			base = Double.parseDouble(JOptionPane.showInputDialog("ERROR, Ingrese la altura del tri�ngulo"));
		}
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del tri�ngulo"));
		while(altura<=0) {
			altura = Double.parseDouble(JOptionPane.showInputDialog("ERROR, Ingrese la altura del tri�ngulo"));
		}
		
		
			System.out.println("======circulo======");
			circulo dcirculo = new circulo(lado1,lado2,base, altura, radio);
			double perimetro2 = dcirculo.perimetro(radio);
			double area2 = dcirculo.area(radio);
			dcirculo.MostrarResultados(area2,perimetro2);
			
			System.out.println("=====cuadril�tero=====");
			Cuadrilatero dcuadrilatero = new Cuadrilatero(lado1,lado2,base, altura, radio);
			double perimetro = dcuadrilatero.perimetro(lado1, lado2);
			double area = dcuadrilatero.area(lado1, lado2);
			dcuadrilatero.tipo(lado1, lado2);
			dcuadrilatero.MostrarResultados(area, perimetro);
				
			System.out.println("======tri�ngulo======");
			triangulo dtriangulo = new triangulo(lado1,lado2,base, altura, radio);
			double perimetro1 = dtriangulo.perimetro(base, altura);
			double area1 = dtriangulo.area(base, altura);
			dtriangulo.tipo(base,altura);
			dtriangulo.MostrarResultados(area1,perimetro1);
				
	}
}