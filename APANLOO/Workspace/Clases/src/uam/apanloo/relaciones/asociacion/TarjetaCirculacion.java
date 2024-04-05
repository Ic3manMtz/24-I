package uam.apanloo.relaciones.asociacion;

public class TarjetaCirculacion {
  private Automovil automovil;

  public TarjetaCirculacion() {
  }

  public TarjetaCirculacion(Automovil automovil) {
    this.automovil = automovil;
  }

  public Automovil getAutomovil() {
    return this.automovil;
  }

  public void setAutomovil(Automovil automovil) {
    this.automovil = automovil;
  }
}
