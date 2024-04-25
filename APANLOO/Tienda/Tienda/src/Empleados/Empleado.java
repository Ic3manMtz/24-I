package Empleados;

/**
 * Empleado
 *
 * Autor: Omar Samuel Hernandez Acosta
 */
import java.time.LocalTime;

public abstract class Empleado {
    protected String no_empleado;
    protected Turno turno;
    protected double sueldo;
    protected String nombre;

    /**
     * Checa la hora de entrada del empleado y compara con la hora de salida y
     * la hora de entrada establecida para el turno. Si la hora de entrada es
     * anterior a la hora de salida, se imprime un mensaje indicando que se ha
     * retirado 1 hora antes de la hora de salida. Si la hora de entrada es
     * posterior a la hora de entrada, se imprime un mensaje indicando que se
     * ha retirado 1 hora después de la hora de entrada.
     */
    public void checarEntrada() {
        LocalTime horaRegistro = LocalTime.now(); // Guarda la hora actual
        System.out.println("Hora de entrada: " + horaRegistro.toString()); // Imprime la hora actual
        if (horaRegistro.isBefore(this.turno.getHoraEntrada())) { // Verifica si la hora actual es anterior a la hora de
                                                                  // entrada
            System.out.println("El usuario ha llegado temprano."); // Imprime un mensaje de que ha llegado
        } else if (horaRegistro.isAfter(this.turno.getHoraEntrada())) { // Verifica si la hora actual es posterior a la
                                                                        // hora de entrada
            System.out.println("El usuario ha llegado tarde"); // Imprime un mensaje de que llego tarde
        }
    }

    /**
     * Checa la hora de salida del empleado y compara con la hora de salida y
     * la hora de entrada establecida para el turno. Si la hora de salida es
     * anterior a la hora de salida, se imprime un mensaje indicando que se ha
     * salido temprano. Si la hora de salida es posterior a la hora de salida,
     * se imprime un mensaje indicando que se ha salido tarde.
     */
    public void checarSalida() {

        LocalTime horaSalida = LocalTime.now(); // Guarda la hora actual
        System.out.println("Hora de Salida: " + horaSalida.toString()); // Imprime la hora actual
        if (horaSalida.isBefore(this.turno.getHoraSalida())) { // Verifica si la hora actual es ANTES a la hora de
                                                               // salida
            System.out.println("El usuario ha salido temprano"); // Imprime un mensaje de que ha salido temprano
        } else if (horaSalida.isAfter(this.turno.getHoraSalida())) { // Verifica si la hora actual es DESPUES a la hora
                                                                     // de salida
            System.out.println("El usuario ha salido tarde"); // Imprime un mensaje de que salio DESPUES de la hora de
                                                              // salida
        }

    }

    protected abstract double calcularSueldo();

    public abstract void generarReporte();

    // #region Getters y Setters
    public String getNo_empleado() {
        return no_empleado;
    }

    public void setNo_empleado(String no_empleado) {
        this.no_empleado = no_empleado;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}