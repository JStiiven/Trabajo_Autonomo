import javax.swing.JOptionPane;

public class Dos {

	public static void main(String[] args) {
		int num1=0, num2=0, num3=0, numARepresentar=0;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
		
		num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
		
		num3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
		
		if (num1 > num2) {
			numARepresentar =num1;
			JOptionPane.showMessageDialog(null, "El numero mayor es el valor primer valor!: "+numARepresentar);
		} else if(num2 > num3) {
			numARepresentar=num2;
			JOptionPane.showMessageDialog(null, "El numero mayor es el valor segundo valor!: "+numARepresentar);
			
		} else if(num3 > num1) {
			numARepresentar=num3;
			JOptionPane.showMessageDialog(null, "El numero mayor es el valor tercer valor!: "+numARepresentar);
		} else {
			JOptionPane.showMessageDialog(null, "Los numeros son iguales!!");
		}

	}

}
