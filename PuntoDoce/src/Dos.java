import java.util.Hashtable;

public class Dos {

	public static void main(String[] args) {
		Hashtable<String, Integer> personas = new Hashtable<String, Integer>();
		
		personas.put("Stiven", 1107837900);
		personas.put("Maryana", 1096884602);
		personas.put("Andrea", 212345124);
		
		System.out.println(personas.get("Stiven"));
	}

}
