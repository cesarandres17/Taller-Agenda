package co.edu.uniquindio.poo;

import java.util.List;
import java.util.ArrayList;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private List<Contacto> contactos;
/**
 * constructor de la clse 
 * @param nombre del grupo 
 * @param categoria la categoria del grupo
 */
    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }
/**
 * agrega un contacto al grupo, siempre y cuando el grupo de contctos sea menor que  5
 * @param contacto el contacto que se va agregar al grupo 
 */
    public void agregarContacto(Contacto contacto) {
        if (contactos.size() < 5) {
            contactos.add(contacto);
        }
    }
/**
 * elimar el contacto del grupo 
 * @param contacto este es el contacto a eliminar del grupo 
 */
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }
/**
 * obtiene la lista de contactos del grupo 
 * @return devueñve la lista de contactos en el grup 
 */
    public List<Contacto> getContactos() {
        return contactos;
    }

    @Override
    public String toString() {
        return "El nombre del grupo es " + nombre + ", categoría: " + categoria + ", y sus contactos son " + contactos;
    }
}
    

