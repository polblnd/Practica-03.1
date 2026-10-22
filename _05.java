public class _05 {
	
	public static void main (String[] args){
		String palabra = "récó!.;nócér!";
		String resultado;
		Boolean esPalindromo =true;
	
	
		StringBuilder word = new StringBuilder(palabra.trim().toLowerCase());
		StringBuilder palindromo = new StringBuilder("reconocer".trim().toLowerCase());
		
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

		word.reverse();


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
