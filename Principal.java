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
		System.out.println("O resultado da massa é:" + forca);
		
	}

	public static void calcularForcaCentrípeta() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a massa:");
		float massa = teclado.nextFloat();
		System.out.println("Digite a velocidade:");
		float velocidade = teclado.nextFloat();
		System.out.println("Digite o raio:");
		float raio = teclado.nextFloat();
		Calculos calc = new Calculos();
		float Centrípeta = calc.forcaCentrípeta(massa, velocidade, raio);
		System.out.println("O resultado da força centrípeta é:" + Centrípeta);
		
	}

	public static void calcularForcaElastica() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a forca elástica:");
		float forcaElástica = teclado.nextFloat();
		System.out.println("Digite a constante elástica:");
		float constanteElástica = teclado.nextFloat();
		System.out.println("Digite a variação sofrida pelo corpo elástico:");
		float variação = teclado.nextFloat();
		Calculos calc = new Calculos();
		float Elástica = calc.forcaElastica(forcaElástica, constanteElástica, variação);
		System.out.println("O resultado da força elástica é:" + Elástica);
		
	}

	public static void calcularVelocidade() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a distância:");
		float distância = teclado.nextFloat();
		System.out.println("Digite o tempo:");
		float tempo = teclado.nextFloat();
		Calculos calc = new Calculos();
		float velocidade = calc.velocidadeMedia(distância, tempo);
		System.out.println("o resultado da velocidade média é:" + velocidade);
		
	}

	private static void calcularMovimentoRetilineoUniforme() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a velocidade Inicial:");
		float velocidadeInicial = teclado.nextFloat();
		System.out.println("Digite a aceleração :");
		float aceleração = teclado.nextFloat();
		System.out.println("Digite o tempo :");
		float tempo = teclado.nextFloat();
		Calculos calc = new Calculos();
		float movimentoRetilineoUniforme = calc.movimentoRetilineoUniforme(velocidadeInicial, aceleração, tempo);
		System.out.println("o resultado do movimentoRetilineoUniforme é = %s \n" + movimentoRetilineoUniforme);
		
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
				"O resultado do movimentoRetilineoUniformeVariado é = %s \n" + movimentoRetilineoUniformeVariado);

		teclado.close();
	}
}