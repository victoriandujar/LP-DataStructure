import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String input;
		int option;
		
		input = JOptionPane.showInputDialog(null, "***** Catalágo de Carros, Motos e Bikes ******" +
		"\n *** 1- Carros ***" + "\n *** 2- Motos ***" + "\n *** 3- Bicicletas ***");
		option = Integer.parseInt(input);
		
		switch(option) {
		case 1:
			Motos moto1 = new Motos(); 
			moto1.imprimir();
			break;
		case 2:
			Carros carro1 = new Carros();
			carro1.imprimir();
			break;
		case 3:
			Bicicletas bike1 = new Bicicletas();
			bike1.imprimir();
			break;
		default: JOptionPane.showMessageDialog(null, "Algo deu errado!");
		}
	}
}
