import java.util.Scanner;

public class Operaciones{}
 private Scanner teclado;
 private int num1;
 private int num2;
 teclado=new Scanner(System.in);
 System.out.println("Ingrese el primer numero:");
 num1=teclado.nextint();
 System.out.println("Ingrese el segundo numero:");
 num2=teclado.nextint();
}

public class calcular{
	private Scanner two;
	private int total;
	two=new Scanner(System.in);
	private int opcion;
	System.out.println("Elije una opciòn");
	System.out.println(" ");
	System.out.println("*********");
	System.out.println("1. Sumar");
	System.out.println("2. Restar");
	System.out.println("3. Multiplicar");
	System.out.println("4. Dividir");
	System.out.println("*********");
	System.out.println("");
	System.out.println("");
	opcion=two.nextint();
	if (opcion = 1){
		total=num1+num2;
		System.out.println("El total de la suma de "+num1+" y "+num2+"es "+total+" .");
	}
	else if (opcion = 2){
		total=num1-num2;
		System.out.println("El total de la resta de "+num1+" y "+num2+"es "+total+" .");
	}
	else if (opcion = 3){
		total=num1*num2;
		System.out.println("El total de la multiplicacion de "+num1+" y "+num2+"es "+total+" .");
	}
	else if (opcion = 4){
		total=num1/num2;
		System.out.println("El total de la division de "+num1+" y "+num2+"es "+total+" .");
	}
	else {
		System.out.println("No. Elejiste una opcion que no existe. Porque me haces esto? Ahora estoy triste y voy a tener que hacer codigo para una condicion mas. Chau, me voy a llorar en la esquina.")
	}
}