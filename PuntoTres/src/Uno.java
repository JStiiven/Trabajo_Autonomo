import javax.swing.JOptionPane;

public class Uno {

	public static void main(String[] args) {
		int edadEntrada=0;
		
		edadEntrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad para determinar si puede entrar al bar"));
		
		if (edadEntrada>=18) {
			JOptionPane.showMessageDialog(null, "Usted puede entrar al bar");
		}
	}	

}
