public class CadenasBinarias {

	public static String addBinary(String a, String b) {

		int acarreo = 0;

		int[] binario1 = new int[a.length()];
		int[] binario2 = new int[b.length()];
		
		for (int i = 0; i < a.length(); i++) {
			binario1[i] = a.charAt(i) - '0';
		}

		for (int j = 0; j < b.length(); j++) {
			binario2[j] = b.charAt(j) - '0';
		}
	
		int l1 = binario1.length - 1;
		int l2 = binario2.length - 1;
		
		StringBuilder cadenabinaria = new StringBuilder();

		while (l1 >= 0 || l2>= 0 || acarreo > 0) {
			int suma = acarreo;

			if (l1 >= 0) {
				suma += binario1[l1];
				l1--;
			}
			if (l2 >= 0) {
				suma += binario2[l2];
				l2--;
			}

			cadenabinaria.append(suma % 2);
			acarreo = suma / 2;
		}

		return cadenabinaria.reverse().toString();

	}

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";

		String suma = addBinary(a, b);
	
		System.out.println(a);
	
		System.out.println(b);
	
		System.out.println(suma);

	}
}
