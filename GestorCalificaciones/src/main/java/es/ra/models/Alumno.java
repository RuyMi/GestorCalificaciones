package es.ra.models;

import java.time.LocalDateTime;

public class Alumno {
    private int contador = 0;
    private int id;
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private boolean isPerdida;
    private LocalDateTime fechaMatriculacion;
    private boolean isDisponible;

    public Alumno(String dni, String nombre, String apellidos, String email, String telefono) {
        this.id = ++contador;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.isPerdida = false;
        this.fechaMatriculacion = LocalDateTime.now();
        this.isDisponible = true;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isPerdida() {
        return isPerdida;
    }

    public void setPerdida(boolean perdida) {
        isPerdida = perdida;
    }

    public LocalDateTime getFechaMatriculacion() {
        return fechaMatriculacion;
    }


    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                ", id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", isPerdida=" + isPerdida +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", isDisponible=" + isDisponible +
                '}';
    }
}
