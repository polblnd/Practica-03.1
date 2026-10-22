public class _05 {
	
	public static void main (String[] args){
		String palabra = "reconocer";
		String resultado;
		Boolean esPalindromo =true;
	
	
		StringBuilder word = new StringBuilder(palabra.trim().toLowerCase());
		StringBuilder palindromo = new StringBuilder("dsfwfsfsf".trim().toLowerCase());
		word.reverse();

		if( word.toString().equals(palindromo.toString())){
			System.out.println(esPalindromo);
		}else{
			esPalindromo =false;
			System.out.println(esPalindromo);
		}


	}

}
