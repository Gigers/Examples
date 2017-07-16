package fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 4;
		int num3 = 5;
		
		//Operadores: + - * / %
		
		int soma = num1 + num2 + num3 + 6;
		
		System.out.println(soma);
		
		int subtracao = num1 - num2 - num3;
		
		System.out.println(subtracao);
		
		// Precedência
		System.out.println(num1 + num3 * num2 / 2);
		System.out.println((num1 + num3) * num2 / 2);
		
		// Resto da divisão
		System.out.println(10 % 2);
	}
	
	
}
