package classes;

import java.util.Scanner;

public class Main {

	
	/* Classe main, eesta classe contem todas as chamadas para o console
	 * Aqui tamb�m cont�m a declara��o dos objetos e a chamada dos m�todos
	 */
	public static void main(String[] args) {
		
		// Declara��o de objetos

		Pessoa p = new Pessoa();
		NaoMaeSolteira nm = new NaoMaeSolteira();
		Aniversario aniver = new Aniversario();
		NaoRecebeBolsa nrb = new NaoRecebeBolsa();
		Scanner ler = new Scanner(System.in);
		
		// Abertura do console
		
		System.out.println("========================================================");
		System.out.println("=                   JAVAUXILIA                         =");
		System.out.println("=           Informando voc� dos seus direitos          =");
		System.out.println("========================================================");

		// Chamada dos m�todos
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

		/*Cr�ditos
		System.out.println("========================================================");
		System.out.println("=                   CR�DITOS                           =");
		System.out.println("=   Gilson, Jo�o, J�lia, Lucas, Vict�ria e Walisson     =");
		System.out.println("=                Turma 23 - Generation Brasil          =");
		System.out.println("========================================================");
		*/

		
		ler.close();
	}

}
