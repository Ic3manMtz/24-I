import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {
  public static void main(String[] args) {
    //Crear un HashMap
    HashMap<String, Integer> map=new HashMap<>();

    //Agregar elementos al HashMap
    map.put("Uno", 1);
    map.put("Dos", 2);
    map.put("Tres", 3);
    map.put("Cuatro", 4);

    //Acceder a un elemento del HashMap
    int value=map.get("Dos");
    System.out.println("El valor asociado con la clave 'Dos' es: "+value);

    //Recorrer el HashMap
    System.out.println("Elementos en el HashMap");
    for(Map.Entry<String, Integer> entry : map.entrySet()){
      System.out.println("Clave: "+entry.getKey()+", Valor: "+entry.getValue());
    }

    //Comprobar si una clave existe en el HashMap
    if(map.containsKey("Tres"))
      System.out.println("El HashMap contiene la clave 'Tres'");

    //Eliminar un elemento del HashMap
    map.remove("Uno");
    System.out.println("El HashMap después de eliminar la clave 'Uno': "+map);

    //Obtener el tamaño del HashMap
    int size=map.size();
    System.out.println("El tamaño del HashMap es: "+size);
  }
}
