package practicas.ed.lineales;


public class ArrayList<E> implements Lista<E>{
  private static final int MAX=5;
  private int indice=0;
  private Object[] datos=null;

  public ArrayList() {
    this(MAX);
  }

  public ArrayList(int tam) {
    if(tam<0){
      throw new IllegalArgumentException();
    }
    datos = new Object[tam];
  }

  private void asegurarGC(){
    for(int i=0;i<datos.length;i++){
    datos[i]=null;
    }
  }

  @Override
  public void agregar(E e) {
    Object[] aux=null;

    if(indice==datos.length){
      aux = new Object[datos.length+datos.length/2];
      System.arraycopy(datos,0,aux,0,datos.length);
      //DEBEMOS ELIMINAR TODAS LAS REFERENCIAS...DEJAR LOS OBJETOS EN EL "LIMBO"
      asegurarGC();
      datos = aux;
    }
    datos[indice] = e;
    indice++;
  }

  @Override
  public void agregarInicio(E e) {
    agregarPosicion(e, 0);
  }

  @Override
  public void agregarFinal(E e) {
    agregar(e);//Lo mismo que agregar al final
  }

  @Override
  public void agregarPosicion(E e, int posicion) {
    Object[] aux = null;
    if (posicion >= 0 && posicion<=indice){
      if(posicion==indice){
        agregar(e);
      }else{
        if(indice==datos.length){
          aux = new Object[datos.length+datos.length/2];
          System.arraycopy(datos,0,aux,0,datos.length);
          asegurarGC();
          datos = aux;
        }
        System.arraycopy(datos,posicion,datos,posicion+1,indice-posicion);
        datos[posicion]=e;
        indice++;
      }
    } 
  }

  @SuppressWarnings("unchecked")
  @Override
  public E eliminar() {
    E elemento = null;
    if(indice > 0){
      indice--;
      elemento = (E)datos[indice];
      datos[indice] = null;
    }else{
      throw new  IndexOutOfBoundsException("No hay elementos para eliminar");
    }

    return elemento;
  }

  @Override
  public E eliminarElementoInicio() {
    return eliminarElementoPosicion(0);
  }

  @Override
  public E eliminarElementoFinal() {
    return eliminar();
  }

  @SuppressWarnings("unchecked")
  @Override
  public E eliminarElementoPosicion(int posicion) {
    E elemento = null;
    if (posicion >= 0 && posicion < indice) {
        elemento = (E) datos[posicion];
        Object[] aux = new Object[datos.length - 1];

        // Copiar los elementos antes de la posición eliminada al arreglo auxiliar
        System.arraycopy(datos, 0, aux, 0, posicion);

        // Copiar los elementos después de la posición eliminada al arreglo auxiliar
        System.arraycopy(datos, posicion + 1, aux, posicion, indice - posicion - 1);

        datos = aux;
        indice--; 
    }
    return elemento;
  }

  @Override
  public boolean esVacia() {
    return indice==0;
  }

  @Override
  public int numElementos() {
    return indice;
  }

  @Override
  public void limpiarLista() {
    asegurarGC();
    datos = new Object[MAX];
    indice = 0;
  }

  @SuppressWarnings("unchecked")
  @Override
  public E[] convertirArreglo() {
    E[] arregloE = (E[]) new Object[indice];
    System.arraycopy(datos, 0, arregloE, 0, indice);

    return arregloE; 
  }

  @SuppressWarnings("unchecked")
  @Override
  public E consultar(int posicion) {
    if(!(posicion<0 || posicion >= numElementos())){
      return (E)datos[posicion];
    }else{
      throw new IndexOutOfBoundsException("No existe esa posición");
    }
  }
}
