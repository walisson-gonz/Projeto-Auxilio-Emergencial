package classes;

import java.util.Scanner;

public class Aniversario {
	
	/*Esta classe tem como objetivo indicar quando a pessoa receber� o aux�lio 
	 * Essa informa��o � tirada baseada no m�s de anivers�rio da pessoa
	 * Calend�rio retirado do site da Caixa
	 */

	Scanner ler = new Scanner(System.in);
	// Vari�ve�
	private int mesAniver;

	public int getMesAniver() {
		return mesAniver;
	}

	public void setMesAniver(int mesAniver) {
		this.mesAniver = mesAniver;
	}
	
	// M�todos

	void leitura() {
		System.out.println("==============================================================");
		System.out.println("Indique seu m�s de nascimento, em n�mero.");
		mesAniver = ler.nextInt();
	}

	void mes() {
		switch (mesAniver) {

		case (1):
			System.out.println("\nVoc� ir� receber em 06/04");
			break;
		case (2):
			System.out.println("\nVoc� ir� receber em 09/04");
			break;
		case (3):
			System.out.println("\nVoc� ir� receber em 11/04");
			break;
		case (4):
			System.out.println("\nVoc� ir� receber em 13/04");
			break;
		case (5):
			System.out.println("\nVoc� ir� receber em 15/04");
			break;
		case (6):
			System.out.println("\nVoc� ir� receber em 18/04");
			break;
		case (7):
			System.out.println("\nVoc� ir� receber em 20/04");
			break;
		case (8):
			System.out.println("\nVoc� ir� receber em 22/04");
			break;
		case (9):
			System.out.println("\nVoc� ir� receber em 25/04");
			break;
		case (10):
			System.out.println("\nVoc� ir� receber em 27/04");
			break;
		case (11):
			System.out.println("\nVoc� ir� receber em 28/04");
			break;

		case (12):

			System.out.println("\nVoc� ir� receber em 29/04");
			break;

		default:
			System.out.println("\nOp��o n�o reconhecida");
			break;
		}

	}

}
