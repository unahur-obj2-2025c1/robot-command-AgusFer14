package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    private Integer minutos;

    public Cargar(Integer minutos) {
        if(minutos > Robot.duracionEnMinutos || minutos < 0)
            throw new IllegalArgumentException("Parametro de minutos incorrecto.");
        this.minutos = minutos;
    }

    @Override
    public void doExecute(Robot robot) {
        var tiempoMaximo = Robot.duracionEnMinutos - robot.getTiempoRestante() * 60;
        var duracionEnMinutos = Double.min(minutos, tiempoMaximo);
        robot.cargarBateria(duracionEnMinutos * 100 / Robot.duracionEnMinutos);
    }
    
}
