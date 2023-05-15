package questao3;

import java.util.Arrays;

public class Principal {
	
	public static void main(String[] args) {
		
		IntersecaoVetores c = new IntersecaoVetores();
		
		int[] x = {1,2,3,4,5,6,7};
		int[] y = {1,3,4,7,8,9};
		int[] m = c.resultadoInterseçao(x, y);
		
		System.out.println(Arrays.toString(m));	
	
	}
}
