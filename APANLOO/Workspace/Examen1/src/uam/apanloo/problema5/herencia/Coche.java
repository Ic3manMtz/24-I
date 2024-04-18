package uam.apanloo.problema5.herencia;

public class Coche extends Vehiculo{
  private String serieMotor;

  public Coche(int numeroRuedas) {
    super(numeroRuedas);
  }

  public Coche(int numeroRuedas, String serieMotor) {
    super(numeroRuedas);
    this.serieMotor = serieMotor;
  }

  public String getSerieMotor() {
    return serieMotor;
  }

  public void setSerieMotor(String serieMotor) {
    this.serieMotor = serieMotor;
  }

  @Override
  public String toString() {
    return "Coche [serieMotor=" + serieMotor + "]";
  }
}
