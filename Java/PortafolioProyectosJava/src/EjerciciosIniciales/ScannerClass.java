package EjerciciosIniciales;
import java.util.Scanner;
//Uso del ScannerClass
public class ScannerClass 
{	
	public static void main(String[] args)
	{
		try (Scanner entrada = new Scanner(System.in)) {
			String producto;
			char inicial;
			int cantidad,precio;
			
			System.out.println("Ingrese la inicial de su nombre");
			inicial = entrada.next().charAt(0);		
			entrada.nextLine();//Colocando este nextLine(), hacemos que el siguiente nextLine() tome lo ingresado y no el \n de println
			System.out.println("Ingrese el producto: ");
			producto = entrada.nextLine();//next hasta encontrar espacio, nextLine toma todo el texto ingresado		
			System.out.println("Ingrese el n�mero de "+producto+" que desee llevar");
			cantidad = entrada.nextInt();
			while(cantidad<1)
			{
				System.out.println("ERROR, valor NO v�lido");
				System.out.println("Ingrese el n�mero de "+producto+" que desee llevar");
				cantidad = entrada.nextInt();
			}
			System.out.println("�Cu�l es el precio de "+producto+"? Por unidad");
			precio = entrada.nextInt();
			while(precio<1)
			{
				System.out.println("ERROR, valor NO v�lido");
				System.out.println("�Cu�l es el precio de "+producto+"? Por unidad");
				precio = entrada.nextInt();
			}
			
			System.out.println("La inicial de su nombre es: "+inicial+
					"\nEl producto es: "+producto+"\nla cantidad de productos es: "
					+cantidad+"\nEl precio del producto unitario es: $"+precio+"COP"+
					"\nEl precio total es: $"+(precio*cantidad)+"COP");
		}
	}
}
