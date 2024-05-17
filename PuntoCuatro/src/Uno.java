import javax.swing.JOptionPane;

public class Uno {

	public static void main(String[] args) {
		int num1=0, num2=0, numARepresentar=0;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
		
		num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
		
		if (num1 > num2) {
			numARepresentar =num1;
			JOptionPane.showMessageDialog(null, "El numero mayor es el valor primer valor!: "+num1);
		} else if(num2 > num1) {
			numARepresentar=num2;
			JOptionPane.showMessageDialog(null, "El numero mayor es el valor segundo valor!: "+num2);
		} else {
			JOptionPane.showMessageDialog(null, "Los valores ingresados son iguales!!");
		}
		

	}

}
