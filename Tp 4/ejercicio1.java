import java.util.Scanner;

public class Clase1{{
	public static void main (String[]ar) {
	
		Scanner teclado=new Scanner(System.in);
		int f;
		int g;
		System.out.print("Ingresar numero 1: ");
		f=teclado.nextint();
		System.out.print("Ingresar numero 1: ");
		f=teclado.nextint();
		h=f+g;
		i=f-g;
		j=f*g;
		k=f/g;
		System.out.print("Suma de "+f+" y "+g+" es "+h);
		System.out.print("Resta de "+f+" y "+g+" es "+i);
		System.out.print("Multiplicacion de "+f+" y "+g+" es "+j);
		System.out.print("Division de "+f+" y "+g+" es "+k);
	}
}