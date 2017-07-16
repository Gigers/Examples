package fundamentos;

public class ConversaoNumerica {
	public static void main(String[] args) {
		
		//Realizando a conversão de tipos primitivos numéricos (Cast)
		//O cast funciona da mesma forma que é feita em C
		
		
		// Exemplo 1 - Conversão explícita
		float f = (float) 0.1;
		
		// Exemplo 2 - Conversão explícita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// Exemplo 3 - Conversão implícita
		int i2 = 'a';
		System.out.println(i2);
		//Veja que a saida é um inteiro, que representa o valor de a na tabela
		
		// Exemplo 4 - Conversão implícita
		double d = 1001;
		System.out.println(d);
	}

}
