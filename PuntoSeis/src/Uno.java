import javax.swing.JOptionPane;

public class Uno {

	public static void main(String[] args) {
		int pregunta = 0;
		do {
			pregunta=Integer.parseInt(JOptionPane.showInputDialog("Desea salir? Ingrese 1 para si y cualquier otro para no."));
		} while (pregunta != 1);
	}

}
