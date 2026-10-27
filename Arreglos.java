import java.util.Arrays;

public class Arreglos {
	
	public static int sumaArreglo(int[] numeros) {
		int suma = 0; 
		
		for (int i : numeros) {
			suma += i;
		}
		return suma;
	}

	public static double promedioArreglo(int[] numeros) {
		int sumaT = sumaArreglo(numeros);

		double promedio = (double) sumaT/numeros.length;

		return promedio;

	}

	public static int mayorArreglo(int[] numeros) {
		int mayor = numeros[0];

		for (int j : numeros) {
			if (j > mayor){
				 mayor = j;
			} 
		}
		return mayor;
	}

	public static void main(String[] args) {
		int[] numeros = {8, 3, 10, 5, 4};
		
		int Resultadosuma = sumaArreglo(numeros);
		int Resultadomayor = mayorArreglo(numeros);
		double Resultadopromedio = promedioArreglo(numeros);

		System.out.println("Arreglos: ");
		System.out.println(Arrays.toString(numeros));
	
		System.out.println("\nLa suma total del arreglo es: ");
		System.out.println(Resultadosuma);
	
		System.out.println("\nEl promedio del arreglo es: ");
		System.out.println(Resultadopromedio);
	
		System.out.println("\nEl mayor numero del arreglo es: ");
		System.out.println(Resultadomayor);
		
	}
}
