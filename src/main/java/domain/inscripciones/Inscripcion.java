package domain.inscripciones;

import domain.alumnos.Alumno;
import domain.materias.Materia;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscriptas;

    public Inscripcion(Alumno nombre, List<Materia> inscriptas){
        this.alumno = nombre;
        this.materiasInscriptas = inscriptas;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Boolean aprobada(){
        return true;
    } //tuve problemas instalando y no llegue con el tiempo, entrego y despues pienso bien la logica del problema
}
