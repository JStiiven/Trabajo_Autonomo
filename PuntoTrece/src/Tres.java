import java.util.HashMap;

public class Tres {

	public static void main(String[] args) {
		HashMap<Integer, String> numero = new HashMap<Integer, String>();
		
		numero.put(1, "Uno");
		numero.put(2, "Dos");
		numero.put(3, "Tres");
		
		System.out.println(numero);
		
		numero.remove(3);
		
		System.out.println(numero);
	}

}
