package uam.apanloo.relaciones.agregacion;

public class App {
  public static void main(String[] args) {
    Motor motor = new Motor("0x123456");
    Automovil coche = new Automovil("0x96852", "Rio", Marca.KIA, 2020, motor);

    System.out.println(coche);
  }
}
