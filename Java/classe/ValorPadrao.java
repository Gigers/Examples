package classe;

public class ValorPadrao {
	
	static boolean a; //Variaveis de classe
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		
		//Variaveis locais devem ser definidas de forma explicita
		/*
		 * Veja que na variavel 'a' não é necessário, mas em 'b' sim, pois 
		 * os valores atribuidos implicitamente só serão atribuidas em variaveis de classe e variaveis de instância
		 */
		int b;
		System.out.println(b);
		
	}

}
