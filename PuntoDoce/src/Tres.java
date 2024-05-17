import java.util.Hashtable;

public class Tres {

	public static void main(String[] args) {
		Hashtable<Integer, String> marcas = new Hashtable<Integer, String>();
		
		marcas.put(8, "Nike");
		marcas.put(9, "Puma");
		marcas.put(3, "Adidas");
		marcas.put(20, "Scpetre");
		
		System.out.println(marcas.size());
		
		System.out.println(marcas.get(3));
		
		System.out.println(marcas);

	}

}
