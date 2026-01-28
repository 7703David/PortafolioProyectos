package EjerciciosIniciales;
import javax.swing.JOptionPane;

public class Carro 
{
	String Marca;
	String Transmision;
	String Color;
	String Modelo;
	int Cilindraje;
	
	public static void main(String[] args)
	{
		Carro car =new Carro();
		car.Marca=JOptionPane.showInputDialog("Escriba la marca del carro que desea comprar: ");
		car.Modelo=JOptionPane.showInputDialog("Escriba el modelo del carro");
		car.Cilindraje=Integer.parseInt(JOptionPane.showInputDialog("Digite el cilindraje del carro en cc"));
		while(car.Cilindraje<=600)
		{
			JOptionPane.showMessageDialog(null,"ERROR, ingrese un valor v�lido");
			car.Cilindraje=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el cilindraje del carro en cc"));
		}
		car.Transmision=JOptionPane.showInputDialog("�Desea transmisi�n autom�tica o manual?");
		car.Color=JOptionPane.showInputDialog("�Que color desea?");
	
		System.out.println("Las caracteristicas de su carro son:\n"+"Marca: "
		+car.Marca+"\n"+"Modelo: "+car.Modelo+"\n"+"Cilindraje: "+car.Cilindraje+"cc\n"
		+"Transmisi�n: "+car.Transmision+"\n"+"Color: "+car.Color);
	}
}
