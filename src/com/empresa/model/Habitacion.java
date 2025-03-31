package com.empresa.model;

public class Habitacion {
    public int idHabitacion;
    public Tipo tipo;
    double precio;
    public Estado estado;
    public String descripcion;







    

    public Habitacion(int idHabitacion, Tipo tipo, double precio, Estado estado, String descripcion) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
    }
}
