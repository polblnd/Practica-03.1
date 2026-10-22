import java.util.Scanner;

public class _05 {

	public static StringBuilder purificarTexto(StringBuilder word){	
		for (int i = 0; i < word.length(); i++){
			char caracterespecial = word.charAt(i);

			if(caracterespecial == 'á') {
				word.deleteCharAt(i);
				word.insert(i, 'a');
			}else if(caracterespecial == 'é') {
				word.deleteCharAt(i);
				word.insert(i, 'e');
			}else if(caracterespecial == 'í') {
				word.deleteCharAt(i);
				word.insert(i, 'i');
			}else if(caracterespecial == 'ó') {
				word.deleteCharAt(i);
				word.insert(i, 'o');
			}else if(caracterespecial == 'ú') {
				word.deleteCharAt(i);
				word.insert(i,'u');
			}

			caracterespecial = word.charAt(i);

			if(caracterespecial == ' ' || caracterespecial == ',' || caracterespecial == '.' || caracterespecial == ';' || caracterespecial == '¡' ||caracterespecial == '!' || caracterespecial =='¿' || caracterespecial == '?'){
				word.deleteCharAt(i);
				i--;
			}
		}
		return word;
	}

	public static boolean esPalindromo(String palabraPalindromo){

		boolean esPalindromo = false;

		StringBuilder word = new StringBuilder(palabraPalindromo.trim().toLowerCase());
		word = purificarTexto(word);
		
		if (word.length() == 0) {
			return false;
		}

		StringBuilder palindromo = new StringBuilder(word.toString());
		
		word.reverse();

		if( word.toString().equals(palindromo.toString())){
			esPalindromo = true;
		}else{
			esPalindromo =false;
		}

		return esPalindromo;
	}

	public static void main(String[] args){
		Scanner usuario = new Scanner(System.in);

		System.out.println("Ingresa tu frase o palabra ");
		String palabraPalindromo = usuario.nextLine();

		boolean resultado = esPalindromo(palabraPalindromo);
		System.out.println(resultado);

	}
}
