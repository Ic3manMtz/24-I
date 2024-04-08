package uam.apanloo.relaciones.comparable;

import java.util.GregorianCalendar;

public class Libro implements Comparable<Libro>{
  private String autor;
  private String titulo;
  private GregorianCalendar fpublicacion;
  private String isbn;

  public Libro(){
    super();
  }

  public Libro(String autor, String titulo, GregorianCalendar fpublicacion){
    super();
    this.autor = autor;
    this.titulo = titulo;
    this.fpublicacion = fpublicacion;
  }

  public Libro(String autor, String titulo, GregorianCalendar fpublicacion, String isbn) {
    super();
    this.autor = autor;
    this.titulo = titulo;
    this.fpublicacion = fpublicacion;
    this.isbn = isbn;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public GregorianCalendar getFpublicacion() {
    return fpublicacion;
  }

  public void setFpublicacion(GregorianCalendar fpublicacion) {
    this.fpublicacion = fpublicacion;
  }

  @Override
  public String toString() {
    return "Libro [Autor= "+autor+", Titulo= "+titulo+", ISBN= "+isbn+", Fecha="+fpublicacion.get(GregorianCalendar.DAY_OF_MONTH)
    +"/"+fpublicacion.get(GregorianCalendar.MONTH)+"/"+fpublicacion.get(GregorianCalendar.YEAR)+"]";
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public int compareTo(Libro o) {
    // TODO Auto-generated method stub
    return this.isbn.compareTo(o.getIsbn());
  }

} 
