package Horarios.UACM.Modelo;

import java.util.*;

public class Materia {


    public Materia() {
    }

    public String nombre;
    public Semestre Semestre;
    public Profesor Profesor;
    public String descripcion;
    public Horario Horario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Semestre getSemestre() {
		return Semestre;
	}
	public void setSemestre(Semestre semestre) {
		Semestre = semestre;
	}
	public Profesor getProfesor() {
		return Profesor;
	}
	public void setProfesor(Profesor profesor) {
		Profesor = profesor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Horario getHorario() {
		return Horario;
	}
	public void setHorario(Horario horario) {
		Horario = horario;
	}





}