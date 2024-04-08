package uam.apanloo.relaciones.dependencia;

public class App {
  public static void main(String[] args) {
    Conductor conductor =  new Conductor("9596", "Jorge");
    Automovil camion = new Automovil("0x89493", "Torton",2000);

    camion.asignarConductor(conductor);

    
    System.out.print("El conductor del camión se llama "+camion.getConductor().getNombre());
  }
}
