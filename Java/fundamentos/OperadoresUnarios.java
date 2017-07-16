package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		//Operadores unários
		
		int num1 = 1; // -1 Veja que o - é um operador unário
		int num2 = 2;
		
		//Operadores de incremente e decremento são unários
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		//++num -> Incrementa antes do teste
		//num++ -> Incrementa depois do teste
		
		System.out.println(++num1 == num2--);
		System.out.println(num1 == num2);
	}
}
