package me.gonzager.commands;

import me.gonzager.domain.Robot;

public abstract class Tarea  {

    private String descripcion;
    private Integer duracion;
    private Double consumoBateria;

    public Tarea(String descripcion, Integer duracion, Double consumoBateria) {
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.consumoBateria = consumoBateria;
    }

    public void ejecutar(Robot robot) {
        if(consumoBateria > 0) {
            realizarTarea(robot);
            robot.disminuirBateria(consumoBateria);
            robot.agregarTareaEjecutada(descripcion,duracion);
        }
    }

    protected abstract void realizarTarea(Robot robot);

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Double getConsumoBateria() {
        return consumoBateria;
    }

}
