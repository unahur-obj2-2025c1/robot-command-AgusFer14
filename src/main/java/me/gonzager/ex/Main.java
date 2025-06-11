package me.gonzager.ex;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.RobotBuilder;

public class Main {
    public static void main(String[] args) {
        var habitacion = new Habitacion(false, 2);
        var robot = new RobotBuilder()
                    .cargar(45)
                    .encenderLuz(habitacion)
                    .limpiar(habitacion)
                    .encenderLuz(habitacion)
                    .info().build();
        robot.execute();
        System.out.println(robot.getBateria());
    }
    
}