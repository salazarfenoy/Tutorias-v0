package org.iesalandalus.programacion.tutorias.mvc.modelo;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Alumno;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Cita;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Sesion;
import org.iesalandalus.programacion.tutorias.mvc.modelo.dominio.Tutoria;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Alumnos;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Citas;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Profesores;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Sesiones;
import org.iesalandalus.programacion.tutorias.mvc.modelo.negocio.Tutorias;

public class Modelo {

	private static final int CAPACIDAD = 10;
	private Alumnos alumnos;
	private Profesores profesores;
	private Tutorias tutorias;
	private Sesiones sesiones;
	private Citas citas;

	public Modelo() {
		citas = new Citas(CAPACIDAD);
		alumnos = new Alumnos(CAPACIDAD);
		profesores = new Profesores(CAPACIDAD);
		tutorias = new Tutorias(CAPACIDAD);
		sesiones = new Sesiones(CAPACIDAD);
	}

	public void insertar(Alumno alumno) {

		try {
			alumnos.insertar(alumno);
		} catch (OperationNotSupportedException e) {

			System.out.print(e);
		}

	}

	public void insertar(Profesor profesor) {
		try {
			profesores.insertar(profesor);
		} catch (OperationNotSupportedException e) {

			System.out.print(e);
		}
	}

	public void insertar(Tutoria tutoria) {
		try {
			tutorias.insertar(tutoria);
		} catch (OperationNotSupportedException e) {

			System.out.print(e);
		}
	}

	public void insertar(Sesion sesion) {
		try {
			sesiones.insertar(sesion);
		} catch (OperationNotSupportedException e) {

			System.out.print(e);
		}
	}

	public void insertar(Cita cita) {
		try {
			citas.insertar(cita);
		} catch (OperationNotSupportedException e) {

			System.out.print(e);
		}
	}

	public Alumno buscar(Alumno alumno) {
		return alumnos.buscar(alumno);

	}

	public Profesor buscar(Profesor profesor) {
		return profesores.buscar(profesor);
	}

	public Tutoria buscar(Tutoria tutoria) {
		return tutorias.buscar(tutoria);
	}

	public Sesion buscar(Sesion sesion) {
		return sesiones.buscar(sesion);
	}

	public Cita buscar(Cita cita) {
		return citas.buscar(cita);
	}

	public void borrar(Alumno alumno) {
		try {
			alumnos.borrar(alumno);
		} catch (OperationNotSupportedException e) {
			System.out.print(e);
		}
	}

	public void borrar(Profesor profesor) {
		try {
			profesores.borrar(profesor);
		} catch (OperationNotSupportedException e) {
			System.out.print(e);
		}
	}

	public void borrar(Tutoria tutoria) {
		try {
			tutorias.borrar(tutoria);
		} catch (OperationNotSupportedException e) {
			System.out.print(e);
		}
	}

	public void borrar(Sesion sesion) {
		try {
			sesiones.borrar(sesion);
		} catch (OperationNotSupportedException e) {
			System.out.print(e);
		}
	}

	public void borrar(Cita cita) {
		try {
			citas.borrar(cita);
		} catch (OperationNotSupportedException e) {
			System.out.print(e);
		}
	}

	public Alumno[] getAlumnos() {
		return alumnos.get();

	}

	public Profesor[] getProfesores() {
		return profesores.get();
	}

	public Tutoria[] getTutorias() {
		return tutorias.get();
	}

	public Tutoria[] getTutorias(Profesor profesor) {
		return tutorias.get(profesor);
	}

	public Sesion[] getSesiones() {
		return sesiones.get();
	}

	public Sesion[] getSesiones(Tutoria tutoria) {
		return sesiones.get(tutoria);
	}

	public Cita[] getCitas() {
		return citas.get();
	}

	public Cita[] getCitas(Sesion sesion) {
		return citas.get(sesion);
	}

	public Cita[] getCitas(Alumno alumno) {
		return citas.get(alumno);
	}

}
