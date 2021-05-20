import java.util.Date;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
	 
	 double i;
	
	 Date fecha = new Date();
	 double subtotal = totalUni();
     double iva = subtotal * 0.21;
	 final double totalFinal = subtotal + iva;
	 
	 nombre();
	 domicilio();
	 
	for(i=0; i==10; i++) { 
	  descripcion();
	  cantidad();
	  precioUnitario();
	
	
	  }
	 
	
	  System.out.println("*************************************************************************************");
      System.out.println("Fecha:" + fecha);
	  System.out.println("*************************************************************************************");
	  System.out.println("Nombre:" );nombre();
	  System.out.println("Domicilio:");domicilio();
      System.out.println("*************************************************************************************");
	  System.out.println("Cant \t |Descripcion \t |P.unit \t |P.total");
	  System.out.println(cantidad() + "\t |" +  descripcion() + "\t\t |"+ precioUnitario() + "\t\t |" + totalUni());
	  System.out.println("*************************************************************************************");
	  System.out.println("Iva:" + iva);
	  System.out.println("Subtotal(Sin iva):" + subtotal);
	  System.out.println("Total:" + totalFinal );
	  System.out.println("*************************************************************************************");
	
	  
		
	}

public static void nombre() {
	Scanner scan = new Scanner(System.in);
	String nombre;
	System.out.println("Ingresar nombre y apellido");
	nombre = scan.nextLine();
   }
public static void domicilio() {
	Scanner scan = new Scanner(System.in);
	String domicilio;
	System.out.println("Ingresar docimicilio");
	domicilio = scan.nextLine();
   }
public static void  descripcion() {
	Scanner scan = new Scanner(System.in);
	String descripcion;
	System.out.println("Ingresar descripcion");
	descripcion = scan.nextLine();
   }
public static void  cantidad() {
	Scanner scan = new Scanner(System.in);
	double cantidad;
	System.out.println("Ingresar cantidad");
    cantidad = scan.nextInt();
   }
public static void  precioUnitario() {
	Scanner scan = new Scanner(System.in);
	double precio;
	System.out.println("Ingresar precio unitario");
	precio = scan.nextInt();
   }
public static double  totalUni() {
	Scanner scan = new Scanner(System.in);
	double totalUni;
	System.out.println("Ingresar precio unitario");
	return totalUni = scan.nextInt();
   }

}