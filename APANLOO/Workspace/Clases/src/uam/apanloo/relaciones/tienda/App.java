package uam.apanloo.relaciones.tienda;

public class App {
  public static void main(String[] args) {
    Producto p1 = new Producto("0789821", Marca.ALPURA, "Leche entera");
    Producto p2 = new Producto("0789123", Marca.GAMESA, "Galletas");
    Oxxo  o1 = new Oxxo();

    o1.agregarProducto(p1);
    o1.agregarProducto(p2);

    System.out.println(o1.obtenerProductos());
    System.out.println("marcas: "+o1.buscarProductosPorMarca(Marca.ALPURA));
  }
}
