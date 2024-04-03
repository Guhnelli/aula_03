package aula03_04;

import java.util.Scanner;

public class exem2_03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println(" informe sua iade");
		idade = ler.nextInt();
		
		String mensagem = idade >= 18 ? "Maior de idade" : "menor de idade";
		System.out.println(mensagem);
	}

}
