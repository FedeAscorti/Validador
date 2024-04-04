package domain.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean puedeCursar(Materia materia){
        List<Materia> correlativas = materia.getCorrelativas();
        for (Materia correlativa : correlativas) {
            if (!this.materiasAprobadas.contains(correlativa)) {

                return false;
            }
        }
        return true;
        }
    }



