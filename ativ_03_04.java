package aula03_04;

import java.util.Scanner;

public class ativ_03_04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		System.out.println(" informe um dia da semana");
		String dias = ler.next();

		switch (dias) {
		
		case "domingo" :
			System.out.println("Dia 1");
			break;

		case "segunda" :
			System.out.println("Dia 2");
			break;

		case "terça" :
			System.out.println("Dia 3");
			break;

		case "quarta" :
			System.out.println("Dia 4");
			break;

		case "quinta" :
			System.out.println("Dia 5");
			break;
			
		case "sexta" :
			System.out.println("Dia 6");
			break;
			
		case "abado" :
			System.out.println("Dia 7");
			break;

		default:
			System.out.println("Não existe esse dia");
		}


	}

}
