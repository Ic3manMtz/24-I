package uam.apanloo.relaciones.agencia;

public interface GestorAutomovil {
  public void agregarAutomovil(Automovil a);
  public Automovil consultarAutomovil(Modelo m);
  public Automovil consultarAutomovil(Modelo m, Color c);
  public Automovil[] consultarInvAutomovil(Modelo m);
  public Automovil[] consiltarInvAutomovil(Modelo m, Color c);
  public void actualizarAutomovil(String serie, Automovil a);
  public Automovil eliminarAutomovil(String serie);
}
