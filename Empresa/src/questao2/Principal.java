package questao2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		CalcularValor c = new CalcularValor();
		
		int[] numero = new int[10];
		
		System.out.println("Digite 10 números: ");
		for (int i = 0; i < numero.length; i++) {
			numero[i] = scan.nextInt();
		}
		
		System.out.println("O resultado da soma dos valores digitados é: "+c.calcularValor(numero));

		scan.close();

	}

}
