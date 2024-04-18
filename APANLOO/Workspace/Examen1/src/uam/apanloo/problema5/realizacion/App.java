package uam.apanloo.problema5.realizacion;

public class App {
  public static void main(String[] args) {
    Ave ave =  new Ave();

    ave.despegar();
    ave.volar();
    ave.aterrizar();

    System.out.println();
    Avion avion = new Avion();

    avion.despegar();
    avion.volar();
    avion.aterrizar();
  }
}
