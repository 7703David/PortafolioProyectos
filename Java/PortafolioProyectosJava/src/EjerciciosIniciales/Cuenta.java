package EjerciciosIniciales;

public class Cuenta {
	int a;
	int b;
	public void setdata(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void showdata() {
		System.out.println("Valor A= "+a);
		System.out.println("Valor de B= "+b);
	}
	public static void main(String args[]) {
		Cuenta obj = new Cuenta();
		obj.setdata(2,3);
		obj.showdata();
	}
	
}
