package uam.apanloo.relaciones.agencia;

import java.util.GregorianCalendar;

public class App {
  public static void main(String[] args) {
    Nissan agenciaNissan = new Nissan();

    Cliente c1 =  new Cliente("Jorge", "Martinez", "Buenrostro", new GregorianCalendar(1996, 5, 9), "MABJ960509");
    agenciaNissan.agregarCliente(c1);

    System.out.println(agenciaNissan.consultarCliente("MABJ960509"));

    Automovil a1 =  new Automovil(Modelo.ALTIMA, Marca.NISSAN, "0x9182", Color.BLANCO, 2020);
    agenciaNissan.agregarAutomovil(a1);

    System.out.println(agenciaNissan.consultarAutomovil(Modelo.ALTIMA));

    agenciaNissan.eliminarAutomovil("0x9182");
    System.out.println(agenciaNissan.consultarAutomovil(Modelo.ALTIMA));
  }
}
