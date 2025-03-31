package com.empresa.model;

import java.util.UUID;

public class Habitacion {
    public String idHabitacion;
    public Tipo tipo;
    double precio;
    public Estado estado;
    public String descripcion;

    //prueba para enseñar a alvaro

    public Habitacion(Tipo tipo, double precio, Estado estado, String descripcion) {
        this.idHabitacion = UUID.randomUUID().toString();
        this.tipo = tipo;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
    }
}
