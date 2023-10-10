package treinandoOOP;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Circulo {

	// Utilizando o encapsulamento , para manipular os atributos através dos getters
	// e setters
	private Double raio;

	private Double perimetro;

	// Método construtor.
	public Circulo(Double raio, Double perimetro) {

		this.perimetro = perimetro;

		this.raio = raio;

	}

	public Double getRaio() {
		return raio;
	}

	// Regra de negócio utilizando getters e setters, nesse caso o setter atua como
	// um mediador entre o parametro e o atributo, verificando se o valor inserido é
	// maior que 0 , se for, chama o método de cálculo de área.
	public void setRaio(Double raio) {

		if (raio > 0) {

			calcularArea(raio);

			this.raio = raio;

		}

		// Caso contrário imprime no prompt uma mensagem de erro.
		else {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um valor negativo ou igual a 0");
		}
	}

	public Double getPerimetro() {
		return perimetro;
	}

	// Setter semelhante ao anterior, caso a entrada de dados seja um número
	// negativo ou 0 gera um erro!
	public void setPerimetro(Double perimetro) {

		if (perimetro <= 0) {

			JOptionPane.showMessageDialog(null,
					"Ocorreu um erro inesperado, o perímetro recebeu um valor negativo ou igual a 0, tente novamente!!");
		}

		// Caso contrário chama o método de cálculo de perimetro.
		else {

			calcularPerimetro(perimetro);

			this.perimetro = perimetro;

		}
	}

	public void calcularArea(Double raio) {

		Double area = 3.14 * Math.pow(raio, 2);

		// Atribui em uma nova variavel o método de formatação
		String areaFormatada = formatarCirculo(area);

		// Imprime no prompt o resultado final após a operação
		JOptionPane.showMessageDialog(null, "Área do Círculo:  " + areaFormatada);

	}

	// Método que calcula um perímetro, recebe como parametro o valor do raio.
	public void calcularPerimetro(Double raio) {

		// Cálculo do perimétro, com o valor do parametro.
		Double perimetro = 2 * 3.14 * raio;

		// Após efetuar as operações, armazena o valor do método de formatação em uma
		// string
		String perimetroFormatado = formatarCirculo(perimetro);

		// Imprime no prompt o resultado final
		JOptionPane.showMessageDialog(null, "Perímetro do Círculo:  " + perimetroFormatado);

	}

	// Formatação do resultado da operação
	public static String formatarCirculo(Double raio) {

		// Formatação utilizando métros quadrados
		DecimalFormat df = new DecimalFormat("##.## m²");

		String circuloFormatado = df.format(raio);

		// retorna uma variável com a formatação para cálculos com área.
		return circuloFormatado;
	}

}
