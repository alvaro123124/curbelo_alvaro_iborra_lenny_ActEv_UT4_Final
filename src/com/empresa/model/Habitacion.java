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

    public void reservar() {
        if (this.estado == Estado.DISPONIBLE) {
            this.estado = Estado.RESERVADO;
        } else {
            System.out.println("La habitación " + this.idHabitacion + " está " + this.estado);
        }
    }

    public void ocupar() {
        if (this.estado == Estado.RESERVADO) {
            this.estado = Estado.OCUPADO;
        } else {
            System.out.println("La habitación " + this.idHabitacion + " está " + this.estado);
        }
    }

    public void liberar() {
        if (this.estado == Estado.OCUPADO) {
            this.estado = Estado.DISPONIBLE;
        } else {
            System.out.println("La habitación " + this.idHabitacion + " está " + this.estado);
        }
    }


}
