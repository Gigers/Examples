package Colecoes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		//Na definição do Map os generics recebem dois valores
		//<tipo-da-key><tipo-de-valor>
		HashMap<Integer, String> mapa = new HashMap<>();
		
		//Adicionando itens no mapa
		mapa.put(1, "Pedro");
		mapa.put(2, "João");
		mapa.put(3, "Ana");
		
		//Obtendo as chaves
		System.out.println(mapa.keySet());
		
		//Pegando os valores
		System.out.println(mapa.values());
		
		//Pegando a chave e valor
		System.out.println(mapa.entrySet());
		
		//Substituindo valor
		mapa.put(3, "Mariana");
		
		//Como já visto o Map tem duas colunas, e este método possui o contains,
		//por ter duas colunas o valor de contains é representado de duas formas
		
		//Keys
		System.out.println(mapa.containsKey(3));
		System.out.println(mapa.containsKey(4));
		
		//Values
		System.out.println(mapa.containsValue("Ana"));
		System.out.println(mapa.containsValue("Mariana"));
		
		//Fors para consumir os mapas
		
		//Mostrar todas as chaves dentro do map
		System.out.println("Chaves");
		for(Integer codigo: mapa.keySet()) {
			System.out.println(codigo);
		}
		
		//Mostrar os valores do mapa
		System.out.println("Valores");
		for(String nome: mapa.values()) {
			System.out.println(nome);
		}
		
		
		System.out.println("Chaves/Valores...");
		for(Entry<Integer, String> registro: mapa.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
		
	}
	
}
