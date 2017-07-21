package classe;

public class VariaveisLocais {
	
	int a = 2; //Variavel de instância
	int a2 = 9;
	
	void teste1() {
		
		//Dentro dos métodos é vital que seja respeitado 
		//a sequência
		
		int a1 = 2;
	
		
		System.out.println(a);
	
		if(a1 > 3) {
			int a2 = 3;
		}

		//System.out.println(a2);
	}
	
	void teste2() {
		int a2 = 7;
		
		System.out.println(this.a2); //Aqui chamo a variavel de instância
		System.out.println(a2); //E aqui chamo a variavel local de 'teste2'
		
		for(int i = 0; i < 10; i++) {
			
		}
		
		//System.out.println(i); O 'i' só está disponível dentro do for
		
	}


}
