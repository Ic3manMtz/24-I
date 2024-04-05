public class Logicos {
  public static void main(String[] args) {
    boolean a,b;

    a=false;
    b=false;

    System.out.println("falso | falso = "+(a|b));
    System.out.println("falso & falso = "+(a&b));
    System.out.println("falso ^ falso = "+(a^b));

    b=true;
    System.out.println("\nfalso | verdadero = "+(a|b));
    System.out.println("falso & verdadero = "+(a&b));
    System.out.println("falso ^ verdadero = "+(a^b));

    a=true;
    b=false;
    System.out.println("\nverdadero | falso = "+(a|b));
    System.out.println("verdadero & falso = "+(a&b));
    System.out.println("verdadero ^ falso = "+(a^b));

    b=true;
    System.out.println("\nverdadero | verdadero = "+(a|b));
    System.out.println("verdadero & verdadero = "+(a&b));
    System.out.println("verdadero ^ verdadero = "+(a^b));

    System.out.println("\n!verdadero = "+(!a));
    a=false;
    System.out.println("!falso = "+(!a));

  }
}


