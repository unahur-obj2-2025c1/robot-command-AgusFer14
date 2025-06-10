package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {

    private Integer minutosCarga;

    public Cargar(String descripcion, Integer duracion, Double consumoBateria) {
        super(descripcion, duracion, consumoBateria);
        
    }

    @Override
    protected void realizarTarea(Robot robot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizarTarea'");
    }
    
}
