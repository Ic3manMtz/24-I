package uam.apanloo.tablahash;

public class App {
  public static void main(String[] args) {
    TablaHash<Integer, String> th=new TablaHash<Integer, String>();

    th.put(1, "Hola");
    th.put(2, "Mundo");
    th.put(3, "Test1");

    System.out.println(th.get(1));
    System.out.println(th.get(2));
    System.out.println(th.get(3));
  }
}
