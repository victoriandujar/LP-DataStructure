import java.util.Arrays;
import javax.swing.JOptionPane;

public class Motos {
	public void imprimir() {
		java.util.List<String> listOfMotors = Arrays.asList("Modelo: Harley Davidson - LOW RIDER'S", "Ano: 2020", "Cor: Vermelha");
		java.util.List<String> listOfMotors2 = Arrays.asList("Modelo: Harley Davidson - BREAKOUT", "Ano: 2020", "Cor: Cinza");
		java.util.List<String> listOfMotors3 = Arrays.asList("Modelo: Harley Davidson - FAT BOY", "Ano: 2020", "Cor: Preto");
		JOptionPane.showMessageDialog(null, "Moto 1: " + listOfMotors + "\n Moto 2: " + listOfMotors2 + "\n Moto 3: " + listOfMotors3);	
	}
}
