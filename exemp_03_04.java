package aula03_04;

import java.util.Scanner;

public class exemp_03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		System.out.println(" Escolha um numero de 1 a 5");
		int numero = ler.nextInt();

		switch (numero) {
		case 1 :
			System.out.println(" o numero escolhido foi : 1. ");
			break;

		case 2 :
			System.out.println(" o numero escolhido foi : 2. ");
			break;

		case 3 :
			System.out.println(" o numero escolhido foi : 3. ");
			break;

		case 4 :
			System.out.println(" o numero escolhido foi : 4. ");
			break;

		case 5 :
			System.out.println(" o numero escolhido foi : 5. ");
			break;

		default:
			System.out.println(" o numero escolhido É invalido: digite um numero entre 1 a 5");
		}




	}

}
