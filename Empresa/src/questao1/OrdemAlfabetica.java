package questao1;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabetica {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] nome = new String[10];

		System.out.println("Digite 10 nomes: ");

		for (int i = 0; i < nome.length; i++) {

			nome[i] = scan.nextLine();

		}

		System.out.println("Nomes em ordem alfabética: ");
		Arrays.sort(nome);
		System.out.println(Arrays.toString(nome));

		scan.close();
	}

}
