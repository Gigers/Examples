package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	//FIFO
	//First In, First Out
	//Pode haver vários criterios de ordenação
	
	public static void main(String[] args) {
		
		//LinkedList é uma fila também, por isso sua participação na definição
		Queue<String> fila = new LinkedList<>();
		
		//offer trabalha como o add
		//Sua diferença é que quando, por qualquer motivo, não seja possível inserir ele não vai retornar erro
		//simplesmente ele irá retornar falso
		fila.offer("Maria");
		fila.offer("João");
		
		fila.add("José"); // -> Retorna erro
		
		//Os dois métodos Peek/Element pegam elementos da lista, porém
		//Peek -> Quando a fila está vazia retorna null
		//Element -> Quando a fila está vazia retorna um erro
		
		System.out.println("Peek/Element...");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		//Removendo elementos da lista
		//Poll/Remove...
		System.out.println("Pool/Remove");
		System.out.println(fila.poll()); //-> Remove o primeiro da fila
		System.out.print(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); //Quando os elementos da fila acabam e o poll é executado
										 //ele retorna null
		
		System.out.println(fila.remove()); //Quando os elementos da fila acabam e o remove é executado
											//ele retorna um erro
	
		
	}
	
}
