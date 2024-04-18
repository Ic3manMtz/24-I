package uam.apanloo.problema5.asociacion;

import java.util.ArrayList;

public class Persona {
  private ArrayList<Perro> perros;
  private String nombre;

  public Persona(){
    this.perros = new ArrayList<>();
  }

  public Persona(String nombre) {
    this.perros = new ArrayList<>();
    this.nombre = nombre;
  }

  public ArrayList<Perro> getPerros() {
    return perros;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public void adoptarPerro(Perro perro){
    this.perros.add(perro);

    this.perros.toString();
  }

  @Override
  public String toString() {
    return "Persona [perros=" + perros + ", nombre=" + nombre + "]";
  }
}
