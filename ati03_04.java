package aula03_04;

import java.util.Scanner;

public class ati03_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Double numero;
		
		System.out.println(" informe o valor");
		numero = ler.nextDouble();
		
		String mensagem = numero % 5 == 0 ?"É multiplo de 5" : "Não é multiplo de 5";
		System.out.println(mensagem);

	}

}
