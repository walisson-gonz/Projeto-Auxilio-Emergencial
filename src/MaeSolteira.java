package classes;

public class MaeSolteira extends BolsaFamilia{
	/*Essa classe sem como objetivo definir se a pessoa se enquadra na categoria
	 * M�e Chefe de Fam�lia, para pessoas com Bolsa Fam�lia
	 * Esse crit�rio define o valor do aux�lio
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
