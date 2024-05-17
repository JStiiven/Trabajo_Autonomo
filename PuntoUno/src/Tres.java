import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		        
		System.out.print("Ingrese su nombre: ");
		String nombre = entrada.nextLine();
		        
		System.out.print("Ingrese su edad: ");
		int edad = entrada.nextInt();
		        
		System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
	}

}
