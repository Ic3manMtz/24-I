package uam.apanloo.problema1;

public class Recursividad {
  public Recursividad(){
  }

  public int mcd(int a, int b){
    if (a%b == 0)
      return b;
    else
      return mcd(b, a % b);
  }
}
