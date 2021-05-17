package classes;

public class MaeSolteiraSemBF extends NaoRecebeBolsa {
	/*Essa classe sem como objetivo definir se a pessoa se enquadra na categoria
	 * Mãe Chefe de Família, para pessoas sem Bolsa Família
	 * Esse critério define o valor do auxílio
	 */
	
	private char filhos;
	private char casada;
	
	public char getFilhos() {
		return filhos;
	}
	public void setFilhos(char filhos) {
		this.filhos = filhos;
	}
	public char getCasada() {
		return casada;
	}
	public void setCasada(char casada) {
		this.casada = casada;
	}

}
