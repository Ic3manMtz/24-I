package Tienda;

import Empleados.*;
import Productos.*;
import java.util.List;

/*
 * Tienda
 *
 * Autor: Gabriel Arcos Martínez
 */

public class Tienda<E> implements IGestorEmpleados<E>, IGestorProductos {
    private List<EmpleadoGeneral> empleados;
    private List<Gerente> gerentes;
    private List<Producto> productos;

    public Tienda() {
        super();
    }

    // #region Metodos IGestorEmpleados

    @Override
    public void agregarEmpleado(E empleado, Gerente gerente) {
        if (!(empleado instanceof EmpleadoGeneral) && !(empleado instanceof Gerente)) {
            return;
        }
        if (empleado instanceof Gerente) {
            gerente.contrataGerente((Gerente) empleado);
            gerentes.add((Gerente) empleado);
        }
        if (empleado instanceof EmpleadoGeneral) {
            gerente.contrataEmpleado((EmpleadoGeneral) empleado);
            empleados.add((EmpleadoGeneral) empleado);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E eliminarEmpleado(String no_empleado, Gerente gerente) {
        if (!empleadoExiste(no_empleado)) {
            return null;
        }

        for (EmpleadoGeneral e : empleados) {
            if (e.getNo_empleado().equals(no_empleado)) {
                gerente.empleados.remove(e);
                empleados.remove(e);
                return (E) e;
            }
        }

        for (Gerente g : gerentes) {
            if (g.getNo_empleado().equals(no_empleado)) {
                gerentes.remove(g);
                return (E) g;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E actualizarEmpleado(String no_empleado, E nuevo, Gerente gerente) {
        if (!empleadoExiste(no_empleado)) {
            return null;
        }
        for (EmpleadoGeneral e : empleados) {
            if (e.getNo_empleado().equals(no_empleado)) {
                e = (EmpleadoGeneral) nuevo;
                return (E) e;
            }
        }
        for (Gerente g : gerentes) {
            if (g.getNo_empleado().equals(no_empleado)) {
                g = (Gerente) nuevo;
                return (E) g;
            }
        }
        return null;
    }

    @Override
    public void consultarEmpleado(String no_empleado) {
        if (!empleadoExiste(no_empleado)) {
            return;
        }

        for (EmpleadoGeneral e : empleados) {
            if (e.getNo_empleado().equals(no_empleado)) {
                System.out.println(e);
            }
        }
        for (Gerente g : gerentes) {
            if (g.getNo_empleado().equals(no_empleado)) {
                System.out.println(g);
            }
        }
    }

    @Override
    public void pagarEmpleado(E empleado) {
        if (!empleadoExiste(empleado)) {
            return;
        }
        if (empleado instanceof Gerente) {
            ((Gerente) empleado).getSueldo();
        }
        if (empleado instanceof EmpleadoGeneral) {
            ((EmpleadoGeneral) empleado).getSueldo();
        }
    }

    @Override
    public void obtenerReporteDeVentas(E empleado) {
        if (!empleadoExiste(empleado)) {
            return;
        }
        if (empleado instanceof Gerente) {
            ((Gerente) empleado).generarReporte();
        }
        if (empleado instanceof EmpleadoGeneral) {
            ((EmpleadoGeneral) empleado).generarReporte();
        }
    }

    private boolean empleadoExiste(E empleado) {
        if (empleado instanceof EmpleadoGeneral) {
            return empleados.contains(empleado);
        }
        if (empleado instanceof Gerente) {
            return gerentes.contains(empleado);
        }
        return false;
    }

    private boolean empleadoExiste(String no_empleado) {
        for (EmpleadoGeneral e : empleados) {
            if (e.getNo_empleado().equals(no_empleado)) {
                return true;
            }
        }
        for (Gerente g : gerentes) {
            if (g.getNo_empleado().equals(no_empleado)) {
                return true;
            }
        }
        return false;
    }
    // #endregion

    // #region Metodos IGestorProductos

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto eliminaProducto(String producto) {
        if (!productoExiste(producto)) {
            return null;
        }
        for (Producto p : productos) {
            if (p.getCodigo().equals(producto)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Producto actualizaProducto(String codigo, Producto nuevo) {
        if (!productoExiste(codigo)) {
            return null;
        }
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                p = nuevo;
                return p;
            }
        }
        return null;
    }

    private boolean productoExiste(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void consultaProducto(String codigo) {
        if (!productoExiste(codigo)) {
            return;
        }
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void vendeProducto(String codigo, EmpleadoGeneral empleado) {
        if (!productoExiste(codigo)) {
            return;
        }
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                empleado.setProductosVendidos(p);
                p.setStock(p.getStock() - 1);
            }
        }
    }

    // #region Getters y Setters

    public List<EmpleadoGeneral> getEmpleados() {
        return empleados;
    }

    public List<Gerente> getGerentes() {
        return gerentes;
    }

    public int getEmpleadosCount() {
        return empleados.size();
    }

    public int getGerentesCount() {
        return gerentes.size();
    }
    // #endregion
}
