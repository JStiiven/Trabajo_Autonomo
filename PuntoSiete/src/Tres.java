import javax.swing.JOptionPane;

public class Tres {
	public static void main(String [] args) {
		int num=0, op=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para una tabla de muliplicacion"));
		for (int i = 1; i <= 10; i++) {
			op= i* num;
			System.out.println(num+"x"+i+"= "+op);
		}
	}
}
