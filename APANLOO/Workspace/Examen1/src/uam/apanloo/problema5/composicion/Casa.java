package uam.apanloo.problema5.composicion;

import java.util.LinkedList;

public class Casa {
  private String direccion;
  private LinkedList<Habitacion> habitaciones;

  public Casa(){
    this.habitaciones = new LinkedList<>();
  }

  public Casa(String direccion){
    this.direccion = direccion;
    this.habitaciones = new LinkedList<>();
  }

  public void crearHabitacion(String nombre){
    this.habitaciones.add(new Habitacion(nombre));
  }

  @Override
  public String toString() {
    return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + "]";
  }
}
