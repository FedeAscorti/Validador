package domain.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private LocalDate fecha;
    private List<Materia> materias;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.fecha = LocalDate.now();
        this.materias = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public boolean aprobada() {

        for (Materia materia : materias) {
            if (!alumno.puedeCursar(materia)) {

                return false;
            }
        }
        return true;
    }
}
