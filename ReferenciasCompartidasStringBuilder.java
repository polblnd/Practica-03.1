public class ReferenciasCompartidasStringBuilder {

    public static void main(String[] args) {
        // Crea un nuevo objeto StringBuilder en memoria con el contenido "Hola"
        StringBuilder a = new StringBuilder("Hola");

        // Asigna la referencia de 'a' a 'b': ambas variables ahora apuntan exactamente al mismo objeto en memoria
        StringBuilder b = a;

        // Crea un objeto StringBuilder totalmente independiente en memoria con el contenido "Hola"
        StringBuilder c = new StringBuilder("Hola");

        // Modifica el objeto apuntado por 'a': el contenido pasa de "Hola" a "Hola mundo" (afecta tambien a 'b')
        a.append(" mundo");

        // Elimina los caracteres del indice 0 al 5 del objeto compartido: remueve "Hola ", por lo que el contenido pasa a ser "mundo"
        b.delete(0, 5);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
