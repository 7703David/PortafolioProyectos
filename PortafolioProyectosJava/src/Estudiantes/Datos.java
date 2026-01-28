package Estudiantes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;
//EJERCICIO HASHTABLE: ESTUDIANTES Y EDADES
//Agregar o elimnar estudiantes en una lista inicialmente vacía, junto con su edades, organizar por edades (menor a mayor), consultar estudiante menor o mayor
public class Datos {
	
	public static void main(String [] Args) {
		ArrayList Nombre = new ArrayList();
		ArrayList<Integer> Edad = new ArrayList();
		
		int NumEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de estudiantes que desee agregar a la lista"));
		String NomEstudiante;
		
		int EMayor=17;
		String NomEMayor = null;
		int EMenor=26;
		String NomEMenor = null;
		int ValEdad=26;
		int EdadEstudiante = 0;
		int agregar = 0;
		int TotalEstudiantes = NumEstudiantes+agregar;
		while(NumEstudiantes<=0) {
			NumEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese un número de estudiantes válido que desee agregar a la lista"));
		}
		
		for(int i=0;i<NumEstudiantes;i++) {
			NomEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del estudiante número "+(i+1));
			EdadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante número "+(i+1)+"\n Nota: Debe tener entre 18 y 25 años"));
			while(EdadEstudiante<18||EdadEstudiante>25) {
				EdadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese una edad válida entre 18 y 25 años para el estudiante número"+(i+1)));
			}
			Nombre.add(i,NomEstudiante);
			Edad.add(i,EdadEstudiante);
			
		}
		System.out.println("los nombres agregados son:				"+Nombre);
		System.out.println("Sus edades respectivas son: 				"+Edad);
		//Men�
		char consola = JOptionPane.showInputDialog("Desea abrir el menú de opciones?(s/n)").charAt(0);
			while(!(consola=='s'||consola=='n')) {
			consola = JOptionPane.showInputDialog("ERROR, Desea abrir el menú de opciones?(s/n)").charAt(0);
			}
			while(consola=='s') {
				int opciones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la acción a realizar\n[1] Agregar estudiantes\n[2] Eliminar estudiantes\n[3] Organizar por edades\n"
						+ "[4] Promedio edades de estudiantes\n[5] Consultar edad de un estudiante específico\n[6] Consultar Estudiante mayor\n[7] Consultar estudiante menor"));
				switch(opciones) {
					case 1: //Agregar estudiante
						agregar = Integer.parseInt(JOptionPane.showInputDialog("Cuantos estudiantes desea ingresar?\n"));
						while(agregar<=0) {
							agregar = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Cuantos estudiantes desea ingresar?"));
						}
						for(int i=0;i<agregar;i++) {
							NomEstudiante = JOptionPane.showInputDialog("Ingrese el nombre del nuevo estudiante ");
							EdadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo estudiante número "+"\n Nota: Debe tener entre 18 y 25 años"));
							while(EdadEstudiante<18||EdadEstudiante>25) {
								EdadEstudiante = Integer.parseInt(JOptionPane.showInputDialog("ERROR, Ingrese una edad válida entre 18 y 25 años para el estudiante número"+(i+1)));
							}
						Nombre.add(NomEstudiante);
						Edad.add(EdadEstudiante);
						}
						System.out.println("=============================================================================");
						System.out.println("los nombres agregados son:				"+Nombre);
						System.out.println("Sus edades respectivas son: 				"+Edad);
					break;
					case 2://Eliminar estudiante
						int NumEliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes a eliminar"));
						while(NumEliminar<0) {
							NumEliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes a eliminar"));
						}
						for (int i = 0; i < NumEliminar; i++) {
							int Eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del estudiante a eliminar\nNota: Recuerde que el conteo empieza desde 0"));
							Nombre.remove(Eliminar);
							Edad.remove(Eliminar);
						}
						System.out.println("=============================================================================");
						System.out.println("los nombres agregados son:				"+Nombre);
						System.out.println("Sus edades respectivas son: 				"+Edad);
					break;
					case 3://Organizar
						TotalEstudiantes=agregar+NumEstudiantes;
						System.out.println("Numero total de estudiantes: "+TotalEstudiantes);
						for(int i=0;i<TotalEstudiantes;i++) {
							int n=0;
							while(Edad.get(i)<ValEdad){
								ValEdad=Edad.get(i);
								Edad.remove(i);
								Edad.add(n,ValEdad);
								Nombre.add(n,Nombre.get(i));
								Nombre.remove((i+1));
								n++;
							}
							int x = (Edad.size());
							while(Edad.get(i)>ValEdad) {
								ValEdad = Edad.get(i);
								Edad.add(x,Edad.get(i));
								Edad.remove(i);
								Nombre.add(x,Nombre.get(i));
								Nombre.remove(i);
								x--;
							}
						}
						System.out.println("=============================================================================");
						System.out.println("El orden de los nombres respecto a sus edades es:	"+Nombre);
						System.out.println("El orden de sus edad respectivamente es:		"+Edad);
					break;
					case 4://Promedio edades
						double n=0;
						for (int i = 0; i < Edad.size() ; i++) {
							n+=Integer.parseInt(Edad.get(i).toString());
						}
						System.out.println("=============================================================================");
						System.out.println("El promedio de edades es de: "+(n/Edad.size()));
					break;
					case 5://Consultar edad estudiante
						int pos=30;
						String b=JOptionPane.showInputDialog("Ingrese el nombre de la persona a buscar");
						for (int i = 0; i < Nombre.size(); i++) {
							if(Nombre.get(i).equals(b)) {
								pos=i;
								System.out.println("=============================================================================");
								System.out.println("La edad del estudiante "+b+" es: "+Edad.get(pos)+" a�os");
							}
						}
						if(pos==30) {
							System.out.println("=============================================================================");
							System.out.println("El nombre ingresado no fue encontrado");
						}
					break;
					case 6://Mayor
						TotalEstudiantes=agregar+NumEstudiantes;
						for (int j = 0; j < TotalEstudiantes; j++) {
							while(EMayor<Edad.get(j)) {
								EMayor=Edad.get(j);
								NomEMayor=(String) Nombre.get(j);
							}
						}
						System.out.println("=============================================================================");
						System.out.println("El estudiante "+NomEMayor+" es el mayor con una edad de: "+EMayor);
					break;
					case 7:
						for (int j = 0; j < TotalEstudiantes; j++) {
							while(EMenor>Edad.get(j)) {
								EMenor=Edad.get(j);
								NomEMenor=(String) Nombre.get(j);
							}
						}
						System.out.println("=============================================================================");
						System.out.println("El estudiante "+NomEMenor+" es el menor con una edad de: "+EMenor);
						break;
					default:
						System.out.println("=============================================================================");
						JOptionPane.showMessageDialog(null, "ERROR, opci�n incorrecta");
						break;
				}	
				consola = JOptionPane.showInputDialog("Desea abrir el men� de opciones?(s/n)").charAt(0);
				while(!(consola=='s'||consola=='n')) {
					consola = JOptionPane.showInputDialog("ERROR, Desea abrir el menú de opciones?(s/n)").charAt(0);
				}
				if(consola=='n') {
					JOptionPane.showMessageDialog(null, "El programa ha finalizado su ejecución");
				}
			}
	}	
}
