package Operaciones;
import javax.swing.JOptionPane;

public class Operaciones{
	int num1;
	int num2;
	int suma;
	int resta;
	int multi;
	double divi;
	
	//m�todos
	public void capturar_datos(){
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));
		/*while(num1==0){
			JOptionPane.showMessageDialog(null,"ERROR, ingrese un valor diferente de 0");
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor"));	
		}*/
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo valor"));
		while(num2==0){
			JOptionPane.showMessageDialog(null,"ERROR, ingrese un valor diferente de 0");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo valor"));	
		}
		/*while(num2>num1){
			JOptionPane.showMessageDialog(null,"ERROR, El segundo valor no puede ser mayor al primero");
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo valor"));
		}*/
	}
	public void sumar(){
		suma=num1+num2;
	}
	public void resta(){
		resta=num1-num2;
	}
	public void multi(){
		multi=num1*num2;
	}
	public void divi(){
		divi = (num1/num2);//Que no haga la div si num es igual a 0 y no mostrar el resultado
	}
	public void resultados(){
		JOptionPane.showMessageDialog(null,"La suma es: "+suma+"\n"
		+ "La resta es: "+resta+"\n"
		+ "La multiplicación es: "+multi+"\n"
		+ "La división es: "+divi);
	}
}
