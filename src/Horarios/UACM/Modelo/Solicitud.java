package Horarios.UACM.Modelo;

import java.util.*;


public class Solicitud implements Solicitudes {

  


    public Solicitud(Integer numero, Estudiante estudiante, Materia materia) {
		super();
		this.numero = numero;
		Estudiante = estudiante;
		Materia = materia;
	}
    
    
	public Integer numero;
    public Estudiante Estudiante;
    public Materia Materia;


	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Estudiante getEstudiante() {
		return Estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		Estudiante = estudiante;
	}
	public Materia getMateria() {
		return Materia;
	}
	public void setMateria(Materia materia) {
		Materia = materia;
	}

}