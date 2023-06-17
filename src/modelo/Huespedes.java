package modelo;

import java.util.Date;

public class Huespedes {
    private Integer id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String telefono;
    private Integer idReserva;
    
    // Constructor without ID
    public Huespedes(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono, Integer idReserva) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }
    
    // Constructor with ID
    public Huespedes(Integer id, String nombre, String apellido, Date fechaNacimiento, String nacionalidad, String telefono, Integer idReserva) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.idReserva = idReserva;
    }
    
    // Getters and Setters (not shown in the provided code)
}

	