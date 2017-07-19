package classe;

//Exibir o valor de 2 dentro do main

public class Desafio {

	int a = 2;
	
	public static void main(String[] args) {
		
		Desafio tese = new Desafio();
		
		System.out.println(tese.a);
		
	}
	
}

/*
 * Para resolver o problema criei uma instância da classe,
 * fiz isso porque o valor 'a' é uma variavel de instância e main de classe,
 * assim não se conversam, ao instanciar a classe Desafio permiti ao programa chamar 'a' 
 */
