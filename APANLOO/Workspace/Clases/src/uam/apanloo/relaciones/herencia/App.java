package uam.apanloo.relaciones.herencia;

import java.util.LinkedList;

public class App {
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    @SuppressWarnings("rawtypes")
    LinkedList listaTransportes = new LinkedList<>();

    TransporteTerrestre bicicleta = new TransporteTerrestre();
    Automovil camioneta = new Automovil();
    TransporteTerrestre motocicleta = new TransporteTerrestre();
    Automovil coche = new Automovil();

    System.out.print("Coche ");
    coche.avanzar();

    listaTransportes.add(bicicleta);
    listaTransportes.add(camioneta);
    listaTransportes.add(motocicleta);
    listaTransportes.add(coche);

    System.out.print("\nBicicleta ");
    bicicleta.avanzar();
  }
}
