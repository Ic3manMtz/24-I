package uam.apanloo.tablahash;

public class TablaHash<K, V> {
  private static float FACTOR_CARGA_UNBRAL=(float)0.75;
  private static class EntradaHash<K, V>{
    final K clave;
    V valor;

    EntradaHash(K clave, V valor){
      this.clave=clave;
      this.valor=valor;
    }
  }

  private EntradaHash<K, V>[] tabla;
  private int capacidad;
  private int tam;

  @SuppressWarnings("unchecked")
  public TablaHash(int capacidad){
    this.capacidad=capacidad;
    this.tabla=new EntradaHash[capacidad];
    this.tam=0;
  }

  public TablaHash(){
    this(10);
  }

  private int hash(K clave){
    return Math.abs(clave.hashCode())%capacidad;
  }

  public void put(K clave, V valor){
    //Comprobar si se necesita redimensionar la tabla
    if(necesitaRedimensionar()){
      redimensionar();
    }

    int index = hash(clave);

    while(tabla[index]!=null && !tabla[index].clave.equals(clave)){
      index=(index+1)%capacidad;
    }

    tabla[index]=new EntradaHash<>(clave, valor);
    tam++;
  }

  private boolean necesitaRedimensionar(){
    //Calcula si el tamaño actual excede el umbral basado en el factor de carga
    float factorCarga=tam/(float)capacidad;
    return factorCarga>FACTOR_CARGA_UNBRAL;
  }

  @SuppressWarnings("unchecked")
  private void redimensionar(){
    //Incrementa la capacidad, por ejemplo, duplicandola
    capacidad*=2;
    EntradaHash<K,V>[] nuevaTabla=new EntradaHash[capacidad];

    //Rehash de todos los elementos existentes a la nueva tabla
    for(int i=0; i<tabla.length; i++){
      if(tabla[i]!=null){
        K claveExistente=tabla[i].clave;
        V valorExistente=tabla[i].valor;
        nuevaTabla[hash(claveExistente)]=new EntradaHash<>(claveExistente, valorExistente);
      }
    }

    tabla=nuevaTabla;
  }

  public V get(K clave){
    int index=hash(clave);

    while(tabla[index]!=null){
      if(tabla[index].clave.equals(clave))
        return tabla[index].valor;

      index=(index+1)%capacidad;
    }

    return null;
  }

  public int getTam(){
    return tam;
  }
}
