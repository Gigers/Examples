package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Tipos primitivos
				
		//Númericos
		//Inteiros
		byte a;
		a = 127; 
		System.out.printf("Byte = %d \n", a);
		System.out.println(Integer.toBinaryString(a)); //tamanho binario
		
		short b; 
		b = 32767;
		System.out.printf("Short = %d\n", b);
		System.out.println(Integer.toBinaryString(b)); //tamanho binario
		
		int c;
		c = 1123456789;
		System.out.printf("Int = %d\n", c);
		System.out.println(Integer.toBinaryString(c)); //tamanho binario
		
		
		long d;
		d = 987659089797923234L;
		System.out.printf("Long = %d\n", d);
		System.out.println(Long.toBinaryString(d));
		
		//Ponto flutuante
		float e;
		double f;
		
		//Char
		char g1,g2,g3; //Delimitados por aspas simples
		
		//Permite uma única letra
		/*declaração: */{
		g1 = 'a';
		g2 = '!';
		g3 = '\u0050'; //Código de um caractere unicode
		}
		System.out.printf("%c %c %c\n", g1,g2,g3);
		
		
		//boolean
		boolean h; //Permite apenas as palavras true ou false
		
		/*declaração:*/{
		h = true;
		//ou
		h = false;
		}
	
		// Ponto flutuante
		float i = 3.141592f;
		
		double j = 1.61;
		
		System.out.printf("%.2f %.1f", i,j);
		
	}

}
