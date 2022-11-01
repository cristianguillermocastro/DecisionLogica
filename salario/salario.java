import java.util.Scanner;

public class Salario{

	public static void main(String args[]){
    Scanner x = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = x.nextLine();
		System.out.println("Ingresa tu salario por hora");
		double salario = x.nextDouble();
		System.out.println("Cuantas horas trabajas");
		double horas = x.nextDouble();
		double salariofinal = salario*horas;
		if (salariofinal>450000) {
			System.out.println(nombre+" tu salario es: "+salariofinal);
		} else {
			System.out.println(nombre);
		}
	}
}
