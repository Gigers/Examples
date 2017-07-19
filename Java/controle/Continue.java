package Controle;

public class Continue {
	
	public static void main(String[] args) {
		
		//O for trabalha de forma parecida ao while, porém este acaba sendo melhor em casos em que os indexadores serão
		//utilizados para o controle do loop.
		
		//Caso fique com dúvida basta lembrar da análogia básica
		
		//Para i = 0, que seja menor que 5, execute os comando dentro dos {} e em seguida incremente o i
		
		for(int i = 0; i < 5; i++) {
			if(i == 2) {
				continue;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}

}
