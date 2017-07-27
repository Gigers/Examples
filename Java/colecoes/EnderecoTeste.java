package Colecoes;

public class EnderecoTeste {
	
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua loop infinito", 1, "Sala 101");
		Endereco endereco2 = new Endereco("Rua loop infinito", 1, "Sala 101");
		
		//No caso abaixo o resultado será falso pois os valores comparados são os endereços de memória
		//onde os objetos estão alocados
		System.out.println(endereco1 == endereco2);
	
		//Vai ficar retornando false até que o equals seja implementado na classe
		//caso contrário ele irá utilizar o equals da classe Object
		System.out.println(endereco1.equals(endereco2));
		//Após colocar os métodos hascode e equals o problema foi resolvido
		
	}
}
