import java.util.Scanner;

public class Empleado {
 private Scanner teclado;
 private String nombre;
 private String apellido;
 private int sueldo;
 teclado=new Scanner(System.in);
 System.out.println("Ingrese nombre:");
 nombre=teclado.next();
 System.out.println("Ingrese apellido:");
 apellido=teclado.next();
 System.out.println("Ingrese sueldo:");
 sueldo=teclado.nextInt();
}
public void imprimir() {
 System.out.println("Nombre:"+nombre);
 System.out.println("Apellido:"+apellido);
 System.out.println("Sueldo:"+sueldo);
 }
 public void sonImpuestos() {
 if (sueldo>=3000) {
 System.out.print(nombre+""+apellido+" debe pagar impuestos.");
 } else {
 System.out.print(nombre+""+apellido+" No debe pagar impuestos");
 }
 }
 