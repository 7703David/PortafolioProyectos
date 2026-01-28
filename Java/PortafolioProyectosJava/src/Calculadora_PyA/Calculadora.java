package Calculadora_PyA;

//Método void:procedimiento y no devuelven valores, resultados
//Método parámetros y argumentos: retornar
public class Calculadora {
	double suma;
	double resta;
	double multi;
	
	public void suma(double num1,double num2,double num3) {
		suma = num1 + num2 + num3;
	}
	public void resta(double num1,double num2) {
		resta = num1 - num2;
	}
	public double multi(double num1,double num2) {
		multi = num1 * num2;
		return multi;
	}
	public double divi(double num1,double num2) {
		double divi = num1 / num2;
		return divi;
	}
	public void muesta_resultados() {
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
	}
	public void muestra_multi(double multi) {

		System.out.println("La multiplicación es: "+multi);
	}
}
