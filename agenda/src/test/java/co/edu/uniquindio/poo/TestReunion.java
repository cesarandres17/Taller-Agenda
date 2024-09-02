

package co.edu.uniquindio.poo;

public class TestReunion {
    public static void main(String[] args) {
        /*se crea una nueva reunion  */
        Reunion reunion = new Reunion("Reunión de Trabajo", "2024-10-01", "09:00AM");

        /*se crean contactos */
        Contacto contacto1 = new Contacto("Ana", "Anita", "Avenida Central", "+57 3012345678", "ana@example.com");
        Contacto contacto2 = new Contacto("Carlos", "Carlitos", "Calle 45", "+57 3023456789", "carlos@example.com");

       /*se agregan contactos a la reunion  */
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);

        
        System.out.println("asistentes a la reunión: " + reunion.getAsistentes());

        /*se eliminan asistentes  */
        reunion.eliminarAsistente(contacto1);

        /*resultado despues de eliminar  */
        System.out.println("asistentes después de eliminar: " + reunion.getAsistentes());
    }
}

