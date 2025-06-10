package me.gonzager.domain;

public class Habitacion {

    private String nombre;
    private Boolean luzEncendida;
    private Integer metrosCuadrados;

    public Habitacion(String nombre, Boolean luzEncendida, Integer metrosCuadrados) {
        this.nombre = nombre;
        this.luzEncendida = luzEncendida;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean getLuzEncendida() {
        return luzEncendida;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void encederLuz() {
        this.luzEncendida = true;
    }

    public void apagarLuz() {
        this.luzEncendida = false;
    }
}
