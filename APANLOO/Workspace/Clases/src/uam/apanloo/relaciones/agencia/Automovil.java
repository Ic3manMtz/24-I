package uam.apanloo.relaciones.agencia;

public class Automovil {
  private Modelo modelo;
  private Marca marca;
  private String serie;
  private Color color;
  private int anio;

  public Automovil(){
  }
  
  public Automovil(Modelo modelo, Marca marca, String serie, Color color, int anio) {
    this.modelo = modelo;
    this.marca = marca;
    this.serie = serie;
    this.color = color;
    this.anio = anio;
  }

  public Modelo getModelo() {
    return modelo;
  }

  public void setModelo(Modelo modelo) {
    this.modelo = modelo;
  }

  public Marca getMarca() {
    return marca;
  }

  public void setMarca(Marca marca) {
    this.marca = marca;
  }

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getAnio() {
    return anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  @Override
  public String toString() {
    return "Automovil [modelo=" + modelo + ", marca=" + marca + ", serie=" + serie + ", color=" + color + ", anio="
        + anio + "]";
  }
}
