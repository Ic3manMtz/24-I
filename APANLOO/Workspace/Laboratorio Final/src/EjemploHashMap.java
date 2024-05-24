import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
  public static void main(String[] args) {
    Map<String, String> map=new HashMap<String, String>();

    map.put("One", "1");
    map.put("Two", "2");
    map.put("Three", "3");

    System.out.println("Iterating over HashMap:");
    for(Map.Entry<String, String> entry : map.entrySet())
      System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());

  }
}
