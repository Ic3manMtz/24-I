package uam.apanloo.relaciones.composicion;

public class Automovil {
  private String serie;
  private String modelo;
  private int anio;
  private Motor motor;
  
  public Automovil(String serie, String modelo, int anio) {
    this.serie = serie;
    this.modelo = modelo;
    this.anio = anio;
    this.motor = new Motor();
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

    
}
