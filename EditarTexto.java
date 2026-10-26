public class EditarTexto {
	
	private StringBuilder text;
	private StringBuilder textoanterior;
	
	public EditarTexto() {
		this.text = new StringBuilder();
		this.textoanterior = null;
	}
		
	private void textoanterior() {
		this.textoanterior = new StringBuilder(this.text);
	}

	public void escribir(String texto) {
		textoanterior();
		this.text.append(texto);
	}
		
	public void insertar(int posicion, String texto) {
		textoanterior();
		this.text.insert(posicion, texto);
	}

	public void eliminar(int inicio, int fin) {
		textoanterior();
		this.text.delete(inicio, fin);
	}

	public void reemplazar(int inicio, int fin, String texto) {
		textoanterior();
		this.text.replace(inicio, fin, texto);
	}

	public void deshacer() {
		if (this.textoanterior != null) {
			this.text = new StringBuilder(this.textoanterior);
			this.textoanterior = null;
		}
	}
	
	public String obtenerTexto() {
		return this.text.toString();
	}

}
