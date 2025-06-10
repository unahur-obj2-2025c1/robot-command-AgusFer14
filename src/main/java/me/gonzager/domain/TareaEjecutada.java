package me.gonzager.domain;

public class TareaEjecutada {

    private String descripcion;
    private Integer duracionEnSegundos;

    public TareaEjecutada(String descripcion, Integer duracionEnSegundos) {
        this.descripcion = descripcion;
        this.duracionEnSegundos = duracionEnSegundos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getDuracionEnSegundos() {
        return duracionEnSegundos;
    }

}
