package fisica;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	}

	public static void calcularForcaPeso() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a massa:");
		float massa = teclado.nextFloat();
		Calculos calc = new Calculos();
		float forca = calc.forcaPeso(massa);
		System.out.println("O resultado da massa �:" + forca);
		
	}

	public static void calcularForcaCentr�peta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a massa:");
		float massa = teclado.nextFloat();
		System.out.println("Digite a velocidade:");
		float velocidade = teclado.nextFloat();
		System.out.println("Digite o raio:");
		float raio = teclado.nextFloat();
		Calculos calc = new Calculos();
		float Centr�peta = calc.forcaCentr�peta(massa, velocidade, raio);
		System.out.println("O resultado da for�a centr�peta �:" + Centr�peta);
		
	}

	public static void calcularForcaElastica() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a forca el�stica:");
		float forcaEl�stica = teclado.nextFloat();
		System.out.println("Digite a constante el�stica:");
		float constanteEl�stica = teclado.nextFloat();
		System.out.println("Digite a varia��o sofrida pelo corpo el�stico:");
		float varia��o = teclado.nextFloat();
		Calculos calc = new Calculos();
		float El�stica = calc.forcaElastica(forcaEl�stica, constanteEl�stica, varia��o);
		System.out.println("O resultado da for�a el�stica �:" + El�stica);
		
	}

	public static void calcularVelocidade() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a dist�ncia:");
		float dist�ncia = teclado.nextFloat();
		System.out.println("Digite o tempo:");
		float tempo = teclado.nextFloat();
		Calculos calc = new Calculos();
		float velocidade = calc.velocidadeMedia(dist�ncia, tempo);
		System.out.println("o resultado da velocidade m�dia �:" + velocidade);
		
	}

	private static void calcularMovimentoRetilineoUniforme() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a velocidade Inicial:");
		float velocidadeInicial = teclado.nextFloat();
		System.out.println("Digite a acelera��o :");
		float acelera��o = teclado.nextFloat();
		System.out.println("Digite o tempo :");
		float tempo = teclado.nextFloat();
		Calculos calc = new Calculos();
		float movimentoRetilineoUniforme = calc.movimentoRetilineoUniforme(velocidadeInicial, acelera��o, tempo);
		System.out.println("o resultado do movimentoRetilineoUniforme � = %s \n" + movimentoRetilineoUniforme);
		
	}

	public static void calcularMovimentoRetilineoUniformeVariado() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a velocidadeInicial:");
		float velocidadeInicial = teclado.nextFloat();
		System.out.println("Digite a velocidadeFinal:");
		float velocidadeFinal = teclado.nextFloat();
		System.out.println("Digite o tempoFinal:");
		float tempoFinal = teclado.nextFloat();
		System.out.println("Digite o tempoInicial:");
		float tempoInicial = teclado.nextFloat();
		Calculos calc = new Calculos();
		float movimentoRetilineoUniformeVariado = calc.movimentoRetilineoUniformeVariado(velocidadeInicial,
				velocidadeFinal, tempoFinal, tempoInicial);
		System.out.println(
				"O resultado do movimentoRetilineoUniformeVariado � = %s \n" + movimentoRetilineoUniformeVariado);

		teclado.close();
	}
}