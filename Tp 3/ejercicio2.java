import java.util.Scanner;

public class Clase2{
	public static void main (String[]ar) {
	
		Scanner teclado=new Scanner(System.in);
		int numero
		System.out.print("Ingresar un numero entero positivo: ");
		numero=teclado.nextInt;
		if(numero>0) {
		
			System.out.println("Ha ingresado un numero correcto! :O");
		
		}
		else if (numero==0) {
		
			System.out.println("Tenia que ser positivo. ");
		
		}
		else {
		
			System.out.println("Por favor, ingresa el numero que se solicita.");
		
		}
	
	}
}