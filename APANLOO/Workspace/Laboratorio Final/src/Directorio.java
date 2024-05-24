import java.util.HashMap;
import java.util.Map;

public class Directorio {
  public static void main(String[] args) {
    //Crear un HashMap para el directorio telefónico
    HashMap<String, String> directorio=new HashMap<>();

    //Agregar entradas al directorio
    directorio.put("Alice", "123-456-7890");
    directorio.put("Bob", "987-654-3210");
    directorio.put("Charlie", "555-666-7777");

    //Buscar un número de teléfono
    String name="Alice";
    String number=directorio.get(name);
    if(number!=null)
      System.out.println("El número de teléfono de "+name+" es: "+number);
    else
      System.out.println("No se encontró una entrada para "+name);

    //Eliminar una entrada
    directorio.remove("Alice");

    //Mostrar todas las entradas restantes
    System.out.println("Entradas restantes en el directorio:");
    for(Map.Entry<String, String> entry : directorio.entrySet())
      System.out.println("Nombre: "+entry.getKey()+", Numero de teléfono: "+entry.getValue());
  }
}
