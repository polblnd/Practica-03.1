import java.util.Scanner;

public class O6 {	

	public static String eliminarDuplicados(String palabra){
		
		StringBuilder invalido = new StringBuilder(palabra);

		for(int i = 0; i < invalido.length(); i++){

			for(int j = i + 1; j < invalido.length(); j++){
			
				if (invalido.charAt(i) == invalido.charAt(j)){
					invalido.deleteCharAt(j);
					j--;
				}
			}
		}

		return invalido.toString();
	}

	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);

		System.out.println("Ingresa tu palabra");
		String palabra = usuario.nextLine();

		String sn = eliminarDuplicados(palabra);
		System.out.println(sn);

	}
}
