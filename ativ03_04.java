package aula03_04;

import java.util.Scanner;

public class ativ03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3, nota4, media;

		System.out.print("informe a nota 1 :");
		nota1 = ler.nextDouble();

		System.out.print("informe a nota 2 :");
		nota2 = ler.nextDouble();

		System.out.print("informe a nota 3 :");
		nota3 = ler.nextDouble();

		System.out.print("informe a nota 4 :");
		nota4= ler.nextDouble();

		media = (nota1+nota2+nota3+nota4)/4;

		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(mensagem);

	}

}
