package edatos.nolineales.arboles.binario;

public class ArbolBinario<E> {
  private ArbolBinario<E> izq=null;
  private ArbolBinario<E> der=null;
  private E info=null;

  public ArbolBinario(E info){
    super();
    this.info = info;
  }

  public ArbolBinario(ArbolBinario<E> izq, ArbolBinario<E> der, E info){
    super();
    this.izq = izq;
    this.der = der;
    this.info = info;
  }

  public ArbolBinario<E> getIzq() {
    return izq;
  }

  public void setIzq(ArbolBinario<E> izq) {
    this.izq = izq;
  }

  public ArbolBinario<E> getDer() {
    return der;
  }

  public void setDer(ArbolBinario<E> der) {
    this.der = der;
  }

  public E getInfo() {
    return info;
  }

  public void setInfo(E info) {
    this.info = info;
  }

  public void mostrarArbol(ArbolBinario<E> nodo){
    mostrarArbol(nodo, 0);
  }

  private void mostrarArbol(ArbolBinario<E> nodo, int nivel){
    if(nodo == null)
      return;

    mostrarArbol(nodo.getDer(), nivel+1);
    System.out.println(" ".repeat(nivel*2)+nodo.getInfo());
    mostrarArbol(nodo.getIzq(), nivel+1);
  }

  @Override
  public String toString(){
    return ""+info;
  }

}
