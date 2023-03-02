package org.example;

public class Coctel {
    private String Nombre;
    private Long Precio;

    public Coctel() {
    }

    public Coctel(String nombre, Long precio) {
        Nombre = nombre;
        Precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Long getPrecio() {
        return Precio;
    }

    public void setPrecio(Long precio) {
        Precio = precio;
    }


}
