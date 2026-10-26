import java.util.Scanner;

public class reverso {
	
	public static String invertirPalabra(String texto) {
		String cleantext = texto.trim();

		StringBuilder reverse = new StringBuilder();
		String palabra = "";

		for (int i = 0; i < cleantext.length(); i++) {
			char c = cleantext.charAt(i);

			if (c == ' ') {
				
				reverse.insert(0, palabra);
				reverse.insert(0, " ");

				palabra = "";
			}else {
				
				palabra += c;
			}
		}

		reverse.insert(0, palabra);
		return reverse.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el texto");
		String texto = scanner.nextLine();

		String reverse = invertirPalabra(texto);
		System.out.println("Resultado");
		System.out.println(reverse);
	}

}
