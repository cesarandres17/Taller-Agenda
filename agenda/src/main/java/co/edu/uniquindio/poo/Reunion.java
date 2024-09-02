package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;


public class Reunion {

   private String descripcion;
   private String fecha;
   private String hora;
   private List<Contacto> asistentes;

   
   /*ESTE ES EL CONTRUCTOR DE LA CLASE REUNION */
   public Reunion(String descripcion, String fecha, String hora){

    this.descripcion = descripcion;
    this.fecha = fecha;
    this.hora = hora;
    this.asistentes =new ArrayList<>();

   }
   /**
    * agrega un contacto a la lista de asistendes de la reunion 
    * @param contacto el contacto que se quiere agregar como asistente 
    */
   public void agregarAsistente(Contacto contacto) {
      asistentes.add(contacto);
  }
/**
 * metodo para eliminar un asistente de la lista de assitentes de la reunion 
 * @param contacto el contacto que se quiere eliminar 
 */
  public void eliminarAsistente(Contacto contacto) {
      asistentes.remove(contacto);
  }
/*se obtiene la lista de contactos  */
  public List<Contacto> getAsistentes() {
      return asistentes;
  }
/*se obtiene la descripcion  de la reunion  */
  public String getDescripcion() {
      return descripcion;
  }
/*se obtiene la fecha de la reunion  */
  public String getFecha() {
      return fecha;
  }
/*se obtiene la hora de la reunion  */
  public String getHora() {
      return hora;
  }
/*se modifica la descripcion de la reunion  */
  public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
  }
/*se modifica la fecha de la reunion  */
  public void setFecha(String fecha) {
      this.fecha = fecha;
  }
/*se modifica la hora de la funcion  */
  public void setHora(String hora) {
      this.hora = hora;
  }

  @Override
  public String toString() {
      return "Reunion descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + ", asistentes="
              + asistentes + "]";
  }




    
}
