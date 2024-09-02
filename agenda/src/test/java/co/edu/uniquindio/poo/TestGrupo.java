
package co.edu.uniquindio.poo;

public class TestGrupo {
    public static void main(String[] args) {
        
        Agenda Agenda = new Agenda();

       
        Contacto contacto1 = new Contacto("Ana1", "Anita", "Avenida Central", "+57 3012345678", "ana@example.com");
        Contacto contacto2 = new Contacto("Carlos2", "Carlitos", "Calle 45", "+57 3023456789", "carlos@example.com");
        Contacto contacto3 = new Contacto("Laura3", "Lau", "Avenida Libertador", "+57 3034567890", "laura@example.com");
        Contacto contacto4 = new Contacto("Miguel4", "Migue", "Calle 23", "+57 3045678901", "miguel@example.com");
        Contacto contacto5 = new Contacto("Valeria5", "Vale", "Carrera 18", "+57 3056789012", "valeria@example.com");
        Contacto contacto6 = new Contacto("Felipe6", "Feli", "Avenida de los Álamos", "+57 3067890123", "felipe@example.com");

       
        Grupo grupo = new Grupo("Amigos", Categoria.AMIGOS);

        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        grupo.agregarContacto(contacto6);

        
        System.out.println("Contactos en el grupo: " + grupo.getContactos());
    }
}
