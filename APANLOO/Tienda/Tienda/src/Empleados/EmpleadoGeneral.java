package Empleados;

import java.util.ArrayList;
import java.util.List;
import Productos.Producto;

/**
 * EmpleadoGeneral
 *
 * Autor: Joahan Andres Gonzalez Padron
 *
 */
public class EmpleadoGeneral extends Empleado {
    private double sueldo;
    private double BPPV;
    private List<Producto> productosVendidos;

    public EmpleadoGeneral(String nombre, double sueldo, double BPPV, Turno turno) {
        super();
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.productosVendidos = new ArrayList<>();
        this.BPPV = BPPV; // Bono por producto vendido
        this.turno = turno;
    }

    public void vender(Producto producto) {
        System.out.println("Realizando una venta..." + producto);
        this.productosVendidos.add(producto);
    }

    @Override
    protected double calcularSueldo() {
        double sueldoTotal = sueldo;
        sueldoTotal += BPPV * productosVendidos.size();
        return sueldoTotal;
    }

    @Override
    public void generarReporte() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reporte de ventas: \n");
        sb.append(nombre).append("\t Producto \t Ganancia Total\n");
        for (Producto p : productosVendidos) {
            sb.append("\t\t").append(p.getNombre()).append("\t\t").append(p.getCosto()).append("\n");
        }
        System.out.println(sb.toString());
    }

    //#region Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBPPV() {
        return BPPV;
    }

    public void setBPPV(double BPPV) {
        this.BPPV = BPPV;
    }

    public double getSueldo() {
        this.sueldo = calcularSueldo();
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(Producto productosVendido) {
        this.productosVendidos.add(productosVendido);
    }

    public void setProductosVendidos(List<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    //#endregion

}
