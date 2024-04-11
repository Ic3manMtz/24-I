package uam.apanloo.relaciones.biblioteca;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca implements AlmacenLibro{
  private LinkedList<Libro> listaDeLibros;

  public Biblioteca() {
    this.listaDeLibros = new LinkedList<Libro>();
  }

  @Override
  public void agregarLibro(Libro l) {
    listaDeLibros.add(l);    
  }

  @Override
  public List<Libro> buscarLibro(String buscado, String criterio) {
    LinkedList<Libro> librosEncontrados = new LinkedList<>();

    if(criterio.equalsIgnoreCase("autor")){
      for (Libro libro : listaDeLibros) {
        if(libro.getAutor().equals(buscado))
          librosEncontrados.add(libro);
      }
    }

    if(criterio.equalsIgnoreCase("titulo")){
      for (Libro libro : listaDeLibros) {
        if(libro.getAutor().equals(buscado))
          librosEncontrados.add(libro);
      }
    }

    if(criterio.equalsIgnoreCase("isbn")){
      for (Libro libro : listaDeLibros) {
        if(libro.getAutor().equals(buscado))
          librosEncontrados.add(libro);
      }
    }

    return librosEncontrados;
  }

  @Override
  public Libro eliminarLibro(String isbn) {
    Libro libroEliminado = null;

    for (Libro libro : listaDeLibros) {
      if(libro.getIsbn().compareToIgnoreCase(isbn)==0){
        libroEliminado = libro;
        break;
      }
    }

    int index = listaDeLibros.indexOf(libroEliminado);
    listaDeLibros.remove(index);
    return libroEliminado;
  }

  @Override
  public void actualizar(Libro l, String isbn) {
    int index = listaDeLibros.indexOf(l);
    listaDeLibros.set(index, l);
  }

  @Override
  public int contarLibros() {
    return listaDeLibros.size();
  }

  @Override
  public int contarLibros(Editorial editorial) {
    int  contador=0;
    for (Libro libro : listaDeLibros) {
      if(libro.getEditorial() == editorial)
        contador++;
    }
    return contador;
  }

  @Override
  public List<Libro> ordernarLibros(String criterio) {
    if(criterio.equalsIgnoreCase("titulo")){
      Comparator<Libro> comparador = new Comparator<Libro>(){
        @Override
        public int compare(Libro  o1, Libro o2) {
          return o1.getTitulo().compareTo(o2.getTitulo());
        }
      };
      Collections.sort(listaDeLibros, comparador);
    }

    if(criterio.equalsIgnoreCase("autor")){
      Comparator<Libro> comparador = new Comparator<Libro>(){
        @Override
        public int compare(Libro  o1, Libro o2) {
          return o1.getAutor().compareTo(o2.getAutor());
        }
      };
      Collections.sort(listaDeLibros, comparador);
    }

    if(criterio.equalsIgnoreCase("isbn")){
      Collections.sort(listaDeLibros);
    }

    return listaDeLibros;
  }

  @Override
  public List<Libro> ordernarLibros() {
    Collections.sort(listaDeLibros);
    return listaDeLibros;
  }
}
