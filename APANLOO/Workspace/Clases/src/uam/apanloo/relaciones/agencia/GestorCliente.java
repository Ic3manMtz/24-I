package uam.apanloo.relaciones.agencia;

public interface GestorCliente {
  public void agregarCliente(Cliente c);
  public Cliente consultarCliente(String id);
  public Cliente eliminarCliente(String id);
}
