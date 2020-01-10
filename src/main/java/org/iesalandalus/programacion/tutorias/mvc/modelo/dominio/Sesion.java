package org.iesalandalus.programacion.tutorias.mvc.modelo.dominio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sesion {
private static final LocalTime HORA_COMIENZO_CLASES = LocalTime.of(16, 00);
private static final LocalTime HORA_FIN_CLASES = LocalTime.of(22, 15);
public static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/YYYY");
public static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm");
private LocalDate fecha;
private LocalTime horaInicio, horaFin;
private int minutosDuracion;
private Tutoria tutoria;

public Sesion(Tutoria tutoria, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, int minutosDuracion){
	setTutoria(tutoria);
	setFecha(fecha);
	setHoraInicio(horaInicio);
	setHoraFin(horaFin);
	setMinutosDuracion(minutosDuracion);
}

public Sesion(Sesion sesion) {
	if (sesion==null) {
		throw new NullPointerException("ERROR: No es posible copiar una sesión nula.");
	}
	
	setTutoria(sesion.tutoria);
	setFecha(sesion.fecha);
	setHoraInicio(sesion.horaInicio);
	setHoraFin(sesion.horaFin);
	setMinutosDuracion(sesion.minutosDuracion);
	
}

private void comprobarValidezSesion() {
	
}

public static Sesion getSesionFicticia(Tutoria tutoria, LocalDate fecha) {
	return null;
	
}
public LocalDate getFecha() {
	return fecha;
}

private void setFecha(LocalDate fecha) {
	this.fecha = fecha;
}

public LocalTime getHoraInicio() {
	return horaInicio;
}

private void setHoraInicio(LocalTime horaInicio) {
	this.horaInicio = horaInicio;
}

public LocalTime getHoraFin() {
	return horaFin;
}

private void setHoraFin(LocalTime horaFin) {
	this.horaFin = horaFin;
}

public int getMinutosDuracion() {
	return minutosDuracion;
}

private void setMinutosDuracion(int minutosDuracion) {
	this.minutosDuracion = minutosDuracion;
}

public Tutoria getTutoria() {
	return tutoria;
}

private void setTutoria(Tutoria tutoria) {
	tutoria = new Tutoria(tutoria);
	this.tutoria = tutoria;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
	result = prime * result + ((tutoria == null) ? 0 : tutoria.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Sesion other = (Sesion) obj;
	if (fecha == null) {
		if (other.fecha != null)
			return false;
	} else if (!fecha.equals(other.fecha))
		return false;
	if (tutoria == null) {
		if (other.tutoria != null)
			return false;
	} else if (!tutoria.equals(other.tutoria))
		return false;
	return true;
}

@Override
public String toString() {
	return "Sesion [fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", minutosDuracion="
			+ minutosDuracion + ", tutoria=" + tutoria + "]";
}



}
