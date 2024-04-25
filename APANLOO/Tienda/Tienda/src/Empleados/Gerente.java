package Empleados;
/* 
 * Autor: Alberto Aguilera Fragozo
*/

import java.util.List;
import java.util.HashMap;
import Productos.Producto;

public class Gerente extends Empleado {
    private String nombre;
    private double sueldo;
    public List<EmpleadoGeneral> empleados;

    // #region Acciones del Gerente
    public void contrataEmpleado(EmpleadoGeneral eg) {
        System.out.println("Se contrato a " + eg + " como Empleado");
    }

    public void contrataGerente(Gerente g) {
        System.out.println("Se contrato a " + g + " como Gerente");
    }
    // #endregion

    // #region Constructores
    public Gerente() {
        super();
    }

    public Gerente(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Gerente(String nombre, double sueldo, List<EmpleadoGeneral> empleados) {
        //super() ?,no necesariamente
        super();
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.empleados = empleados;
    }
    // endregion

    // #region Setters and Getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        this.sueldo = calcularSueldo();
        return sueldo;
    }
    // #endregion

    //#region Herenciametodos
    @Override
    protected double calcularSueldo() {
        double sueldoTotal = 0;
        for(EmpleadoGeneral emp : empleados) {
            sueldoTotal += emp.getProductosVendidos().size() * emp.getBPPV() * 2;
        }
        return sueldoTotal;
    }

    @Override
    public void generarReporte() {
        StringBuilder sb = new StringBuilder(); // Constructor de Strings
        sb.append("Reporte de ventas de Empleados: \n");
        for (EmpleadoGeneral emp : empleados) { //No necesario para caso de EMPLEADPGENERAL
            HashMap<Producto, Integer> ventasEmpleado = new HashMap<>();//Hashmap:Diccionario;llave
            sb.append(emp.nombre + "\t Producto \t Ganancia total\n");//Nombre empleado, producto, ganancia total
            for (Producto p : emp.getProductosVendidos()) {
                if (ventasEmpleado.containsKey(p)) { //Producto existe en Hashmap, añadira uno
                    ventasEmpleado.put(p, ventasEmpleado.get(p) + 1);
                } else {
                    ventasEmpleado.put(p, 1);
                }
            }
            for (HashMap.Entry<Producto, Integer> entrada : ventasEmpleado.entrySet()) { //Cada una de las entradas agarramos el Hashmap
                sb.append(entrada.getKey().getNombre() + "\t" + entrada.getKey().getCosto() * entrada.getValue() + "\n");//Opecion
            }
        }
        System.out.println(sb.toString());
    }
    // #endregion

    @Override
    public String toString() {
        return "Gerente[" + nombre + "]";
    }
    // Ahora si le puedes poner el override del calcularSalario
}
