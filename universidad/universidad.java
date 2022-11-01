import java.util.Scanner;

public class Universidad{

  public static double descuento(double NumCreditos, double porcentaje, double credito ){

    double creditoT, descuento1, precio, preciofinal;
    
    creditoT = credito*NumCreditos;
		descuento1 = (creditoT*porcentaje)/100;
		preciofinal = creditoT-descuento1;
		return preciofinal;
  }

  public static void main(String args[]) {

    
    int programa;
    double promedio, creditoT;
    double credito;
   Scanner x = new Scanner(System.in);
    System.out.println("Tipo de estudios que deseas realizar en la Universidad Whalien (Da tu respuesta con la numeracion correspondiente)\n 1. Pregrado \n 2. Posgrado");
      programa = x.nextInt();

    System.out.println("Cuál es tu promedio, en decimales (ej: 4.0 4.5)");
    promedio = x.nextFloat();

    switch(programa){
      case 1:
        credito =50000;
        if(promedio >4.5){
        System.out.println( "El precio de la carrera con el 25% de descuento:" + descuento(28,25,credito));
          if (promedio <4.5 && promedio >=4.0){
        System.out.println("El precio de la carrera con el 10% de descuento:" + descuento(25,10,credito));
        } if (promedio <4.0 && promedio >=3.5){
          System.out.println("El precio de la carrera es de:"+ (creditoT = credito*20));
        } if (promedio <3.5 && promedio >=2.5){
         System.out.println("El precio de la carrera es de:"+(creditoT = credito*15));
        }
        
        }else{
          System.out.println("No puede matricularse, su promedio es muy bajo");
        }

      break;

      case 2:
        credito =300000;
        if( promedio >= 4.5){
          System.out.println("el precio de la carrera con el 25% de descuento: "+ descuento(20,20,credito));
        }else{
          System.out.println("el precio de la carrera es de: $"+ (creditoT = credito*10));
        }
        break;
      default:
        System.out.println("Error al ellegir el tipo de carrera");
        break;
        
    }
    
  }
}