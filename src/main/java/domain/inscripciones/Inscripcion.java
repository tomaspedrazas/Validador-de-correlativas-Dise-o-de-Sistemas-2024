package domain.inscripciones;

import domain.alumnos.Alumno;
import domain.materias.Materia;

import java.util.Collections;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscriptas;

    public Inscripcion(Alumno nombre){
        this.alumno = nombre;
    }

    public void agregarMateriaParaInscripcion(Materia ... materias){
        Collections.addAll(this.materiasInscriptas, materias);
    }

    public Boolean aprobada(){
        return materiasInscriptas.stream().allMatch(materiaIns -> this.alumno.puedeCursar(materiaIns));
    }
}
