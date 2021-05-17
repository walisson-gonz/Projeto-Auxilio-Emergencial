package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa implements Interface {
	

	// Atributos
	private String nome;
	private int idade, numDePessoas;
	private char sexo, recebeBolsa, filhos, estadoCivil;


	Scanner ler = new Scanner(System.in);
		
	
	public char getRecebeBolsa() {
		
		return recebeBolsa;
	}
	public void setRecebeBolsa(char recebeBolsa) {
		
		this.recebeBolsa = recebeBolsa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumDePessoas() {
		return numDePessoas;
	}
	public void setNumDePessoas(int numDePessoas) {
		this.numDePessoas = numDePessoas;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

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
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	
	
	// Métodos
	
	public void nome() {
		System.out.println("\nDigite seu nome completo: ");
		setNome(ler.next());
	}
	
	public void idade() {
		System.out.println("\n=============================");
		System.out.println("\nDigite sua idade: ");
		setIdade(ler.nextInt());
		
		if(getIdade() < 18) {	
			throw new ArithmeticException("Você não tem direito ao benefício, pois não completou 18 anos.");
		}
	}
	
	public void recebeBolsa() {
		System.out.println("\n==============================================================");
		System.out.println("\nInforme se você é beneficiário do Bolsa Família: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		setRecebeBolsa(ler.next().charAt(0));
	}
	
	public void numPessoas() {
		System.out.println("\n==============================================================");
		System.out.println("\nQuantas pessoas moram na sua casa, incluindo você: ");
		setNumDePessoas(ler.nextInt());
	}
	
	public void sexo() {
		System.out.println("\n==============================================================");
		System.out.println("\nComo você se identifica: ");
		System.out.println("M - Masculino ");
		System.out.println("F - Feminino ");
		System.out.println("O - Outros ");
		setSexo(ler.next().charAt(0));
	}
	
	
	public void recebeAuxilio() {
		//Collections col = new Collections();
		
		String valorMS = "Você tem direito ao auxílio e o valor é de R$ 375,00." ;
		String valorP2 = "Você tem direito ao auxílio e o valor é de R$ 250,00.";
		String valorSBF = "Pessoas solteiras, sem filhos, não recebem bolsa família.";
		String valorP1 = "Você tem direito ao auxílio e o valor é de R$ 150,00.";
	 
		List<String> valores = new ArrayList<>();
		valores.add(valorMS);
		valores.add(valorP2);
		valores.add(valorSBF);
		valores.add(valorP1);
		
		
		System.out.println("\n==============================================================");
		System.out.println("\nVocê possui filhos menores de 18 anos?: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		setFilhos(ler.next().charAt(0));
		
		System.out.println("\n==============================================================");
		System.out.println("\nVocê é casada formalmente: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		setEstadoCivil(ler.next().charAt(0));
		
		if(getSexo() == 'F' && getFilhos() == '1' && getEstadoCivil() == '2') {
			try {
			System.out.println("\n==============================================================");
			System.out.println("Senhore " + getNome() + ", ");
			System.out.println(valores.get(0));
			
			} catch (Exception e){
				System.out.println("Desculpe, algo deu errado. Tente novamente");
			}
		} 
		else if(getNumDePessoas()>=2 ) {
			System.out.println("\n==============================================================");
			System.out.println("Senhore " + getNome() + ", ");
			System.out.println(valores.get(1));
		}
		else if(getNumDePessoas() < 2 && getRecebeBolsa() == 1){
			System.out.println("\n==============================================================");
			System.out.println("Senhore " + getNome() + ", ");
			System.out.println(valores.get(2));
			
		} else {
			System.out.println("\n==============================================================");
			System.out.println("Senhore " + getNome() + ", ");
			System.out.println(valores.get(3));
		}
		
	}

}
