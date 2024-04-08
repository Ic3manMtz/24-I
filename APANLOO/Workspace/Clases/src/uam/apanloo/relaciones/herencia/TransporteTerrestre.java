package uam.apanloo.relaciones.herencia;

public class TransporteTerrestre {
  private String marca;
  private int numeroRuedas;

  public TransporteTerrestre(){
  }

  public TransporteTerrestre(String marca, int numeroRuedas) {
    this.marca = marca;
    this.numeroRuedas = numeroRuedas;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getNumeroRuedas() {
    return numeroRuedas;
  }

  public void setNumeroRuedas(int numeroRuedas) {
    this.numeroRuedas = numeroRuedas;
  }

  public void avanzar(){
    System.out.print("Avanzando...");
  }

  public void detener(){
    System.out.print("Deteniendose...");
  }

  public void  girarDerecha() {
    System.out.print("Girando a la derecha..."); 
  }

  public void girarIzquierda(){
    System.out.print("Girando a la izquieda...");
  }
}
