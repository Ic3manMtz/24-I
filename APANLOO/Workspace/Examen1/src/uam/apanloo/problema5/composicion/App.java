package uam.apanloo.problema5.composicion;

public class App {
  public static void main(String[] args) {
    Casa casa = new Casa("Direccion de la casa");
    casa.crearHabitacion("recamara");
    casa.crearHabitacion("sala");
    casa.crearHabitacion("cocina");
    casa.crearHabitacion("baño");

    System.out.println("Características de la casa\n"+casa);
  }
}
