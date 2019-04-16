import java.util.Scanner;

public class Clase1{
	public static void main(String[]ar){
	
	Scanner teclado=new Scanner(System.in);
	int cantidad;
	float precio;
	float importe;
	System.out.println("ingrese el valor unitario del producto:");
	precio=teclado.nextfloat();
	Sytem.out.println("ingrese la cantidad de articulos que quiere llevar:");
	cantidad=teclado.nextint();
	importe=precio*cantidad;
	System.out.println("El importe a pagar es:");
	System.out.println(importe);
	}
}