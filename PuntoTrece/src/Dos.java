import java.util.HashMap;

public class Dos {

	public static void main(String[] args) {
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "Hola!");
		mapa.put(2, "Como");
		mapa.put(3, "Estas?");
		
		System.out.println(mapa.get(1));
		
		mapa.remove(1);
		
		System.out.println(mapa.get(1));
		

	}

}
