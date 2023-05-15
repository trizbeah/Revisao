package questao3;


public class IntersecaoVetores {

	public int[] resultadoInterseçao(int[] x, int[] y) {
		
		int[] aux = new int[x.length + y.length];
		int k = 0;
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < y.length; j++) {
				if(x[i] == y[j]) {
					aux[k++] = x[i];
				}
			}
		}
		
		int[] m = new int[k];
		for(int i = 0; i < k; i++) {
			m[i] = aux[i];
		}
		
		return m;
		
	}
}
