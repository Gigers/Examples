package fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		
		// final representa a constante em Java
		final double PI = 3.141592;
		
		double area = PI * raio * raio;
		
		System.out.println("A área é " + area + " m²");
	
		//Imprimprindo com printf
		/*O System.out.printf segue o mesmo padrão que o 
		printf do C
		*/
		System.out.printf("A área é %.2f m²\n", area);
	}

}