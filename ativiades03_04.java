package aula03_04;

import java.util.Scanner;

public class ativiades03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Double salario, tempo, bonus1, bonus2;

		System.out.println(" informe o salario");
		salario = ler.nextDouble();

		System.out.println(" informe o tempo trabalhado");
		tempo = ler.nextDouble();
		
		

		if (tempo <= 3) { 
			System.out.println(" 5% de bonus ao salario:" + 0.07*salario);
		}
		else if  (tempo >= 4) {
			System.out.println(" 7% de bonus ao salario:" + 0.07*salario);
		}

		else {
			System.out.println(" Não tem acrescimo:");
		}
		ler.close();
		}
	}


