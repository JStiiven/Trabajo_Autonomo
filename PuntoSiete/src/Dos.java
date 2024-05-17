import javax.swing.JOptionPane;

public class Dos {

	public static void main(String[] args) {
		int entrada=0;
		entrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que numero quiere que vaya el bucle"));
		for (int i = 1; i <= entrada; i++) {
			System.out.println(i);
		}

	}

}
