package Empleados;

/**
 * GestorEmpleados
 *
 * Autor: Ángel Eduardo Hernández Martínez
 */
public interface IGestorEmpleados<E> {
    public void agregarEmpleado(E empleado, Gerente gerente);

    public E eliminarEmpleado(String no_empleado, Gerente gerente);

    public E actualizarEmpleado(String no_empleado, E nuevo, Gerente gerente);

    public void consultarEmpleado(String no_empleado);

    public void pagarEmpleado(E empleado);

    public void obtenerReporteDeVentas(E empleado);
}