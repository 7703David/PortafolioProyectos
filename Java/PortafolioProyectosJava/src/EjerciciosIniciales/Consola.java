package EjerciciosIniciales;
import javax.swing.JOptionPane;

public class Consola 
{
	String Nombre;
	char Suscripcion;
	String Valsus;
	String Color;
	String Juegos;
	int Talmacenamiento;
	
	public static void main(String[] args)
	{
		
		Consola con =new Consola();
		con.Nombre=JOptionPane.showInputDialog("Escriba la letra en min�scula de la consola que desea comprar: \nNintendo \nXbox \nPlayStation");
		while(!(con.Nombre.equals("PLayStation") || con.Nombre.equalsIgnoreCase("Nintendo") || con.Nombre.equalsIgnoreCase("Xbox")))
		{
			JOptionPane.showMessageDialog(null,"ERROR, ingrese las palabras de la siguiente manera:\nNintendo\nXboxOne\nPLayStation");
			con.Nombre=JOptionPane.showInputDialog("�Ingrese la letra EN MAYUSCULA de la consola que desea comprar: \nNintendo \nXbox\nPlayStation");
		}
		con.Suscripcion=JOptionPane.showInputDialog("�Desea suscripci�n para jugar Online?(s/n)").charAt(0);
		while(!(con.Suscripcion == 's' || con.Suscripcion == 'n'))
		{
			JOptionPane.showMessageDialog(null,"ERROR, ingrese (s) para SI o (n) para NO--min�scula--");
			con.Suscripcion=JOptionPane.showInputDialog("�Desea suscripci�n para jugar Online?(s/n)").charAt(0);
		}
		if(con.Suscripcion=='s') 
		{
			con.Valsus = "Si";
		}
		else
		{
			con.Valsus = "No";
		}
		
		con.Talmacenamiento=Integer.parseInt(JOptionPane.showInputDialog("�De que tama�o desea el almacenamiento?\n128GB\n254GB\n512GB\n1000GB"));
		while(!(con.Talmacenamiento==128 || con.Talmacenamiento==254 || con.Talmacenamiento==512 || con.Talmacenamiento==1000))
		{
			JOptionPane.showMessageDialog(null,"ERROR, ingrese un valor v�lido (128,254,512,1000");
			con.Talmacenamiento=Integer.parseInt(JOptionPane.showInputDialog(null,"�De que tama�o desea el almacenamiento?En GB"));
		}
		
		con.Juegos=JOptionPane.showInputDialog("�Con sola con juegos de CD o de la nube?");
		
		con.Color=JOptionPane.showInputDialog("�Que color desea?");
		
		JOptionPane.showMessageDialog(null,"Las caracteristicas de su consola son:\n"+"Nombre: "+con.Nombre+"\n"
		+"Suscripci�n online: "+con.Valsus+"\n"+"Tama�o de almacenamiento: "+con.Talmacenamiento+"GB\n"
		+"Tipo de Juegos: "+con.Juegos+"\n"+"Color: "+con.Color);	
	}
}
