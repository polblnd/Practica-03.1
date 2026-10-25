import java.util.Scanner;

public class SubReemplazo {
	
	public static String reemplazar(String texto, String oldcadena, String newcadena) {
		
		StringBuilder tr = new StringBuilder(texto);
		int longitudoldcadena = oldcadena.length();
		int longitudnewcadena = newcadena.length();
		int i = 0;

		while ((i = tr.indexOf(oldcadena, i)) != -1) {
		
			tr.delete(i, i + longitudoldcadena);
			tr.insert(i, newcadena);

			i += longitudnewcadena;
		}

		return tr.toString();
	}

	public static void main(String[] args) {
		Scanner cadena = new Scanner(System.in);

		System.out.println("Ingresa el texto");
		String texto =  cadena.nextLine();

		System.out.println("Texto que deseas reemplazar");
		String oldcadena = cadena.nextLine();	

		System.out.println("Ingresa nuevo texto de reemplazo");
		String newcadena =  cadena.nextLine();	

		String textonuevo = reemplazar(texto, oldcadena, newcadena);
		System.out.println("El nuevo texto es");
		System.out.println(textonuevo);
	}
}
