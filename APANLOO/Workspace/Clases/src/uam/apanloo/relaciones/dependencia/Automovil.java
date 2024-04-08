package uam.apanloo.relaciones.dependencia;

public class Automovil {
  private String serie;
  private String modelo;
  private Conductor conductor;
  private int anio;
  
  public Automovil() {
  }

  public Automovil(String serie, String modelo, int anio) {
    this.serie = serie;
    this.modelo = modelo;
    this.anio = anio;
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

  public Conductor getConductor(){
    return this.conductor;
  }

  @Override
  public String toString() {
    return "Automovil [serie=" + serie + ", modelo=" + modelo + ", anio=" + anio + "]";
  }

  public void asignarConductor(Conductor conductor){
    this.conductor = conductor;
  }
}