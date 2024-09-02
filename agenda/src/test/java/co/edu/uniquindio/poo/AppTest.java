package co.edu.uniquindio.poo;

public class AppTest {
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();

        
        Contacto contacto1 = new Contacto("Ana", "Anita", "Avenida Central", "+57 3012345678", "ana@example.com");
        Contacto contacto2 = new Contacto("Ana", "Anita", "Avenida Central", "+57 3012345678", "ana@example.com");
       
        agenda.agregarContacto(contacto1);
        agenda.agregarContacto(contacto2);

        
        System.out.println("Contactos en la agenda: " + agenda.getContactos());
    }
}
