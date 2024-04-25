package Productos;

import Empleados.EmpleadoGeneral;

/**
 * GestorProductos
 *
 * Autor: Ángel Eduardo Hernández Martínez
 */
public interface IGestorProductos {
    public void agregarProducto(Producto producto);

    public Producto eliminaProducto(String codigo);

    public Producto actualizaProducto(String codigo, Producto nuevo);

    public void consultaProducto(String codigo);

    public void vendeProducto(String codigo, EmpleadoGeneral empleado);

}