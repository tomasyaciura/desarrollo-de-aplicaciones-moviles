import java.util.Scanner;

public class Clase3{{
	public static void main (String[]ar) {
	
		Scanner teclado=new Scanner(System.in);
		int hpm;
		int finals;
		System.out.println("Bienvenido a CALCULO DE PAGO CORRESPONDIENTE A LAS HORAS POR MES DEL TRABAJADOR! Por favor, escribe la cantidad de horas por mes que va a trabajar el trabajador.");
		hpm=teclado.nextint();
		finals=hpm*400
		System.out.println("A un calculo de 400 pesos por hora, el trabajador sera pagado "+finals+" este mes. Viva el capitalismo!");
	}
}