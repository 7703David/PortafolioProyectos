package EjerciciosIniciales;
import javax.swing.JOptionPane;

public class Prenda 
{
	String Marca;
	String Tipo;
	String Color;
	String Talla;
	int Precio;

	public static void main(String[] args)
	{
		Prenda pre =new Prenda();
		pre.Marca=JOptionPane.showInputDialog(null,"Escriba la marca de la prenda que desea comprar: ");
		pre.Tipo=JOptionPane.showInputDialog(null,"�Que tipo de prenda desea?camiseta,saco,pantaloneta...");
		pre.Precio=Integer.parseInt(JOptionPane.showInputDialog(null,"�De que precio es la prenda?"));
	
		while(pre.Precio<=20000)
		{
			JOptionPane.showMessageDialog(null,"ERROR, ingrese un valor v�lido");
			pre.Precio=Integer.parseInt(JOptionPane.showInputDialog(null,"�De que precio es la prenda?"));
		}
	
		pre.Talla=JOptionPane.showInputDialog("�De que talla es su prenda?");
		pre.Color=JOptionPane.showInputDialog("�De que color es la prenda?");
		
		JOptionPane.showMessageDialog(null,"Las caracteristicas de su prenda son:\n"+"Marca: "+pre.Marca+"\n"
		+"Tipo de prenda: "+pre.Tipo+"\n"+"Talla: "+pre.Talla+"\n"
		+"Color: "+pre.Color+"\n"+"Precio: $"+pre.Precio+"COP");
	
		System.out.println("Las caracteristicas de su prenda son:\n"+"Marca: "+pre.Marca+"\n"
		+"Tipo de prenda: "+pre.Tipo+"\n"+"Talla: "+pre.Talla+"\n"
		+"Color: "+pre.Color+"\n"+"Precio: $"+pre.Precio+"COP");
	}
}
