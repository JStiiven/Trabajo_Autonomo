import java.util.HashMap;

public class Uno {

	public static void main(String[] args) {
		HashMap<String, String> nombres = new HashMap<String, String>();
		
		nombres.put("Stiven", "Ortega");
		nombres.put("Kevin", "Ortega");
		nombres.put("Tania", "Garcia");
		
		System.out.println("Lista nombres: "+nombres);
		
		nombres.remove("Tania");
		
		System.out.println("Nombres-Personas actualizadas en la lista: "+nombres);
	}

}
