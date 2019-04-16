import java.util.Scanner;

public class Clase2{{
	public static void main (String[]ar) {
	
		Scanner teclado=new Scanner(System.in);
		int a;
		int b;
		int c;
		int finals;
		char estudiante;
		System.out.println("Ingresa tu nombre: ");
		estudiante=teclado.nextchar();
		System.out.println("Ingresa la nota del primer trimestre: ");
		a=teclado.nextint();
		System.out.println("Ingresa la nota del segundo trimestre: ");
		b=teclado.nextint();
		System.out.print("Ingresa la nota del tercer trimestre: ");
		c=teclado.nextint();
		finals=(a+b+c)/3
		System.out.println("El promedio de "+estudiante+" es "+finals+". ");
		if(finals>=7) {
			System.out.print("Eso es suficiente nota para aprobar!");
		}
		else {
			System.out.print("Desaprobaste el año.")
		}
	}
}