package Colecoes;

import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Criando coleção de Strings - set
		//Isso cria um conjunto homogênio
		//Set<String> aprovados = new HashSet<String>();
		//Acima há um exemplo de uma definição de um conjunto desordenado
		//Abaixo um exemplo de uma estrutura ordenada
		//Set<String> aprovados = new LinkedHashSet<String>();
		//Perceba que a execução mostra que a ordem de inserção foi respeitada
		//com o LinkedHashSet
		
		//Há também a TreeSet
		//Essa faz a definição por ordens padrão, veja: 
		//Se for número ele irá ordenar do menor para o maior
		//Caso seja letras será em ordem alfabetica
		Set<String> aprovados = new TreeSet();
		
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		aprovados.add("Ana");
		
		
		for(String name: aprovados) {
			System.out.println(name);
		}
		
	}

}
