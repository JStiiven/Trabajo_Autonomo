import javax.swing.JOptionPane;

public class Tres {

	public static void main(String[] args) {
		int diaSemana=0;
		
		diaSemana=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dia de la semana (1,2,3,4,5,6,7)"));
		
		switch (diaSemana) {
		case 1:
			System.out.println("El dia 1 es lunes");
			break;
		case 2:
			System.out.println("El dia 2 es martes");
			break;
		case 3:
			System.out.println("El dia 3 es miercoles");
			break;
		case 4:
			System.out.println("El dia 4 es jueves");
			break;
		case 5:
			System.out.println("El dia 5 es viernes");
			break;
		case 6:
			System.out.println("El dia 6 es sabado");
			break;
		case 7:
			System.out.println("El dia 7 es domingo");
			break;

		default:
			System.out.println("Error, no existe un dia de la semana que este ingresando");
			break;
		}

	}

}
