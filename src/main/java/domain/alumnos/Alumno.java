package domain.alumnos;

import domain.inscripciones.Inscripcion;
import domain.materias.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;


    public Alumno(String nombre){
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateriaAprobada(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean puedeCursar(Materia materia){
        return materia.getCorrelativas()
                .stream().allMatch(materiaCorre -> this.materiasAprobadas.contains(materiaCorre));
    }
}
