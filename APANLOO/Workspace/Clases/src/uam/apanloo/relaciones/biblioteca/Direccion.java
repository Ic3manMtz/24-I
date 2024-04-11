package uam.apanloo.relaciones.biblioteca;

public class Direccion {
  private String cp;
  private Pais pais;
  private String calle;
  private int numero;
  
  public Direccion() {
  }

  public Direccion(String cp, Pais pais, String calle, int numero) {
    this.cp = cp;
    this.pais = pais;
    this.calle = calle;
    this.numero = numero;
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public Pais getPais() {
    return pais;
  }

  public void setPais(Pais pais) {
    this.pais = pais;
  }

  public String getCalle() {
    return calle;
  }

  public void setCalle(String calle) {
    this.calle = calle;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Direccion [cp=" + cp + ", pais=" + pais + ", calle=" + calle + ", numero=" + numero + "]";
  }
}
