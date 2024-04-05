package uam.apanloo.relaciones.agregacion;

public class Motor {
  private String serieMotor;

  public  Motor(String serie) {
    this.serieMotor = serie;
  }

  public String getSerieMotor() {
    return this.serieMotor;
  }

  public void setSerieMotor(String serieMotor) {
    this.serieMotor = serieMotor;
  }

  @Override
  public String toString() {
    return "Motor [Número de serie del motor =" + serieMotor + "]";
  }
}
