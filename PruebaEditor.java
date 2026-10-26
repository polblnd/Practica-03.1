public class PruebaEditor {
	
	public static void main(String[] args) {
		EditarTexto editor = new EditarTexto();

		editor.escribir("Hola mundo");
		editor.insertar(5, "gran ");
		editor.eliminar(0, 5);

		System.out.println(editor.obtenerTexto());

		editor.deshacer();

		System.out.println(editor.obtenerTexto());
	}
}
