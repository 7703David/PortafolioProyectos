package EjerciciosIniciales;
import java.util.Scanner;

public class Pruebas 
{	
	Scanner entrada = new Scanner(System.in);
	int  num1,num2,suma;
	public void tomadatos() 
	{
		System.out.println("Ingrese un n�mero para mostrar su valos sumado de uno en uno hasta x");
		num1 = entrada.nextInt();
		
		System.out.println("Ingrese x");
		num2 = entrada.nextInt();
	}
	
	public void contador()
	{
		while(num2<num1)
		{
			System.out.println("ERROR, X debe ser mayor al primer n�mero ingresado");
			System.out.println("Ingrese x");
			num2 = entrada.nextInt();
		}
		System.out.println("De "+num1+" hasta "+num2+" est�n los n�meros: ");
		while(num1<=num2)
		{
			System.out.println(num1);
			num1++;
		}
	}
	public void suma()
	{
		
		suma = num1+num2;
		System.out.println("La suma de "+num1+" + "+num2+" es: "+suma);
	}
}
