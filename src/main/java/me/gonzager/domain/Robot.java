package me.gonzager.domain;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.ITarea;


public class Robot {

    Double bateria = 0.0;
    public static final Integer duracionEnMinutos = 125;
    List<ITarea> tareasPendientes = new ArrayList<>();

    public Robot( List<ITarea> tareasPendientes) {
        this.tareasPendientes = tareasPendientes;
    }

    List<ITarea> tareasEjecutadas = new ArrayList<>();

    public void addTareaEjecutada(ITarea tarea) {
        this.tareasEjecutadas.add(tarea);
    }

    public void removeTareasPendientes(ITarea tarea) {
        this.tareasPendientes.remove(tarea);
    }

    public void diminuirBateria(Double unValor) {
        bateria = Double.max(0, bateria - unValor);
    }

    public void cargarBateria(Double unValor) {
        bateria = Double.min(0, bateria + unValor);
    }

    public Double getBateria() {
        return bateria;
    }

    public Double getTiempoRestante() {
        return 100 / duracionEnMinutos * bateria;
    }

    public List<ITarea> getTareasEjecutadas() {
        return tareasEjecutadas;
    }

    public void execute() {
        this.tareasPendientes.stream().forEach(tarea -> tarea.execute(this));
    }

}
