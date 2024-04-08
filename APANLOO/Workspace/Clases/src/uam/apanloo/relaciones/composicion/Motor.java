package uam.apanloo.relaciones.composicion;

public class Motor {
  private String serieMotor;

  public  Motor() {
  }

  public String getSerieMotor() {
    return this.serieMotor;
  }

  public void setSerieMotor(String serieMotor) {
    this.serieMotor = serieMotor;
  }

  public void arrancarMotor(){
    System.out.println("Arrancando motor....");
  }

  @Override
  public String toString() {
    return "Motor [Número de serie del motor =" + serieMotor + "]";
  }
}
