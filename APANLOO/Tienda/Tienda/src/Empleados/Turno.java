package Empleados;
/**
 * Empleados
 *
 * Autor: Omar Samuel Hernandez Acosta
 */
import java.time.LocalTime; //Paquete para manejar horas


public class Turno {
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Turno(LocalTime horaEntrada, LocalTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    //#region Getters y setters 
    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    //#endregion
}