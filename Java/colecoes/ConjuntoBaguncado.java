package Colecoes;

import java.util.HashSet;
import java.util.Set;

//Exemplo para mostar um set heterogêneo


public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		//Importando Set
		//Abaixo um conjunto heterogêneo
		Set conjunto = new HashSet();

		//adicionando elemento ao conjunto
		conjunto.add('a');
		conjunto.add("Texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		
		System.out.println("Add...");
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		
		//Utilizando o método size
		System.out.println("Size... " + conjunto.size());
		
		//Remoções
		System.out.println("Remove...");
		System.out.println(conjunto.remove('a'));
		
		//Contains
		System.out.println("Contains...");
		System.out.println(conjunto.contains('a'));
		System.out.println(conjunto.contains(1));
		
		//Criando outro conjunto
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//Adicionando todos os elementos de uma vez
		//menos os elementos iguais
		//conjunto.addAll(nums);
		
		//Fazendo a intersecção dos elementos
		conjunto.retainAll(nums);
		
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		//Limpando o conjunto
		conjunto.clear();
		
		//verificando se o conjunto está ou não vazio
		System.out.println(conjunto.isEmpty());
	
		
	}
	
}
