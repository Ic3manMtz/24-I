package uam.apanloo.problema5.agregacion;

public class App {
  public static void main(String[] args) {
    Equipo equipo = new Equipo("UAMitos");
    
    Jugador jug1 = new Jugador("Jugador1", 1);
    Jugador jug2 = new Jugador("Jugador2", 2);
    Jugador jug3 = new Jugador("Jugador3", 3);

    equipo.agregarJugador(jug1);
    equipo.agregarJugador(jug2);
    equipo.agregarJugador(jug3);

    System.out.println("Equipo: \n"+equipo);
    
    System.out.println("Eliminar a jugador 1");
    equipo.eliminarJugador(jug1);
    System.out.println("Equipo: \n"+equipo);
  }
}
