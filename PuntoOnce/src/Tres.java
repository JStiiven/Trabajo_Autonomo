import java.util.ArrayList;

public class Tres {

	public static void main(String[] args) {
		ArrayList<String> nombreCambio = new ArrayList<String>();
		
		nombreCambio.add("Totoy");
		nombreCambio.add("Alan");
		nombreCambio.add("Dayana");
		
		System.out.println("Lista Nombres original:\n"+nombreCambio);
		
		nombreCambio.set(0, "Luis");
		
		System.out.println("Lista nombre actualizada:\n"+nombreCambio);
	}

}
