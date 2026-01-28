package Empleado;
import javax.swing.JOptionPane;
//Determinar los siguientes datos de un empleado:
//edad, tiempo en la empresa, salario neto, valor de cesantias, valor de vacaciones y el valor de la prima
public class Empleado {
	public static void main(String [] args) {
		Atributos_Empleado Ae = new Atributos_Empleado();
		
		String nombre = JOptionPane.showInputDialog("Ingrese sus nombres (Sin apellidos)");
		String apellido = JOptionPane.showInputDialog("Ingrese sus apellidos");
		String gener = JOptionPane.showInputDialog("Ingrese su genero\n-masculino\n-femenino");
		while (!(gener.equals("masculino")||gener.equals("femenino"))){
			JOptionPane.showMessageDialog(null, "ERROR, ingrese si su genero es masculino o femenino");
			gener = JOptionPane.showInputDialog("Ingrese su genero\\n-masculino\\n-femenino");
		}
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento"));
		while (dia<=0||dia>31) {
			dia = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese el día de nacimiento"));
		}
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de nacimiento"));
		while (mes<=0||mes>12) {
			mes = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese el mes de nacimiento"));
		}
		int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
		while (anio<1921||anio>2025) {
			anio = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese el a�o de nacimiento"));
		}
		
		int diaI = Integer.parseInt(JOptionPane.showInputDialog("Digite el día de ingreso a la empresa"));
		while (diaI<=0||diaI>31) {
			JOptionPane.showMessageDialog(null, "ERROR");
			diaI = Integer.parseInt(JOptionPane.showInputDialog("Digite el día de ingreso a la empresa"));
		}
		int mesI = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de ingreso a la empresa"));
		while (mesI<=0||mesI>12) {
			JOptionPane.showMessageDialog(null, "ERROR");
			mesI = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de ingreso a la empresa"));
		}
		int anioI = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de ingreso a la empresa"));
		while (anioI<1921||anioI>2025) {
			JOptionPane.showMessageDialog(null, "ERROR");
			anioI = Integer.parseInt(JOptionPane.showInputDialog("Digite el año de ingreso a la empresa"));
		}
		
		
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado con todas las prestaciones de ley"));
		while (sueldo<908526) {
			JOptionPane.showMessageDialog(null, "ERROR, El sueldo debe ser mínimo de $908532");
			anioI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));
		}
		int diast = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días trabajados por el empleado mensualmente"));
		while (diast<=0||diast>30) {
			JOptionPane.showMessageDialog(null, "ERROR");
			diast = Integer.parseInt(JOptionPane.showInputDialog("Digite el día de ingreso a la empresa"));
		}
		
		String name = Ae.name(nombre, apellido);
		Ae.Edad(dia, mes, anio);
		int antiguedad = Ae.antiguedad(diaI, mesI, anioI);
		Ae.pagoEmpleado(sueldo,diast);
		Ae.cesantias(antiguedad, diast, sueldo);
		Ae.vacaciones(antiguedad);
		Ae.primalegal(antiguedad,sueldo);
		Ae.imprimir(name,gener,antiguedad);
	}
}



