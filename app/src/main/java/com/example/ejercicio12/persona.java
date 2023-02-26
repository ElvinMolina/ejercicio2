package com.example.ejercicio12;

import java.io.Serializable;

public class persona implements Serializable {
    private String nombre,apellido,correo;
    private int edad;

    public persona(String nombre, String apellido, int edad, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }
}
