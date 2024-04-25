import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Tienda.*;
import Empleados.*;
import Productos.*;

@SuppressWarnings("rawtypes")
public class App {
    public static void main(String[] args) throws Exception {
        Tienda tienda = new Tienda();
        Gerente g = crearGerente(tienda);
        menuPrincipal(tienda, g);
    }

    @SuppressWarnings("resource")
    public static void menuPrincipal(Tienda tienda, Gerente g) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Empleados");
            System.out.println("2. Gerentes");
            System.out.println("3. Salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    menuEmpleados(tienda, crearEmpleado(tienda, g));
                    break;
                case 2:
                    menuGerentes(tienda, g);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    @SuppressWarnings({ "unchecked", "resource" })
    public static void menuEmpleados(Tienda tienda, EmpleadoGeneral empleado) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Vender producto");
            System.out.println("2. Obtener mi reporte de ventas");
            System.out.println("3. Checar entrada");
            System.out.println("4. Checar salida");
            System.out.println("5. Salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el codigo del producto: ");
                    tienda.vendeProducto(sc.nextLine(), empleado);
                    break;
                case 2:
                    tienda.obtenerReporteDeVentas(empleado);
                    break;
                case 3:
                    empleado.checarEntrada();
                    break;
                case 4:
                    empleado.checarSalida();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    @SuppressWarnings({ "unchecked", "resource" })
    public static void menuGerentes(Tienda tienda, Gerente g) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Crear un Empleado");
            System.out.println("2. Crear un Gerente");
            System.out.println("3. Obtener Empleados");
            System.out.println("4. Obtener Gerentes");
            System.out.println("5. Pagar a empleado");
            System.out.println("6. Pagar a gerente");
            System.out.println("7. Obtener reporte de ventas");
            System.out.println("8. Agregar producto");
            System.out.println("9. Actualizar producto");
            System.out.println("10. Salir");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    crearEmpleado(tienda, g);
                    break;
                case 2:
                    crearGerente(tienda);
                    break;
                case 3:
                    tienda.getEmpleados();
                    break;
                case 4:
                    tienda.getGerentes();
                    break;
                case 5:
                    tienda.pagarEmpleado(crearEmpleado(tienda, g));
                    break;
                case 6:
                    tienda.pagarEmpleado(g);
                    break;
                case 7:
                    tienda.obtenerReporteDeVentas(g);
                    break;
                case 8:
                    System.out.println("Ingrese el nombre del nuevo producto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el precio del nuevo producto");
                    double precio = sc.nextDouble();
                    System.out.println("Ingrese el stock del nuevo producto");
                    int stock = sc.nextInt();
                    System.out.println("Ingrese el codigo del nuevo producto");
                    String codigo = sc.nextLine();
                    EProveedor proveedor = seleccionarProveedor();
                    tienda.agregarProducto(new Producto(proveedor, nombre, precio, codigo, stock));
                    break;
                case 9:
                    System.out.println("Ingrese el codigo producto a actualizar");
                    codigo = sc.nextLine();
                    System.out.println("Ingrese el nuevo nombre del producto");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el nuevo precio del nuevo producto");
                    precio = sc.nextDouble();
                    System.out.println("Ingrese el nuevo stock del nuevo producto");
                    stock = sc.nextInt();
                    System.out.println("Ingrese el nuevo proveedor del nuevo producto");
                    proveedor = seleccionarProveedor();
                    tienda.actualizaProducto(codigo, new Producto(proveedor, nombre, precio, codigo, stock));
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }

    @SuppressWarnings({ "unchecked", "resource" })
    public static EmpleadoGeneral crearEmpleado(Tienda tienda, Gerente g) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el sueldo del empleado");
        double sueldo = sc.nextDouble();
        System.out.println("Ingrese el bono por producto vendido del empleado");
        double BPPV = sc.nextDouble();
        System.out.println("Ingrese el horario de entrada del empleado");
        String horaEntradaAux = sc.nextLine();
        System.out.println("Ingrese el horario de salida del empleado");
        String horaSalidaAux = sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaE = LocalTime.parse(horaEntradaAux, dtf);
        LocalTime horaS = LocalTime.parse(horaSalidaAux, dtf);
        Turno t = new Turno(horaE, horaS);
        EmpleadoGeneral e = new EmpleadoGeneral(nombre, sueldo, BPPV, t);
        tienda.agregarEmpleado(e, g);
        return e;
    }

    @SuppressWarnings({ "unchecked", "resource" })
    public static Gerente crearGerente(Tienda tienda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del gerente");
        String nombre = sc.nextLine();
        Gerente g = new Gerente(nombre);
        tienda.agregarEmpleado(g, g);
        return g;
    }

    @SuppressWarnings("resource")
    public static EProveedor seleccionarProveedor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. GAMESA");
        System.out.println("2. FEMSA");
        System.out.println("3. PEPSICO");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                return EProveedor.GAMESA;
            case 2:
                return EProveedor.FEMSA;
            case 3:
                return EProveedor.PEPSICO;
            default:
                return null;
        }
    }
}
