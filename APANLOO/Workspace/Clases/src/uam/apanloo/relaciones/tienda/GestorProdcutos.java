package uam.apanloo.relaciones.tienda;

import java.util.List;

public interface GestorProdcutos {
  public void agregarProducto(Producto p);
  public List<Producto> obtenerProductos();
  public List<Producto> obtenerProductosPorNombre(String nombre);
  public Producto obtenerProductoPorSerie(String serie);
  public int buscarProductosPorNombre(String nombre);
  public int buscarProductosPorMarca(Marca marca);
  public Producto venderProductoNombre(String nombre);
  public Producto venderProductoSerie(String serie);
}
