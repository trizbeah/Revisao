package questao2;

public class CalcularValor {
	
	public int calcularValor(int[]numero) {
		
		int soma = 0;
		
		for(int i = 0; i < numero.length; i++) {
			soma = soma + numero[i];
			
		}
		return soma;
	}
	

}
