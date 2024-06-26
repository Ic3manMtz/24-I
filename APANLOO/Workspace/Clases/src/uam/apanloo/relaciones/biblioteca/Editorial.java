package uam.apanloo.relaciones.biblioteca;

public class Editorial {
  private String nombre;
  private Direccion direccion;
  private String telefono;
  private String correo;
  
  public Editorial() {
  }

  public Editorial(String nombre, Direccion direccion, String telefono, String correo) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.correo = correo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Direccion getDireccion() {
    return direccion;
  }

  public void setDireccion(Direccion direccion) {
    this.direccion = direccion;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  @Override
  public String toString() {
    return "Editorial [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo
        + "]";
  }
}
