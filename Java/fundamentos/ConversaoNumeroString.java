package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		/*
		 * Veja acima que utilizando o wrapper fica facil
		 * manipular o valor, neste caso o que era int passou para
		 * String e em seguida calculamos seu tamanho
		 */
		
		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());
		
		/*
		 * Acima percebe-se que o wrapper consegue ser utilizado
		 * em outros valores para que esses sejam interpretados como 
		 * wrappers
		 */
		
	}

}
