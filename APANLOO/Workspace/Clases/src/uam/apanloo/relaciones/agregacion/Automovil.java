package uam.apanloo.relaciones.agregacion;

public class Automovil {
  private String serie;
  private String modelo;
  private Marca marca;
  private int anio;
  private Motor motor;

  public Automovil() {
  }

  public Automovil(String serie, String modelo, Marca marca, int anio, Motor motor) {
    this.serie = serie;
    this.modelo = modelo;
    this.marca = marca;
    this.anio = anio;
    this.motor = motor;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  @Override
  public String toString() {
    return "Automovil [serie=" + serie + ", modelo=" + modelo + ", marca=" + marca + ", anio=" + anio + ", motor="
        + motor + "]";
  }
}
