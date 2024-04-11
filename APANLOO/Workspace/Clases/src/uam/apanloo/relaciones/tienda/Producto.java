package uam.apanloo.relaciones.tienda;

public class Producto {
  private String serie;
  private Marca marca;
  private String nombre;
  
  public Producto(String serie, Marca marca, String nombre) {
    this.serie = serie;
    this.marca = marca;
    this.nombre = nombre;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Marca getMarca() {
    return marca;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "Producto [serie=" + serie + ", marca=" + marca + ", nombre=" + nombre + "]";
  }
}
