package classes;

public class NaoRecebeBolsa extends Pessoa {
	
	/*Essa classe define o tipo de registro de trabalho.
	 * Que define se a pessoa tem direito ou não
	 * 
	 */

	private double rendaTotal;
	private char tipoTrabalho;
	
	public double getRendaTotal() {
		return rendaTotal;
	}
	public void setRendaTotal(double rendaTotal) {
		this.rendaTotal = rendaTotal;
	}
	public char getTipoTrabalho() {
		return tipoTrabalho;
	}
	public void setTipoTrabalho(char tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}
	
	void tipoTrabalho() {
		System.out.println("==============================================================");
		System.out.println("\nIdentifique qual sua categoria de trabalho: ");
		System.out.println("1 - Estágio ou bolsa");
		System.out.println("2 - Trabalho Formal");
		System.out.println("3 - Trabalho informal");
		System.out.println("4 - Desempregado, recebendo auxílio desemprego ou aposentado");
		System.out.println("5 - Desempregado");
		setTipoTrabalho(ler.next().charAt(0));
		
		if(getTipoTrabalho() == '1' || getTipoTrabalho() == '2' || getTipoTrabalho() == '4') {
			System.out.println("==============================================================");
			System.out.println("Você não tem direito ao auxílio emergencial.");
			System.exit(0);
		} 
	}
	
	

}
