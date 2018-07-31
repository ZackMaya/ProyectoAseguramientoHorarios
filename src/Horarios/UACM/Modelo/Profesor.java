package Horarios.UACM.Modelo;

import java.util.*;

public class Profesor extends Persona {

    public Profesor() {
    }


    public Integer numTrabajador;
    public String especialidad;
    
	public Integer getNumTrabajador() {
		return numTrabajador;
	}
	public void setNumTrabajador(Integer numTrabajador) {
		this.numTrabajador = numTrabajador;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
    
    

}