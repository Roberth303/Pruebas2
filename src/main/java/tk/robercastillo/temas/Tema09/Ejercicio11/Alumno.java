package tk.robercastillo.temas.Tema09.Ejercicio11;

import java.util.GregorianCalendar;

public class Alumno {

    private int nia;
    private String nombre;
    private String apellido;
    private GregorianCalendar nacimiento;
    private String grupo;
    private int telefono;

    public Alumno(int nia, String nombre, String apellido, GregorianCalendar nacimiento, String grupo, int telefono) {
        this.nia=nia;
        this.nombre=nombre;
        this.apellido=apellido;
        this.nacimiento=nacimiento;
        this.grupo=grupo;
        this.telefono=telefono;
    }
}
