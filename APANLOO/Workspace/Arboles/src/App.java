import java.util.Stack;
import edatos.nolineales.arboles.binario.ArbolBinario;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<ArbolBinario<Integer>> pila = new Stack<ArbolBinario<Integer>>();
/*
        ArbolBinario<Integer> izq = new ArbolBinario<Integer>(2);
        ArbolBinario<Integer> der = new ArbolBinario<Integer>(4);
        ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(izq, der, 3);
        pila.push(raiz);

        izq = new ArbolBinario<Integer>(6);
        der = new ArbolBinario<Integer>(9);
        raiz = new ArbolBinario<Integer>(izq, der, 9);
        pila.push(raiz);

        izq = new ArbolBinario<Integer>(3);
        der = new ArbolBinario<Integer>(2);
        raiz = new ArbolBinario<Integer>(izq, der, 8);
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(5);
        raiz.setIzq(pila.pop());
        raiz.setDer(pila.pop());

        raiz.mostrarArbol(raiz);
*/
        ArbolBinario<Integer> izq = new ArbolBinario<Integer>(31);
        ArbolBinario<Integer> der = new ArbolBinario<Integer>(33);
        ArbolBinario<Integer> raiz = new ArbolBinario<Integer>(izq, der, 32);
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(35);
        raiz.setIzq(pila.pop());
        raiz.setDer(new ArbolBinario<Integer>(40));
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(10);
        raiz.setIzq(new ArbolBinario<Integer>(8));
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(30);
        raiz.setIzq(pila.pop());
        raiz.setDer(pila.pop());
        pila.push(raiz);

        izq = new ArbolBinario<Integer>(160);
        der = new ArbolBinario<Integer>(250);
        raiz = new ArbolBinario<Integer>(izq, der, 200);
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(150);
        raiz.setDer(pila.pop());
        pila.push(raiz);

        raiz = new ArbolBinario<Integer>(90);
        raiz.setDer(pila.pop());
        raiz.setIzq(pila.pop());

        raiz.mostrarArbol(raiz);
    }
}


