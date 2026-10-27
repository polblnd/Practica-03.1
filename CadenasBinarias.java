import java.util.Scanner;

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

	public static boolean binario(String numero) {
		if (numero == null || numero.isEmpty()) return false;

		for (int k = 0; k < numero.length(); k++) {
			char digito = numero.charAt(k);
			if (digito != '0' && digito != '1') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner bit = new Scanner(System.in);
		
		System.out.println("\nIngresa el valor de tu primer numero binario");
		String a = bit.nextLine();
		while (a.length() < 1 || a.length() > 10000 || !binario(a)) {
			System.out.println("\n\n\nIngresa un numero binario con mas de 1 dígito y menos de 10000 dígitos");
			 a = bit.nextLine();
		}

		System.out.println("\n\nIngresa el valor de tu segundo numero binario");
		String b = bit.nextLine();
		while (b.length() < 1 || b.length() > 10000 || !binario(b)) {
			System.out.println("\n\n\nIngresa un numero binario con mas de 1 dígito y menos de 10000 dígitos");
			 b = bit.nextLine();
		}

		String suma = addBinary(a, b);
	
		System.out.print("\nEl resultado es: ");
		System.out.println(suma);

	}
}
