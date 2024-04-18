package uam.apanloo.problema5.agregacion;

import java.util.ArrayList;

public class Equipo {
  private String nombreEquipo;
  private ArrayList<Jugador> jugadores;

  public Equipo(){
    this.jugadores = new ArrayList<>();
  }

  public Equipo(String nombreEquipo){
    this.nombreEquipo = nombreEquipo;
    this.jugadores = new ArrayList<>();
  }

  public String getNombreEquipo() {
    return nombreEquipo;
  }

  public void setNombreEquipo(String nombreEquipo) {
    this.nombreEquipo = nombreEquipo;
  }

  public ArrayList<Jugador> getJugadores() {
    return jugadores;
  }

  public void setJugadores(ArrayList<Jugador> jugadores) {
    this.jugadores = jugadores;
  }

  public void agregarJugador(Jugador j){
    this.jugadores.add(j);
  }

  public Jugador eliminarJugador(Jugador j){
    int indice = jugadores.indexOf(j);
    
    if (indice == -1) 
      return null;

    Jugador eliminado = jugadores.get(indice);
    jugadores.remove(indice);
    return eliminado;
  }

  @Override
  public String toString() {
    return "Equipo [nombreEquipo=" + nombreEquipo + ", jugadores=" + jugadores + "]";
  }
}
