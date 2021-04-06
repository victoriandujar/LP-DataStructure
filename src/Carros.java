import java.util.*;
import javax.swing.JOptionPane;

public class Carros {
	public void imprimir() {
		HashSet<String> setCars1 = new HashSet<>(Arrays.asList("Modelo: Cobalt", "Ano: 2020", "Cor: Preto"));
		HashSet<String> setCars2 = new HashSet<>(Arrays.asList("Modelo: Cobalt", "Ano: 2020", "Cor: Preto"));
		JOptionPane.showMessageDialog(null, "Carro 1: " + setCars1 + "\n Carro 2: " + setCars2 );
		
		Set<String> setCars3 = Set.of("Modelo: Fusion", "Ano: 2020", "Cor: Prata");
		Set<String> setCars4 = Set.of("Modelo: Honda HR-V", "Ano: 2020", "Cor: Preto");
		JOptionPane.showMessageDialog(null, "Carro 1: " + setCars3 + "\n Carro 2: " + setCars4);
	}
}
