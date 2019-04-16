import java.util.Scanner;

public class Clase3{{
	public static void main (String[]ar) {
	
		Scanner teclado=new Scanner(System.in);
		int f;
		System.out.print("Ingresar 10 numeros enteros positivos: ");
		for(f=1;f<=10;f++){
		System.outprintln("********");
		System.out.println("numero:");
		f=teclado.nextint();
		if(f%2==0) {
		
			System.out.println("El numero ingresado es par!");
		
		}
		else if (f%2==1) {
		
			System.out.println("El numero ingresado es impar¡ ");
		
		}
		else {
		
			System.out.println("Por favor, ingresa el numero que se solicita.");
		
		}
	
	}
}