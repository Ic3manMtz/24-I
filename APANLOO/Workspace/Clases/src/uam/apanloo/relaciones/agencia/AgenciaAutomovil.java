package uam.apanloo.relaciones.agencia;

public interface AgenciaAutomovil extends GestorCliente, GestorAutomovil{
  //Gestor cliente
  public void agregarCliente(Cliente c);
  public Cliente consultarCliente(String id);
  public Cliente eliminarCliente(String id);

  //Gestor automovil
  public void agregarAutomovil(Automovil a);
  public Automovil consultarAutomovil(Modelo m);
  public Automovil consultarAutomovil(Modelo m, Color c);
  public Automovil[] consultarInvAutomovil(Modelo m);
  public Automovil[] consiltarInvAutomovil(Modelo m, Color c);
  public void actualizarAutomovil(String serie, Automovil a);
  public Automovil eliminarAutomovil(String serie);
}
