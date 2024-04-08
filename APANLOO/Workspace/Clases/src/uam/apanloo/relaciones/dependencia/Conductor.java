package uam.apanloo.relaciones.dependencia;

public class Conductor {
  private String id;
  private String nombre;
  
  public Conductor() {
  }

  public Conductor(String id, String nombre) {
    this.id = id;
    this.nombre = nombre;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Conductor [id=" + id + ", nombre=" + nombre + "]";
  }
}
