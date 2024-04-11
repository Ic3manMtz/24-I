package uam.apanloo.relaciones.agencia;

import java.util.GregorianCalendar;

public class Cliente {
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private GregorianCalendar fechaNacimiento;
  private String curp;
  
  public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, GregorianCalendar fechaNacimiento,
      String curp) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.fechaNacimiento = fechaNacimiento;
    this.curp = curp;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public GregorianCalendar getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String getCurp() {
    return curp;
  }

  public void setCurp(String curp) {
    this.curp = curp;
  }

  @SuppressWarnings("static-access")
  @Override
  public String toString() {
    return "Cliente [nombre="+nombre+", apellidoPaterno="+apellidoPaterno+", apellidoMaterno="+apellidoMaterno+
  ", fechaNacimiento= "+fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH)+"/"
  +fechaNacimiento.get(GregorianCalendar.MONTH)+"/"+fechaNacimiento.get(GregorianCalendar.YEAR)+", curp=" + curp + "]";
  }
}
