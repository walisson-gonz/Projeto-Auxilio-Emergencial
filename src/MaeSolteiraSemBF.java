package classes;

public class MaeSolteiraSemBF extends NaoRecebeBolsa {
	/*Essa classe sem como objetivo definir se a pessoa se enquadra na categoria
	 * M�e Chefe de Fam�lia, para pessoas sem Bolsa Fam�lia
	 * Esse crit�rio define o valor do aux�lio
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
