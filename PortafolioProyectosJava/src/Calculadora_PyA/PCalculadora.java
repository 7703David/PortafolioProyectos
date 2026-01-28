package Calculadora_PyA;
import javax.swing.JOptionPane;

public class PCalculadora {
	public static void main(String[] args) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
		double num2;
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
		while(num2==0) {
			JOptionPane.showMessageDialog(null, "ERROR, Ingrese un número diferente de 0, ya que al dividir dara una indeterminaci�n");
			num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
		}
		
		Calculadora op = new Calculadora();//crear objeto
		
		//Sin devolver valores = void
		
		op.suma(5,7,21);//Colocar los número
		op.resta(num1, num2);//Pedir los números
		op.muesta_resultados();
		
		//retornando valores: se necesita un objeto
		
		//Imprimir mediante m�todo
		double multi = op.multi(num1, num2);
		op.muestra_multi(multi);//se crea como parámetro la multiplicación del método muestra_multi(parámetro);
		
		//Imprimir directamente:
		double divi = op.divi(num1,num2);//variables locales, se llama a: == divi(parámetros); ==
		System.out.println("La divisi�n es: "+divi);//tiene que imprimirse aquí, porque es donde existe la variable local 
	}
}
