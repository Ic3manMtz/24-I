package uam.apanloo.relaciones.agregacion;

public class App {
  public static void main(String[] args) {
    Motor motor = new Motor("0x123456");
    Automovil coche = new Automovil("0x160123", "Corolla", 2016, motor);

    System.out.println(coche);
  }
}
