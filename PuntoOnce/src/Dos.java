import java.util.ArrayList;

public class Dos {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println("Lista numeros:\n"+numeros);
		
		numeros.remove(0);
		
		System.out.println("Lista numeros actualizados:\n"+numeros);
	}

}
