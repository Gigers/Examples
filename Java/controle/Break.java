package Controle;

/* 
 O break é utilizado em loops, e serve para parar o loop.
*/

public class Break {
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if(i == 2) {
				break; //Veja que aqui o loop for será repetido até que o i seja igual a dois
					//Quando i se igualar a 2 o laço será finalizado pelo break
			}
			System.out.println(i);
		}
	}
	
}
