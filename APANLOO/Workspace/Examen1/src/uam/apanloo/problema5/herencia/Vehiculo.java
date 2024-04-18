package uam.apanloo.problema5.herencia;

public class Vehiculo {
  private int numeroRuedas;

  public Vehiculo(int numeroRuedas) {
    this.numeroRuedas = numeroRuedas;
  }

  public int getNumeroRuedas() {
    return numeroRuedas;
  }

  public void setNumeroRuedas(int numeroRuedas) {
    this.numeroRuedas = numeroRuedas;
  }

  @Override
  public String toString() {
    return "Vehiculo [numeroRuedas=" + numeroRuedas + "]";
  }
  
  public void avanzar(){
    System.out.println("Avanzando...");
  }

  public void detenerse(){
    System.out.println("Detenido...");
  }
}
