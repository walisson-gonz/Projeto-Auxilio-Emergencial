package classes;

public class MaeSolteira extends BolsaFamilia{
	/*Essa classe sem como objetivo definir se a pessoa se enquadra na categoria
	 * Mãe Chefe de Família, para pessoas com Bolsa Família
	 * Esse critério define o valor do auxílio
	 */
	
	private char filhos, estadoCivil;

	public char getFilhos() {
		return filhos;
	}

	public void setFilhos(char filhos) {
		this.filhos = filhos;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
