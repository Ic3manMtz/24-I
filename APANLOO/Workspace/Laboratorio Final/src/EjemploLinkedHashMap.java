import java.util.LinkedHashMap;
import java.util.Map;

public class EjemploLinkedHashMap {
  public static void main(String[] args) {
    Map<String, String> map=new LinkedHashMap<>();

    map.put("One", "1");
    map.put("Two", "2");
    map.put("Three", "3");

    System.out.println("Iterating over HashMap:");
    for(Map.Entry<String, String> entry : map.entrySet())
      System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());

  }
}
