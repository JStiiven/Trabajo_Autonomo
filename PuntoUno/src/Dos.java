import java.util.Scanner;
public class Dos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		        
		System.out.print("Ingrese el primer numero a sumar: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Ingrese el segundo numero a sumar: ");
		int num2 = entrada.nextInt();
		        
		int suma = num1 + num2;
		System.out.println("La suma de los dos numeros es: " + suma);
	}

}
