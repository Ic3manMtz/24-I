package uam.apanloo.problema5.asociacion;

public class App {
  public static void main(String[] args) {
    Persona persona = new Persona("Jorge");
    System.out.println("\nPersona con sus perros");
    System.out.println(persona);

    Perro olee =  new Perro("Olee");
    System.out.println("\nOlee");
    System.out.println(olee);

    persona.adoptarPerro(olee);
    System.out.println("\nPersona con sus perros");
    System.out.println(persona);

    Perro apa = new Perro("Apa");
    System.out.println("\nApa");
    System.out.println(apa);

    persona.adoptarPerro(apa);
    System.out.println("\nPersona con sus perros");
    System.out.println(persona);
  }
}
