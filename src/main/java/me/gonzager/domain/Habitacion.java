package me.gonzager.domain;

public class Habitacion {

    private Boolean luzEncendida;
    private final Integer metrosCuadrados;

    public Habitacion( Boolean luzEncendida, Integer metrosCuadrados) {
        this.luzEncendida = luzEncendida;
        this.metrosCuadrados = metrosCuadrados;
    }

    public Boolean getLuzEncendida() {
        return luzEncendida;
    }

    public Integer getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setLuzEncendida(Boolean luzEncendida) {
        this.luzEncendida = luzEncendida;
    }

}
