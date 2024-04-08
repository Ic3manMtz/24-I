package uam.apanloo.relaciones.composicion;

public class App {
  public static void main(String[] args) {
    Automovil automovil = new Automovil("0x01928384", "Sport", 2020);
    automovil.getMotor().arrancarMotor();
  }
}
