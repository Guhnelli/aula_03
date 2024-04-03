package aula03_04;

import java.util.Scanner;

public class ativi_03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		System.out.println(" informe um dia da semana");
		int dias = ler.nextInt();

		switch (dias) {
		case 1 :
			System.out.println(" Domingo ");
			break;

		case 2 :
			System.out.println(" Segunda ");
			break;

		case 3 :
			System.out.println(" Terça ");
			break;

		case 4 :
			System.out.println(" Quarta ");
			break;

		case 5 :
			System.out.println(" Quinta ");
			break;
			
		case 6 :
			System.out.println(" Sexta ");
			break;
			
		case 7 :
			System.out.println(" Sabado ");
			break;

		default:
			System.out.println(" Não existe esse dia ");
		}

	}

}
