import javax.swing.JOptionPane;

public class Dos {

	public static void main(String[] args) {
		int pregunta=0;
		do {
			pregunta=Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes?"));
			if (pregunta < 18) {
				JOptionPane.showMessageDialog(null, "Usted no es mayor de edad!",":(",JOptionPane.WARNING_MESSAGE);
			}
		} while (pregunta < 18);
		JOptionPane.showMessageDialog(null, "Usted es mayor de edad!",":)",JOptionPane.WARNING_MESSAGE);
	}

}
