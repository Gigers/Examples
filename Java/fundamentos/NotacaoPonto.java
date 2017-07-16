package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "É dia ?";
		
		System.out.println("A string normal é " + s);

		System.out.println("Com a magica de Java fica: \n");
		System.out.println(s.replace("dia", "noite"));
	}
}