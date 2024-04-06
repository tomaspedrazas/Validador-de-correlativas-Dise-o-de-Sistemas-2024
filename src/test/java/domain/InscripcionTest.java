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
        Materia am1 = new Materia("AM1");
        Materia algebra = new Materia("Algebra");

        Materia am2 = new Materia("AM2");
        am2.agregarMateriaCorrelativa(am1);
        am2.agregarMateriaCorrelativa(algebra);

        Alumno pepe = new Alumno("pepe");

        Inscripcion insc = new Inscripcion(pepe);
        insc.agregarMateriaParaInscripcion(am2);

        Assert.assertEquals(false, insc.aprobada());

    }

}
