package uam.apanloo.relaciones.herencia;

public class Automovil extends TransporteTerrestre{
  private String modelo;
  private String serie;

  public Automovil() {
  }

  public Automovil(String modelo, String serie) {
    this.modelo = modelo;
    this.serie = serie;
  }

  public Automovil(String marca, int numeroRuedas, String modelo, String serie) {
    super(marca, numeroRuedas);
    this.modelo = modelo;
    this.serie = serie;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public void sonarClaxon(){
    System.out.print("Beeeeeeeep");
  }
}
