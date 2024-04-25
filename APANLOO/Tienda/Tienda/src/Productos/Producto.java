package Productos;

/**
 * Producto
 *
 * Autor: Arcos Martínez Gabriel
 */
public class Producto {
    private EProveedor proveedor;
    private String nombre;
    private double costo;
    private String codigo;
    private int stock;

    // #region constructors

    public Producto() {
        super();
    }

    public Producto(EProveedor proveedor, String nombre, double costo, String codigo) {
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.costo = costo;
        this.codigo = codigo;
        this.stock = 1;
    }

    public Producto(EProveedor proveedor, String nombre, double costo, String codigo, int stock) {
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.costo = costo;
        this.codigo = codigo;
        this.stock = stock;
    }
    // #endregion constructors
    
    //#region Getters y setters
    public EProveedor getProveedor() {
        return proveedor;
    }


    public void setProveedor(EProveedor proveedor) {
        this.proveedor = proveedor;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getCosto() {
        return costo;
    }


    public void setCosto(double costo) {
        this.costo = costo;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //#endregion Getters y setters


    @Override
    public String toString() {
        return "Producto [provedor=" + proveedor + ", nombre=" + nombre + ", costo=$" + costo + ", codigo=" + codigo
                + "]";
    }



}