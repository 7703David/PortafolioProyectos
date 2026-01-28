package EjerciciosIniciales;
import javax.swing.JOptionPane;

public class Sumas 
{
public static void main(String[] args)
{
	//Declarar variables
	
	double num1,num2;
	
	num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el primer n�mero, debe estar en el rango del 15 - 25"));
		while(15>num1 || num1>25)
		{
			JOptionPane.showMessageDialog(null,"ERROR, Digite n�meros entre 15 y 25");
			num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el primer n�mero"));
		}
		
		
		num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el segundo n�mero"));
		
		while(num2<=0)
			{
			JOptionPane.showMessageDialog(null,"ERROR, Digite n�meros positivos");
			num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el Segundo n�mero"));				
			}
		
	
	//Operaciones
	//suma=num1+num2
	
	//System.out.println("El resultado de la suma es: "+suma);
	
		JOptionPane.showMessageDialog(null,"La suma de "+num1+" + "+num2+" da como resultado: "+(num1+num2));
	
	}
}
