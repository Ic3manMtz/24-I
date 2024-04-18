package uam.apanloo.problema5.composicion;

public class Habitacion {
  private String nombre;

  public Habitacion(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Habitacion [nombre=" + nombre + "]";
  }
}
