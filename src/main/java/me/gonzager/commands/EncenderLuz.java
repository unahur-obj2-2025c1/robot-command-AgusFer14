package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuz extends Tarea {

    private Habitacion habitacion;

    public EncenderLuz(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void doExecute(Robot robot) {
        habitacion.setLuzEncendida(true);
        duracion = habitacion.getLuzEncendida() ? 25 : 90;
        robot.diminuirBateria(habitacion.getLuzEncendida() ? 1.00 : 5.00);
    }

}
