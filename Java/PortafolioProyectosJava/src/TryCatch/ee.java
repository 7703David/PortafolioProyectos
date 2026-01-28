package TryCatch;
import java.util.Scanner;
//Ejercicio para entender TryCatch
public class ee {
	public static void main(String [] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int num1=0;
			int num2=0;
			boolean estado = true;
			
			while(estado==true) {
				try {
					System.out.print("Ingrese el primer valor: ");
					num1 = entrada.nextInt();
					if (num1>0) {
						estado = false;
					}
					else {
						System.out.println("Error, Ingrese el primer valor com número positivo");
					}
				}
				catch(Exception ll) {
					System.out.println("Error en la captura del primer dato");
					entrada.nextLine();
				}
			}
			
			estado = true;
			
			while(estado==true) {
				try {
					System.out.println("Ingrese el segundo valor: ");
					num2 = entrada.nextInt();
					if (num2>0) {
						estado = false;
					}
					else {
						System.out.print("Ingrese el primer valor com número positivo: ");
					}
				}
				catch(Exception ll) {
					System.out.println("Error en la captura del segundo dato");
					entrada.nextLine();
				}
			}
			System.out.println("Los números ingresados son: "+num1+" y "+num2);
		}
	}
}
