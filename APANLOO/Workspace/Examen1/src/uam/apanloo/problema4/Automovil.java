package uam.apanloo.problema4;

public class Automovil implements Comparable<Automovil>{
  private String marca;
  private String serie;
  
  public Automovil() {
  }

  public Automovil(String marca, String serie) {
    this.marca = marca;
    this.serie = serie;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  @Override
  public String toString() {
    return "Automovil [marca=" + marca + ", serie=" + serie + "]";
  }

  @Override
  public int compareTo(Automovil o) {
    return marca.compareTo(o.getMarca());
  }
}
