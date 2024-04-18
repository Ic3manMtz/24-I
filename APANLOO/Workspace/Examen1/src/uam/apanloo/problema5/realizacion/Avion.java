package uam.apanloo.problema5.realizacion;

public class Avion implements Volador{

  public Avion(){
  }

  @Override
  public void despegar() {
    System.out.println("El avión prende sus motores para empezar el despegue");
  }

  @Override
  public void volar() {
    System.out.println("El avión fija curso hacía el destino y se eleva a 10,000 pies de altura");
  }

  @Override
  public void aterrizar() {
    System.out.println("El avión apaga los motores y se alinea con la pista para aterrizar");
  }

}
