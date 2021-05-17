package classes;

import java.util.Scanner;

public class Main {

	
	/* Classe main, eesta classe contem todas as chamadas para o console
	 * Aqui também contém a declaração dos objetos e a chamada dos métodos
	 */
	public static void main(String[] args) {
		
		// Declaração de objetos

		Pessoa p = new Pessoa();
		NaoMaeSolteira nm = new NaoMaeSolteira();
		Aniversario aniver = new Aniversario();
		NaoRecebeBolsa nrb = new NaoRecebeBolsa();
		Scanner ler = new Scanner(System.in);
		
		// Abertura do console
		
		System.out.println("========================================================");
		System.out.println("=                   JAVAUXILIA                         =");
		System.out.println("=           Informando você dos seus direitos          =");
		System.out.println("========================================================");

		// Chamada dos métodos
		p.nome();
		p.idade();
		p.recebeBolsa();

		if (p.getRecebeBolsa() == '1') {
			p.numPessoas();
			p.sexo();
			p.recebeAuxilio();

		} else {
			
			nrb.tipoTrabalho();
			p.numPessoas();
			p.sexo();
			nm.renda();
			p.recebeAuxilio();

		}
		
		aniver.leitura();
		aniver.mes();

		/*Créditos
		System.out.println("========================================================");
		System.out.println("=                   CRÉDITOS                           =");
		System.out.println("=   Gilson, João, Júlia, Lucas, Victória e Walisson     =");
		System.out.println("=                Turma 23 - Generation Brasil          =");
		System.out.println("========================================================");
		*/

		
		ler.close();
	}

}
