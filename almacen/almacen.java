import java.util.Scanner;


public class Escritorios {

	public static double descuento(double numescritorios, double porcentaje) {
		  
double descuento1, precio, preciofinal;
		
		precio = numescritorios*800000;
		descuento1 = (precio*porcentaje)/100;
		preciofinal = precio-descuento1;
		return preciofinal;
	}

	public static void main(String args[]) {
		Scanner x = new Scanner(System.in);
		double numescritorios;
		System.out.println("Ingrese Cuantos escritorios va a comprar");
		numescritorios = x.nextDouble();
		if (numescritorios<5) {
			System.out.println("!Gano un descuento de 10%¡ El total de compra es de : "+descuento(numescritorios,10));
		} else {
			if (numescritorios>=5 && numescritorios<10) {
				System.out.println("!Gano un descuento de 20%¡ El total de compra es de : "+descuento(numescritorios,20));
			} else {
				if (numescritorios>=10) {
					System.out.println("!Gano un descuento de 40%¡ El total de compra es de : "+descuento(numescritorios,30));
				}
			}
		}
	}

}