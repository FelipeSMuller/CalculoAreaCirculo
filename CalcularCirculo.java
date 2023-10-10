package treinandoOOP;

import javax.swing.JOptionPane;

public class CalcularCirculo {

	public static void main(String[] args) {

		Double inserirValor = 0.0;

		int escolhaOpcao = 0;

		Circulo circulo1 = new Circulo(0.0, 0.0);

		do {

			try {

				// Entrada de opções do usuário
				escolhaOpcao = Integer.parseInt(
						JOptionPane.showInputDialog(null, "CÁLCULOS CIRCULO \n1-Cálcular área \n2-Calcular perímetro"));

				// Try e catch, caso um valor diferente de um número seja digitado ou o prompt
				// seja fechado incorretamente!!
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente");
			}

			switch (escolhaOpcao) {

			case 1:

				// Caso o usuário escolha a opção de cálculo de área, um valor pode ser inserido
				inserirValor = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Insira o valor para cálcular a área do Círculo"));

				// Chama o método público e analisa se o valor pode ou não ser atribuido ao
				// atributo.
				circulo1.setRaio(inserirValor);

				break;

			case 2:

				// Caso o usuário escolha a opção de cálculo de perímetro, um valor pode ser
				// inserido

				inserirValor = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Insira o valor para cálcular a perímetro do Círculo"));

				// Chama o método público e atua como um mediador entre o atributo e o parametro
				circulo1.setPerimetro(inserirValor);

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Nenhuma opção foi selecionada, portanto a aplicação foi finalizada");

				break;
			}

		} while (escolhaOpcao > 0);

	}

}
