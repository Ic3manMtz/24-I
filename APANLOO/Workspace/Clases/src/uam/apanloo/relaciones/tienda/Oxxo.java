package uam.apanloo.relaciones.tienda;

import java.util.ArrayList;
import java.util.List;

public class Oxxo implements GestorProdcutos{
  private ArrayList<Producto>  productos;

  public Oxxo(){
    this.productos = new ArrayList<>();
  }

  @Override
  public void agregarProducto(Producto p) {
    productos.add(p);
  }

  @Override
  public List<Producto> obtenerProductos() {
    return productos;
  }

  @Override
  public List<Producto> obtenerProductosPorNombre(String nombre) {
    ArrayList<Producto> filtrados = new ArrayList<>();
    for (Producto producto : productos) {
      if(producto.getNombre().equalsIgnoreCase(nombre))
        filtrados.add(producto);
    }

    return filtrados;
  }

  @Override
  public Producto obtenerProductoPorSerie(String serie) {
    for (Producto producto : productos) {
      if(producto.getSerie().equals(serie))
        return producto;
    }

    return null;
  }

  @Override
  public int buscarProductosPorNombre(String nombre) {
    int  contador=0;
    for (Producto producto : productos){
      if(producto.getNombre().equals(nombre))
        contador++;
    }

    return contador;
  }

  @Override
  public int buscarProductosPorMarca(Marca marca) {
    int contador=0;
    for (Producto producto : productos) {
      if(producto.getMarca().equals(marca))
        contador++;
    }

    return contador;
  }

  @Override
  public Producto venderProductoNombre(String nombre) {
    for (Producto producto : productos) {
      if(producto.getNombre().equals(nombre)){
        int indice = productos.indexOf(producto);
        Producto vendido = producto;
        productos.remove(indice);
        return vendido;
      }
    }

    return null;
  }

  @Override
  public Producto venderProductoSerie(String serie) {
    for (Producto producto : productos) {
      if(producto.getNombre().equals(serie)){
        int indice = productos.indexOf(producto);
        Producto vendido = producto;
        productos.remove(indice);
        return vendido;
      }
    }

    return null;
  }


}
