package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.Tarea;


public class Robot {

    private Double bateria;
    private final Double duracionEnMinutos = 125.0;
    private final Double aumentoPorCarga = 0.8;
    private List<TareaEjecutada> tareasEjecutadas;

    public Robot(Double bateria, List<TareaEjecutada> tareasEjecutadas) {
        this.bateria = bateria;
        this.tareasEjecutadas = new ArrayList<>();
    }

    public Double getBateria() {
        return bateria;
    }

    public Double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public Double getAumentoPorCarga() {
        return aumentoPorCarga;
    }

    public List<TareaEjecutada> getTareasEjecutadas() {
        return tareasEjecutadas;
    }

    public void ejecutarTareas(Tarea tarea) {
        tarea.ejecutar(this);
    }

    public void disminuirBateria(Double porcentaje) {
        bateria -= porcentaje;
        if (bateria < 0) {
            bateria = 0.0;
        }
    }

    public void aumentarBateria(Double porcentaje) {
        bateria += porcentaje;
        if (bateria > 100) {
            bateria = 100.0;
        }
    }

    public void agregarTareaEjecutada(String descripcion,Integer duracion) {
        tareasEjecutadas.add(new TareaEjecutada(descripcion,duracion));
    }
}
