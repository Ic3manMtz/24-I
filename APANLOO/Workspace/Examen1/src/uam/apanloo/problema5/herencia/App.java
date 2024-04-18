package uam.apanloo.problema5.herencia;

public class App {
  public static void main(String[] args) {
    Coche coche = new Coche(4);
    Bicicleta bicicleta =  new Bicicleta(2);

    System.out.print("El coche está ");
    coche.avanzar();

    System.out.print("La bicicleta está ");
    bicicleta.avanzar();

    System.out.print("El coche está ");
    coche.detenerse();

    System.out.print("La bicicleta está ");
    bicicleta.detenerse();
  }
}
