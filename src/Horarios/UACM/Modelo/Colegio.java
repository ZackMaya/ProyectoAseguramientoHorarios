package Horarios.UACM.Modelo;

import java.util.*;

public class Colegio {


    public Colegio() {
    }

 
    public String nombre;
    public String area;
    public String descripcion;
    public Carrera Carrera;
    public Profesor Profesor;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Carrera getCarrera() {
		return Carrera;
	}
	public void setCarrera(Carrera carrera) {
		Carrera = carrera;
	}
	public Profesor getProfesor() {
		return Profesor;
	}
	public void setProfesor(Profesor profesor) {
		Profesor = profesor;
	}

}