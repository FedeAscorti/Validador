package testing;

import domain.entidades.Alumno;
import domain.entidades.Inscripcion;
import domain.entidades.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InscripcionTest {
@Test
    public void inscripcionAprobada(){
    Alumno alumno = new Alumno("federico");
    Materia materia1 = new Materia("PDEP");
    Materia materia2 = new Materia("AYED");
    List<Materia> materias= new ArrayList<>();
    materias.add(materia1);
    alumno.setMateriasAprobadas(materias);
    materia2.setCorrelativas(materias);
    List<Materia> materiasInscripcion = new ArrayList<>();
    materiasInscripcion.add(materia2);
    Inscripcion inscripcion = new Inscripcion(alumno);
    inscripcion.setMaterias(materiasInscripcion);

    Assert.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionRechazada(){
        Alumno alumno = new Alumno("federico");
        Materia materia1 = new Materia("PDEP");
        Materia materia2 = new Materia("AYED");
        List<Materia> materias= new ArrayList<>();
        materias.add(materia1);
        materia2.setCorrelativas(materias);
        List<Materia> materiasInscripcion = new ArrayList<>();
        materiasInscripcion.add(materia2);
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.setMaterias(materiasInscripcion);

        Assert.assertFalse(inscripcion.aprobada());
    }
}
