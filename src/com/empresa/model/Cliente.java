package com.empresa.model;

import java.util.UUID;

public class Cliente {
<<<<<<< Updated upstream
    String idCliente;
    String nombre;

    Cliente(String nombre) {
        this.idCliente = UUID.randomUUID().toString();
        this.nombre = nombre;
    }

=======
    String id;
    String nombre;
    

    public Cliente(String nombre) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
    }
>>>>>>> Stashed changes
}

