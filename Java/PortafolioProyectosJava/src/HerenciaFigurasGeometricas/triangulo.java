package HerenciaFigurasGeometricas;

import javax.swing.JOptionPane;

public class triangulo extends Figuras{

	public triangulo(double lado1, double lado2, double base, double altura, double radio) {
		super(lado1,lado2,base, altura, radio);
		
		System.out.println("Se ha creado el objeto tri�ngulo");
	}
	
	double area(double base, double altura) {
			double area = (base*altura)/2;
			return area;
	}
	
	double perimetro(double base, double altura) {
		double hipotenusa = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		double perimetro = hipotenusa+base+altura;
		return perimetro;
	}
	
	void tipo(double base, double altura) {
		int aagudo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos angulos agudos tiene su tri�ngulo\n Nota: Tenga en cuenta que debe tener 2 o 3 �ngulos agudos \nAngulos Agudos: menos de 90�"));
		while(!(aagudo==3||aagudo==2)) {
			aagudo = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese cuantos angulos agudos tienesu tri�ngulo\n Nota: Tenga en cuenta que debe tener 2 o 3 �ngulos agudos"));
		}
		if(aagudo==3) {
			String ladosIguales = JOptionPane.showInputDialog("�Su tri�ngulo tiene 3 lados iguales?(si/no)");
			while(!(ladosIguales.equals("si")||ladosIguales.equals("no"))) {
				ladosIguales = JOptionPane.showInputDialog("ERROR, �Su tri�ngulo tiene 3 lados iguales?(si/no)");
			}
				if(ladosIguales.equals("si")) {
					System.out.println("Su tri�ngulo es un Acut�ngulo Equil�tero");
					}
				else {
					if(base==altura) {
						System.out.println("Su tri�ngulo es un Acut�ngulo Is�celes");
					}
					else {
						System.out.println("Su tri�ngulo es un Acut�ngulo Escaleno");
					}
				}
		}
		else {
			String arecto = JOptionPane.showInputDialog("�Su tri�ngulo tiene angulo recto?(si/no)");
			while(!(arecto.equals("si")||arecto.equals("no"))) {
				arecto = JOptionPane.showInputDialog("ERROR, �Su tri�ngulo tiene angulo recto?(si/no)\nAngulo recto: 90�");
			}
			if(arecto.equals("si")) {
					if(base==altura) {
						System.out.println("Su tri�ngulo es un Rect�ngulo Is�celes");
					}
					else {
						System.out.println("Su tri�ngulo es un Rect�ngulo Escaleno");
					}
			}
			else {
					if(base==altura) {
						System.out.println("Su tri�ngulo es un Obtus�ngulo Is�celes");
					}
					else {
						System.out.println("Su tri�ngulo es un Obtus�ngulo Escaleno");
					}
			}
		}
	}	
}