

package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        /*metodo en que se crean los contactos  */
        Contacto contacto1 = new Contacto("Ana", "Anita", "Avenida Central", "+57 3012345678", "ana@example.com");
        Contacto contacto2 = new Contacto("Carlos", "Carlitos", "Calle 45", "+57 3023456789", "carlos@example.com");
        Contacto contacto3 = new Contacto("Laura", "Lau", "Avenida Libertador", "+57 3034567890", "laura@example.com");
        Contacto contacto4 = new Contacto("Miguel", "Migue", "Calle 23", "+57 3045678901", "miguel@example.com");
        Contacto contacto5 = new Contacto("Valeria", "Vale", "Carrera 18", "+57 3056789012", "valeria@example.com");
        Contacto contacto6 = new Contacto("Felipe", "Feli", "Avenida de los Álamos", "+57 3067890123", "felipe@example.com");
        

       /* se agregan contactos a la agenda  */
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);
        agenda.agregarContacto(contacto3);
        agenda.agregarContacto(contacto4);
        agenda.agregarContacto(contacto5);
        agenda.agregarContacto(contacto6);
        



        /*se crean grupos de contactos */
        Grupo grupo1 = new Grupo("fiesta de pablo", Categoria.AMIGOS);
        grupo1.agregarContacto(contacto5);
        grupo1.agregarContacto(contacto3);
        grupo1.agregarContacto(contacto4);
        grupo1.agregarContacto(contacto1);        


        Grupo grupo2 = new Grupo("año nuevo", Categoria.FAMILIA);
        grupo2.agregarContacto(contacto1);
        grupo2.agregarContacto(contacto3);
        grupo2.agregarContacto(contacto4);
        grupo2.agregarContacto(contacto6);
        grupo2.agregarContacto(contacto2);
        


        /*con esto agregamos grupos a la agenda  */ 
        agenda.agregarGrupo(grupo1);
        agenda.agregarGrupo(grupo2);


        /*se crean reuniones  */
        Reunion reunion1 = new Reunion("fiesta de boda", "2024-09-14", "10:00AM");
        reunion1.agregarAsistente(contacto2);
        reunion1.agregarAsistente(contacto3);
        reunion1.agregarAsistente(contacto1);
        reunion1.agregarAsistente(contacto5);

        /*se agregan reuniones a la agenda  */
        agenda.agregarReunion(reunion1);

        Agenda.mostrarMensaje(agenda.toString());
    }
}
        
    
