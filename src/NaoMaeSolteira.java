package classes;

public class NaoMaeSolteira extends NaoRecebeBolsa{
	
	NaoRecebeBolsa nrb = new NaoRecebeBolsa();
	
	/*Essa classe define os atributos de renda, definindo assim se a pessoa tem direito ao aux�lio
	 * 
	 */
	
	private double rendaPerCapita = 0.0;

	public double getRendaPerCapita() {
		return rendaPerCapita;
	}

	public void setRendaPerCapita(double rendaPerCapita) {
		this.rendaPerCapita = rendaPerCapita;
	}
	
	void calculaPerCapita() {
		rendaPerCapita = (getRendaTotal()/getNumDePessoas());
		
	}
	
	void renda() {
		System.out.println("\n==============================================================");
		System.out.println("Qual a renda total da sua fam�lia?");
		setRendaTotal(ler.nextDouble());
		
		System.out.println("\n==============================================================");
		System.out.println("\nQuantas pessoas moram na sua casa, incluindo voc�: ");
		setNumDePessoas(ler.nextInt());
		
		calculaPerCapita();
		
		if(getRendaPerCapita()>= 550 || getRendaTotal() >= 3300) {
			System.out.println("\n==============================================================");
			System.out.println("Voc� n�o tem direito ao aux�lio emergencial.");
			System.exit(0);
		}
	}

}
