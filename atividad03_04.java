package aula03_04;

import java.util.Scanner;

public class atividad03_04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Double salario, tempo, bonus, valor;

		System.out.println(" informe o salario");
		salario = ler.nextDouble();

		System.out.println(" informe o tempo trabalhado");
		tempo = ler.nextDouble();
		
		double resultado= tempo % 7 >= 3 ? (salario*0.07)+ salario : (salario*0.05)+ salario;
		System.out.println(resultado);
	}

}
