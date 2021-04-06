import java.util.*;
import javax.swing.JOptionPane;

public class Bicicletas {
	public void imprimir() {
		Map<String, Object[]> mapa = new HashMap<String, Object[]>();

		String[] Bike01 = { "Modelo: Colli Bikes Ciça", "Cor: Rosa", "Aro: 26" };
		String[] Bike02 = { "Modelo: Vikingx Tuff25", "Cor: Preto e Azul", "Aro: 26" };
		String[] Bike03 = { "Modelo: Lotus Aluminium", "Cor: Azul Claro", "Aro: 29" };

		Object[] informacoes = { Bike01, Bike02, Bike03 };

		mapa.put("Bicicletas", informacoes);
		Object[] recDados = mapa.get("Bicicletas");

		for (int i = 0; i < recDados.length; i++) {
			switch (i) {
			case 0:
				System.out.println();
				break;
			case 1:
				System.out.println();
				break;
			case 2:
				System.out.println();
				break;
			}

			for (String s : (String[]) recDados[i]) {
				JOptionPane.showMessageDialog(null, s);
			}
		}

	}
}
