package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    private List<Grupo> grupos;
    private List<Reunion> reuniones;

    /*clase ageda que nos permite gestionar los contactos, grupos y reuniones  */
/*constructor de la clase
      * se inicializan las listas de contactos, grupos y reuniones 
      */
    public Agenda() {
        this.contactos = new ArrayList<>();
        this.grupos = new ArrayList<>();
        this.reuniones = new ArrayList<>();
    }
     /*agrega contactos a la agenda, siempre y cuando no exista un contacto con el mismo nombre y numero 
      * 

      */
    public void agregarContacto(Contacto contacto) {
        if (validarContacto(contacto.getNombre(), contacto.getTelefono())){
            mostrarMensaje("El contacto ya se encuentra agendado.");

        }else{
            contactos.add(contacto);
        }
    }
/*elimina contactos de la agenda  */
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }
/*este metodo valida si el contacto ya existe  */
    public boolean validarContacto(String nombre, String telefono){
        boolean contactoExistente=false;
        for (Contacto contacto:contactos){
            if (contacto.getNombre().equals(nombre) || contacto.getTelefono().equals(telefono)){
                contactoExistente=true;
            }
        }
        return contactoExistente;
    
    }
/*agrega un grupo a a la agenda  */
    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
/*elimina un grupo de la agenda  */
    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }
/*agrega un areunion a la agenda */
    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }
/*elimina una reunion de la genda  */
    public void eliminarReunion(Reunion reunion) {
        reuniones.remove(reunion);
    }
/*obtiene la lista de contactos */
    public List<Contacto> getContactos() {
        return contactos;
    }
/*obtiene la lista de grupos */
    public List<Grupo> getGrupos() {
        return grupos;
    }
/*obtiene la lista de reuniones  */
    public List<Reunion> getReuniones() {
        return reuniones;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString(){
        return "La agenda tiene agtregados a los siguientes contactos: \n" +contactos+ "\n\n En tu agenda contiene los siguientes grupos: \n;" +grupos+ "\n\n En tu agenda contienes las siguientes reuniones: \n" +reuniones;
        
        
    }
}