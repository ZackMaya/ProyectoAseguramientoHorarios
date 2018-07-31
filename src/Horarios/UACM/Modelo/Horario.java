package Horarios.UACM.Modelo;

import java.util.*;


public class Horario {


    public Horario() {
    }


    public Date dia;
    public Date horaInicio;
    public Date horaTermino;
    
	public Date getDia() {
		return dia;
	}
	public void setDia(Date dia) {
		this.dia = dia;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(Date horaTermino) {
		this.horaTermino = horaTermino;
	}


}