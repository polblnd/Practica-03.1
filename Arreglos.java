public class Arreglos {
	
	public static int sumaArreglo(int[] numeros) {
		int suma = 0; 
		
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		return suma;
	}

	public static double promedioArreglo(int[] numeros) {
		int sumaT = sumaArreglo(numeros);

		double promedio = (double) sumaT/numeros.length;

		return promedio;

	}

	public static void main(String[] args) {
		int[] numeros = {8, 3, 10, 5, 4};
		
		int Resultadosuma = sumaArreglo(numeros);
		double Resultadopromedio = promedioArreglo(numeros);

		System.out.println(numeros);
		System.out.println(Resultadosuma);
		System.out.println(Resultadopromedio);
		
	}
}
