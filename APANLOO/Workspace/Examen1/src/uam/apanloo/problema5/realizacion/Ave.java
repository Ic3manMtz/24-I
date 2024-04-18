package uam.apanloo.problema5.realizacion;

public class Ave implements Volador{

  public Ave(){
  }
  
  @Override
  public void despegar() {
    System.out.println("El ave abre sus alas para empezar a volar");
  }

  @Override
  public void volar() {
    System.out.println("El ave aletea para poder volar");
  }

  @Override
  public void aterrizar() {
    System.out.println("El ave se acerca al suelo y guarda sus alas para aterrizar");
  }


}
