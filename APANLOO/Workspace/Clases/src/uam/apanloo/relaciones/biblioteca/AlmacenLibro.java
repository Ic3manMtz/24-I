package uam.apanloo.relaciones.biblioteca;

import java.util.List;

public interface AlmacenLibro {
  public void agregarLibro(Libro l);
  public List<Libro> buscarLibro(String buscado, String criterio);
  public Libro eliminarLibro(String isbn);
  public void actualizar(Libro l, String isbn);
  public int contarLibros();
  public int contarLibros(Editorial editorial);
  public List<Libro> ordernarLibros(String criterio);
  public List<Libro> ordernarLibros();
}
