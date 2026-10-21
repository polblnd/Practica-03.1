import java.util.Scanner;

public class _04 {
	public static String comprimir(String prueba) {
		

		StringBuilder resultado = new StringBuilder();
		 int contador = 1;
		 if (prueba == null || prueba.length() == 0) {
			return " ";
		 }
		for(int i = 1; i < prueba.length(); i++) {
			if (prueba.charAt(i - 1) == ' ') {
				continue;
			}

			if(prueba.charAt(i - 1) == prueba.charAt(i) ) {
				contador++;
			}else{

				resultado.append(prueba.charAt(i - 1));
				resultado.append(contador);
				contador = 1;
			}
		}

			if(prueba.charAt(prueba.length() - 1) != ' ') {

				resultado.append(prueba.charAt(prueba.length() - 1));
				resultado.append(contador);
			}

			return resultado.toString();
	}

	public static void main(String[] args) {
		
		Scanner cadena = new Scanner(System.in);
		
		System.out.println("Compresión de caracteres consecutuvos");
		System.out.println("Ingresa la cadena a comprimir");
		
		
		String textito = cadena.nextLine();
		String resultado = comprimir(textito);
		System.out.println(resultado);
	}
}
