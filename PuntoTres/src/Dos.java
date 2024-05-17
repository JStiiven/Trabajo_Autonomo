import javax.swing.JOptionPane;

public class Dos {

	public static void main(String[] args) {
		int mayorDeEdad=0;
		
		mayorDeEdad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad para determinar si es mayor de edad"));
		
		if (mayorDeEdad >= 18) {
			JOptionPane.showMessageDialog(null, "Usted es mayor de edad");
		} else {
			JOptionPane.showMessageDialog(null, "Usted no es mayor de edad");
		}

	}

}
