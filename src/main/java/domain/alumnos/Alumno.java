package domain.alumnos;

import domain.inscripciones.Inscripcion;
import domain.materias.Materia;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;
    private Inscripcion inscripcion;

    public Alumno(String nombre, List<Materia> materiasAprobadas){
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
