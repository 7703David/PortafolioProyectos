package Persona;
import javax.swing.JOptionPane;
//Clase secundaría de Persona.java
public class Atributos{
	String nombre1,nombre2;
	int edad1,edad2;
	double estatura1,estatura2;
	long id1,id2;
	
	public void nombres(){
		nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del hombre");	
		nombre2 = JOptionPane.showInputDialog("Ingrese el nombred de la mujer");	
	}
	public void edades(){
		edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del hombre en a�os"));
		while(edad1<=0 || edad1>115){
				JOptionPane.showMessageDialog(null,"ERROR, Ingrese un valor valido");
				edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del hombre en a�os"));
			}
		edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mujer en a�os"));
		while(edad2<=0 || edad1>115){
			JOptionPane.showMessageDialog(null,"ERROR, Ingrese un valor valido");
			edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mujer en a�os"));
		}
	}
	public void estaturas(){
		estatura1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura del hombre en metros"));
		while(estatura1<=0 || estatura1>2.30){
				JOptionPane.showMessageDialog(null,"ERROR, Ingrese un valor valido");
				estatura1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura del hombre en metros"));
			}
		estatura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura de la mujer en metros"));
		while(estatura2<=0 || estatura1>2.15){
			JOptionPane.showMessageDialog(null,"ERROR, Ingrese un valor valido");
			estatura2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura de la mujer en metros"));
		}
	}
	public void identidades(){
		id1 = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificaci�n del hombre"));
		while(id1<9999999){
			JOptionPane.showMessageDialog(null,"ERROR, su identificaci�n debe tener m�nimo 8 caracteres");
			id1 = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificaci�n del hombre"));
		}
		id2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificaci�n del hombre"));
		while(id2<9999999){
			JOptionPane.showMessageDialog(null,"ERROR, su identificaci�n debe tener m�nimo 8 caracteres");
			id2 = Long.parseLong(JOptionPane.showInputDialog("Ingrese la identificaci�n de la mujer"));
		}
	}
	public void resultados(){
		JOptionPane.showMessageDialog(null,"==Los nombres son: "+"\nHombre: "+nombre1+"\nMujer: "+nombre2+
				"\n==Las edades son: "+"\nHombre: "+edad1+" a�os"+"\nMujer: "+edad2+" a�os"+
				"\n==Las estaturas son: "+"\nHombre: "+estatura1+"m"+"\nMujer: "+estatura2+"m"+
				"\n==Las identidades son: "+"\nHombre: "+id1+"\nMujer: "+id2);
	}
}
