package fisica;

public class Calculos {
	public float forcaPeso(float n1) {
		return n1 * 9.8f;
	}

	public float forcaCentrípeta(float massa, float velocidade, float raio) {
		return massa * (velocidade * velocidade) / raio;
	}

	public float forcaElastica(float forcaElastica, float constanteElastica, float variacaoSofridaPeloCorpoElastico) {
		return forcaElastica / (forcaElastica * variacaoSofridaPeloCorpoElastico);
	}

	public float velocidadeMedia(float distancia, float tempo) {
		return distancia / tempo;
	}

	public float movimentoRetilineoUniforme(float velocidadeInicial, float aceleracao, float tempo) {
		return velocidadeInicial + aceleracao * tempo;
	}

	public float movimentoRetilineoUniformeVariado(float velocidadeInicial, float velocidadeFinal, float tempoFinal, float tempoInicial ) {
		return velocidadeInicial - velocidadeFinal / tempoFinal - tempoInicial;
	}
}