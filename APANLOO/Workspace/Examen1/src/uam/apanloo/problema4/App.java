package uam.apanloo.problema4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static boolean buscarAutomovil(List<Automovil> lista, Automovil auto){
    for (Automovil automovil : lista) {
      if(automovil.compareTo(auto) == 0){
        return true;
      }
    }

    return false;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Automovil> listaAutomoviles = new LinkedList<>();

    Automovil buscado = new Automovil();
    System.out.print("Escribe la marca de tu automovil...");
    String marca =  sc.nextLine();

    System.out.print("Escribe la serie de tu automovil...");
    String serie = sc.nextLine();

    buscado.setMarca(marca);
    buscado.setSerie(serie);

    listaAutomoviles.add(new Automovil("Audi", "0x1123123"));
    listaAutomoviles.add(new Automovil("Mazda", "0x983123"));
    listaAutomoviles.add(new Automovil("Ford", "0x6938123"));
    listaAutomoviles.add(new Automovil("Masserati", "0x7612833"));
    listaAutomoviles.add(new Automovil("Ferrari", "0x8123973"));
    listaAutomoviles.add(new Automovil("Audi", "0x231233"));
    listaAutomoviles.add(buscado);
  
    if(buscarAutomovil(listaAutomoviles, buscado))
      System.out.println("\nEl automovil se encuentra en la lista.");
    else
      System.out.println("\nNo se ha encontrado el automovil en la lista.");
    
    sc.close();
  }
}
