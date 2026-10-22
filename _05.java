public class _05 {
	
	public static void main (String[] args){
		String palabra = "récó!.;nócér!";
		String resultado;
		Boolean esPalindromo =true;
	
	
		StringBuilder word = new StringBuilder(palabra.trim().toLowerCase());
		StringBuilder palindromo = new StringBuilder("récóndfgdfcér".trim().toLowerCase());
		
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
		for (int i = 0; i < palindromo.length(); i++){
			char caracterespecial = palindromo.charAt(i);

			if(caracterespecial == 'á') {
				palindromo.deleteCharAt(i);
				palindromo.insert(i, 'a');
			}else if(caracterespecial == 'é') {
				palindromo.deleteCharAt(i);
				palindromo.insert(i, 'e');
			}else if(caracterespecial == 'í') {
				palindromo.deleteCharAt(i);
				palindromo.insert(i, 'i');
			}else if(caracterespecial == 'ó') {
				palindromo.deleteCharAt(i);
				palindromo.insert(i, 'o');
			}else if(caracterespecial == 'ú') {
				palindromo.deleteCharAt(i);
				palindromo.insert(i,'u');
			}

			caracterespecial = palindromo.charAt(i);

			if(caracterespecial == ' ' || caracterespecial == ',' || caracterespecial == '.' || caracterespecial == ';' || caracterespecial == '¡' ||caracterespecial == '!' || caracterespecial =='¿' || caracterespecial == '?'){
				palindromo.deleteCharAt(i);
				i--;
			}
		}


		palindromo.reverse();


		// Prueba
		System.out.println(palabra);
		System.out.println(word);
		System.out.println("reconocer");
		System.out.println(palindromo);
		if( word.toString().equals(palindromo.toString())){
			System.out.println(esPalindromo);
		}else{
			esPalindromo =false;
			System.out.println(esPalindromo);
		}


	}

}
