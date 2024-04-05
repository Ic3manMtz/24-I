import uam.apanloo.relaciones.asociacion.Automovil;
import uam.apanloo.relaciones.asociacion.TarjetaCirculacion;

public class App {
    public static void main(String[] args) throws Exception {
        Automovil automovil = new Automovil("1234", "Ferrari",2024 );
        TarjetaCirculacion tarjetaCirculacion = new TarjetaCirculacion(automovil);
        automovil.setTarjetaCirculacion(tarjetaCirculacion);
        
        System.out.println(automovil);
    }
}
