package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	
	public static void main(String[] args) {
		
		
		//Criando a lista
		List<String> aprovados = new ArrayList();
		
		//adicionando aprovados
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		System.out.println("Get...");
		//Como é indexado utilizo o get para pegar elementos a partir do index
		//Veja:
		System.out.println(aprovados.get(2));
	
		
		//Adicionando elemento igual
		System.out.println("Add...");
		System.out.println(aprovados.add("Maria"));
		System.out.println("Size..." + aprovados.size());
		
		
		//Remove
		System.out.println("Remove...");
		System.out.println(aprovados.remove("Maria"));
		//Verificando o tamanho
		System.out.println(aprovados.size());
		
		
		//Verificando todos os itens
		
//		for(int i = 0; i < aprovados.size(); i++) {
//			System.out.println(aprovados.get(i));
//		}
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		aprovados.contains("Maria");
		
	}
	
}
