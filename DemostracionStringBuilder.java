public class DemostracionStringBuilder {

    public static void main(String[] args) {
        // Inicializa un StringBuilder con el texto "ABCDE"
        StringBuilder sb = new StringBuilder("ABCDE");

        // Elimina los caracteres desde el indice 1 (inclusive) hasta el 4 (exclusive): remueve "BCD", queda "AE"
        sb.delete(1, 4);

        // Inserta la cadena "xyz" en la posicion de indice 1: pasa de "AE" a "AxyzE"
        sb.insert(1, "xyz");

        // Invierte la secuencia de caracteres: pasa de "AxyzE" a "EzyxA"
        sb.reverse();

        // Reemplaza los caracteres desde el indice 1 hasta el 4 por "-": reemplaza "zyx" por "-", queda "E-A"
        sb.replace(1, 4, "-");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
