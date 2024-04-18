package uam.apanloo.problema5.herencia;

public class Bicicleta extends Vehiculo{
  private String tipoBicicleta;

  public Bicicleta(int numeroRuedas) {
    super(numeroRuedas);
  }

  public Bicicleta(int numeroRuedas, String tipoBicicleta) {
    super(numeroRuedas);
    this.tipoBicicleta = tipoBicicleta;
  }

  public String getTipoBicicleta() {
    return tipoBicicleta;
  }

  public void setTipoBicicleta(String tipoBicicleta) {
    this.tipoBicicleta = tipoBicicleta;
  }

  @Override
  public String toString() {
    return "Bicicleta [tipoBicicleta=" + tipoBicicleta + "]";
  }
}
