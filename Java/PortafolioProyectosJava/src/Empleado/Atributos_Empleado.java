package Empleado;

import java.util.Calendar;


public class Atributos_Empleado {
	
	String name(String nombre, String apellido) {
		String nombrecompleto = nombre +" "+ apellido;
		return nombrecompleto;
	}
	
	int age;
	void Edad(int dia,int mes,int anio) {
		Calendar inicio = Calendar.getInstance();
		inicio.set(anio, mes-1, dia);
		
		Calendar actual = Calendar.getInstance();
		
		age = actual.get(Calendar.YEAR) - inicio.get(Calendar.YEAR); 
		if(inicio.get(Calendar.DAY_OF_YEAR)>actual.get(Calendar.DAY_OF_YEAR)) {
			age--;
		}
		
	}
	int antiguedad(int diaI,int mesI,int anioI) {
		Calendar inicio = Calendar.getInstance();
		inicio.set(anioI, mesI-1 , diaI);
		
		Calendar hoy = Calendar.getInstance();
		
		int tiempo = hoy.get(Calendar.YEAR)-inicio.get(Calendar.YEAR);
		int meses = (tiempo * 12) + (hoy.get(Calendar.MONTH)- inicio.get(Calendar.MONTH));
		if(inicio.get(Calendar.DATE)<diaI) {
			meses--;
		}
		
		return meses;
	}
	
	double salario,salarioNeto;
	double pagodiario;
	public void pagoEmpleado(double sueldo ,int diast) {
		pagodiario = (sueldo/30);
		salario = pagodiario * diast;
		if (salario<1817052) {
			salario = salario + ((106454*diast)/30);
		}
		salarioNeto = salario - (salario*0.04) - (salario*0.04);//aportes a pención y salud
	}
	
	double valorcesan;
	void cesantias(int antiguedad,int diast, double sueldo) {
		if (antiguedad==12) {
			valorcesan = (sueldo * (diast * 12)) / 365;
		}
		else {
			if(antiguedad>12) {
				double mesest = antiguedad % 12;
				valorcesan = (sueldo * (diast * mesest)) / 365;
			}
			else {
				valorcesan = (sueldo * (diast * antiguedad)) / 365;
			}
		}
	}
	
	double valorvaca;
	void vacaciones(int antiguedad){
		if (antiguedad==12) {
			valorvaca = (pagodiario * ((antiguedad * 15) / 12));
		}
		else {
			if(antiguedad>12) {
				double mesest = antiguedad % 12;
				valorvaca = (pagodiario * ((mesest * 15) / 12));
			}
			else {
				valorvaca = (pagodiario * ((antiguedad * 15) / 12));
			}
		}
	}
	
	double valorpri;
	void primalegal(int antiguedad, double sueldo){
		if (antiguedad==12) {
			valorpri = (sueldo * (antiguedad / 12));
		}
		else {
			if(antiguedad>12) {
				double mesest = antiguedad % 12;
				if(mesest>6) {
					valorpri = ((sueldo * (mesest-6) ) / 12);//se restan 6 meses, porque esa prima ya debió ser cancelada
				}
				else {
					valorpri = ((sueldo * mesest ) / 12);
				}
			}
			else {
				valorpri = ((sueldo * antiguedad) / 12 ) ;
			}
		}
	}
	
	void imprimir(String name, String gener,int antiguedad) {
		System.out.println("El nombre completo del empleado es: "+name);
		System.out.println("El genero del empleado es: "+gener);
		System.out.println("La edad del empleado es: "+age+" años");
		System.out.println("El tiempo que lleva el empleado en la empresa es de es: "+antiguedad+" meses");
		System.out.println("El salario del empleado es de: $"+salarioNeto);
		System.out.println("El valor de sus cesantias es de: $"+valorcesan);
		System.out.println("El valor de sus vacaciones es de: $"+valorvaca);
		System.out.println("El valor de su prima es de: $"+valorpri);
		
	}
}
	//David Enrique Diazgranados Robayo