import javax.swing.JOptionPane;

public class Tres {
	public static void main(String [] args) {
		int compra=0;
		double descuentoCompra=0;
		final double PORC_DESCUENTO=0.15;
		
		compra=Integer.parseInt(JOptionPane.showInputDialog("Si su compra es mayor de 50000 usted tiene un descuento del 15%"));
		
		if (compra > 50000) {
			descuentoCompra = compra - (compra * PORC_DESCUENTO) ;
			JOptionPane.showMessageDialog(null, "Por su compra que paso de los 50000 tiene un descuento del 15% y su compra queda en: "+descuentoCompra);
		} else {
			JOptionPane.showMessageDialog(null, "Usted no tiene descuento.");
		}
	}
}
