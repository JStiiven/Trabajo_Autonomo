import javax.swing.JOptionPane;

public class Tres {

	public static void main(String[] args) {
		int num=0;
		
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Cual es el numero mayor -> 3 o 5"));
			if(num == 3) 
				JOptionPane.showMessageDialog(null, "Nooo estas equivocado!!",":/",JOptionPane.WARNING_MESSAGE);
		} while (num != 5);
		JOptionPane.showMessageDialog(null, "Estas en lo correcto!","Felicidades!",JOptionPane.WARNING_MESSAGE);
	}

}
