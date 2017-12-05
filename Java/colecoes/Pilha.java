package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		//Definindo a pilha do tipo string
		//Com o operador diamond do java não é necessário
		//inserir o tipo na definição em new
		//Stack<String> pilha = new Stack<>();
		
		
		//Implementa as funcionalidades da fila e de uma pilha
		Deque<String> pilha = new ArrayDeque<>();
		
		
		//Colocando um elemento na pilha
		pilha.push("O pequeno Príncipe");
		pilha.push("Don Quixote");
		
		/*
		 * A pilha ficou da seguinte maneira
		 * 
		 * don quixote
		 * O hobbit
		 * O pequeno príncipe
		 */
		
		//Pegando elemento do topo  sem remover da pilha
		System.out.println(pilha.peek());
		
		//Pegando o elemento do topo da pilha e removendo-o
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
	}

}
