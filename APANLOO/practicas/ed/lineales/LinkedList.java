package practicas.ed.lineales;

public class LinkedList<E> implements Lista<E>{
  @SuppressWarnings("hiding")
  private class Nodo<E>{
    private Nodo <E> siguiente;
    private E info;

    public Nodo(E info){
      this.siguiente = null;
      this.info = info;
    }
  }

  private Nodo<E> primero, ultimo;
  private int tam;
  
  public LinkedList() {
    this.primero = null;
    this.ultimo = null;
    tam=0;
  }

  @Override
  public void agregar(E e) {
    Nodo<E> nuevo = new Nodo<>(e);

    if(esVacia()){
      primero = nuevo;
    }else{
      ultimo.siguiente = nuevo;
    }

    ultimo = nuevo;
    tam++;
  }

  @Override
  public void agregarInicio(E e) {
    Nodo<E> nuevo = new Nodo<>(e);

    if(esVacia()){
      ultimo = nuevo;
    }else{
      nuevo.siguiente = primero;
    }

    primero = nuevo;
    tam++;
  }

  @Override
  public void agregarFinal(E e) {
    agregar(e);
  }

  @Override
  public void agregarPosicion(E e, int posicion) {
    if(!(posicion>=0 && posicion<=tam)){
      throw new IndexOutOfBoundsException("La posición no existe en la lista");
    }

    if(posicion==0){
      agregarInicio(e);
      return;
    }

    if(posicion==tam){
      agregarFinal(e);
      return;
    }

    Nodo<E> nuevo = new Nodo<>(e);
    Nodo<E> actual = primero;
    for(int i=0; i<posicion-1; i++)
      actual = actual.siguiente;
    
    nuevo.siguiente  = actual.siguiente;
    actual.siguiente = nuevo;
    tam++;
  }

  @Override
  public E eliminar() {
    if(esVacia()){
      throw new NullPointerException("Lista está vacía");
    }

    if(primero.siguiente == null){
      primero = null;
    }else{
      Nodo<E> actual = primero;
      while (actual.siguiente.siguiente != null){
        actual = actual.siguiente;
      }

      actual.siguiente = null;
      ultimo = actual;  
      tam--;
      return actual.info;
    }
    return null;
  }

  @Override
  public E eliminarElementoInicio() {
    if(esVacia()){
      throw new NullPointerException("Lista está vacía");
    }

    E elemento = primero.info;

    if (primero.siguiente != null) {
      primero = primero.siguiente;
    } else {
      primero = null;
      ultimo = null;
    }
    
    tam--;
    return elemento;
  }

  @Override
  public E eliminarElementoFinal() {
    return eliminar();
  }

  @Override
  public E eliminarElementoPosicion(int posicion) {
    if(posicion<0 || posicion>=tam){
      throw new IndexOutOfBoundsException("No existe esa posición en la lista");
    }

    if(esVacia()){
      throw new NullPointerException("Lista está vacía");
    }

    if(posicion==0){
      return eliminarElementoInicio();
    }

    if(posicion==tam-1){
      return eliminar();
    }

    Nodo<E> actual = primero;
      for (int i = 0; i < posicion - 1; i++) {
        actual = actual.siguiente;
      }

    E elemento = actual.siguiente.info;

    if (actual.siguiente.siguiente != null) {
        actual.siguiente = actual.siguiente.siguiente;
    } else {
        ultimo = actual;
        actual.siguiente = null;
    }

    tam--;
    return elemento;
  }

  @Override
  public boolean esVacia() {
    return this.tam == 0;
  }

  @Override
  public int numElementos() {
    return this.tam;
  }

  @Override
  public void limpiarLista() {

    if(esVacia()){
      throw new NullPointerException("Lista está vacía");
    }

    while(!esVacia()){
      eliminarElementoInicio();
    } 

    this.primero = null;
    this.ultimo = null;
    tam=0;


  }

  @Override
  @SuppressWarnings("unchecked")
  public E[] convertirArreglo() {
    if(esVacia()){
      throw new IndexOutOfBoundsException("Lista está vacía");
    }
    E[] arreglo = (E[])(new Object[this.numElementos()]);
    Nodo<E> auxiliar = this.primero;
    for (int i = 0; i < this.numElementos(); i++){
      arreglo[i] = auxiliar.info;
      auxiliar = auxiliar.siguiente;
    }
    return arreglo;
  }

  @Override
  public E consultar(int posicion) {
    if(posicion<0 || posicion>=tam){
      throw new IndexOutOfBoundsException("No existe esa posición en la lista");
    }

    Nodo<E> actual = primero;
    int i = 0;

    while(i!=posicion && actual!=null){
      actual = actual.siguiente;
      i++;
    }

    return actual.info;
  }
  
}
