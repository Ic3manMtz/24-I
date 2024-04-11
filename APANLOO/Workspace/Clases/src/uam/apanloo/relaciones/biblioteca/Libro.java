package uam.apanloo.relaciones.biblioteca;

public class Libro implements Comparable<Libro>{
  private String titulo;
  private String autor;
  private String isbn;
  private Fecha  fechaPublicacion;
  private String idioma;
  private Editorial editorial;

  public Libro(){
  }

  public Libro(String titulo, String autor, String isbn, int dia, int mes, int anio, String idioma, Editorial editorial) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.fechaPublicacion = new Fecha(dia, mes, anio);
    this.idioma = idioma;
    this.editorial = editorial;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public Fecha getFecha(){
    return fechaPublicacion;
  }

  public void setFecha(int dia, int mes, int anio){
    this.fechaPublicacion = new Fecha(dia, mes, anio);
  }

  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  public Editorial getEditorial() {
    return editorial;
  }

  public void setEditorial(Editorial editorial) {
    this.editorial = editorial;
  }

  @Override
  public int compareTo(Libro o) {
    return this.isbn.compareTo(o.getIsbn());
  }

  @Override
  public String toString() {
    return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", fechaPublicacion=" + fechaPublicacion
        + ", idioma=" + idioma + ", editorial=" + editorial + "]";
  }
}
