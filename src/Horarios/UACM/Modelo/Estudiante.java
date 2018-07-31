package Horarios.UACM.Modelo;

import java.util.*;


public class Estudiante extends Persona {


    public Estudiante() {
    }

    public Integer matricula;
    public Semestre Semestre;
    
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public Semestre getSemestre() {
		return Semestre;
	}
	public void setSemestre(Semestre semestre) {
		Semestre = semestre;
	}


}