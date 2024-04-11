package uam.apanloo.relaciones.agencia;

import java.util.ArrayList;

public class Nissan implements AgenciaAutomovil{
  private ArrayList<Cliente> clientes;
  private ArrayList<Automovil> inventarioAutomoviles;

  public Nissan(){
    this.clientes = new ArrayList<>();
    this.inventarioAutomoviles =  new ArrayList<>();
  }

  @Override
  public void agregarCliente(Cliente c) {
    clientes.add(c);
  }

  @Override
  public Cliente consultarCliente(String id) {
    for (Cliente cliente : clientes) {
      if(cliente.getCurp().equalsIgnoreCase(id))
        return cliente;
    }

    return null;
  }

  @Override
  public Cliente eliminarCliente(String id) {
    for (Cliente cliente : clientes) {
      if(cliente.getCurp().equalsIgnoreCase(id))
        return cliente;
    }

    return null;
  }

  @Override
  public void agregarAutomovil(Automovil a) {
    inventarioAutomoviles.add(a);
  }

  @Override
  public Automovil consultarAutomovil(Modelo m) {
    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getModelo().equals(m))
        return automovil;
    }

    return null;
  }

  @Override
  public Automovil consultarAutomovil(Modelo m, Color c) {
    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getModelo().equals(m) && automovil.getColor().equals(c))
        return automovil;
    }

    return null;
  }

  @Override
  public Automovil[] consultarInvAutomovil(Modelo m) {
    int indice = 0;
    Automovil[] automovilesEncontrados = new Automovil[inventarioAutomoviles.size()];

    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getModelo().equals(m))
        automovilesEncontrados[indice++] = automovil;
    }

    return automovilesEncontrados;
  }

  @Override
  public Automovil[] consiltarInvAutomovil(Modelo m, Color c) {
    int indice = 0;
    Automovil[] automovilesEncontrados = new Automovil[inventarioAutomoviles.size()];

    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getModelo().equals(m) && automovil.getColor().equals(c))
        automovilesEncontrados[indice++] = automovil;
    }

    return automovilesEncontrados;
  }

  @Override
  public void actualizarAutomovil(String serie, Automovil a) {
    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getSerie().equalsIgnoreCase(serie)){
        int index = inventarioAutomoviles.indexOf(automovil);
        inventarioAutomoviles.set(index, a);
        return;
      }
    }
  }

  @Override
  public Automovil eliminarAutomovil(String serie) {
    Automovil encontrado = null;
    for (Automovil automovil : inventarioAutomoviles) {
      if(automovil.getSerie().equalsIgnoreCase(serie)){
        encontrado = automovil;
        inventarioAutomoviles.remove(automovil);
        return encontrado;
      }
    }

    return encontrado;
  }
}
