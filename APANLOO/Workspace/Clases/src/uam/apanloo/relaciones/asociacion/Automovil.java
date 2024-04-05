package uam.apanloo.relaciones.asociacion;

public class Automovil {
  private String serie;
  private String modelo;
  private int anio;
  private TarjetaCirculacion tarjetaCirculacion;

  public Automovil() {
  }

  public Automovil(String serie, String modelo, int anio) {
    this.serie = serie;
    this.modelo = modelo;
    this.anio = anio;
  }

  public Automovil(String serie, String modelo, int anio, TarjetaCirculacion tarjetaCirculacion) {
    this.serie = serie;
    this.modelo = modelo;
    this.anio = anio;
    this.tarjetaCirculacion = tarjetaCirculacion;
  }

  public String getSerie() {
    return serie;
  }

  public String getModelo() {
    return modelo;
  }

  public int getAnio() {
    return anio;
  }

  public TarjetaCirculacion getTarjetaCirculacion() {
    return tarjetaCirculacion;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public void setTarjetaCirculacion(TarjetaCirculacion tarjetaCirculacion) {
    this.tarjetaCirculacion = tarjetaCirculacion;
  }

  @Override
  public String toString() {
    return "Automovil [serie=" + serie + ", modelo=" + modelo + ", año=" + anio + "]";
  }
}
