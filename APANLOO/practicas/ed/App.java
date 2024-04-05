package practicas.ed;
import practicas.ed.lineales.ArrayList;
import practicas.ed.lineales.LinkedList;

@SuppressWarnings("unchecked")
public class App {
  public static <E> void main(String[] args){
    System.out.println("Programa de listas!");
    /*
    ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.agregar(1);
    l1.agregar(2);
    l1.agregar(3);
    l1.agregarInicio(10);
    
    E[] arreglo = (E[]) l1.convertirArreglo();

    for (E e : arreglo) {
      System.out.println(e);
    }
    */
    LinkedList<Integer> l2 = new LinkedList<Integer>();

    l2.agregar(0);
    l2.agregar(1);
    l2.agregar(2);
    l2.agregar(3);

    E[] arreglo = (E[]) l2.convertirArreglo();

    for (E e : arreglo) {
      System.out.println(e);
    }

    l2.agregarPosicion(169, 2);
    arreglo = (E[]) l2.convertirArreglo() ;

    
    for (E e : arreglo) {
      System.out.println(e);
    }
  }
}