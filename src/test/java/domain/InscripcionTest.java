package domain;

import domain.alumnos.Alumno;
import domain.inscripciones.Inscripcion;
import domain.materias.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InscripcionTest {
    @Test
    public void inscripcionAceptadaUnaMateriaDePrimero(){

        Materia materia1 = new Materia("AM1", null);
        Alumno tomi = new Alumno("Tomas", null);

        Inscripcion inscripcion = new Inscripcion(tomi, Arrays.asList(materia1));

        Assert.assertEquals(true, inscripcion.aprobada());
    }

}
