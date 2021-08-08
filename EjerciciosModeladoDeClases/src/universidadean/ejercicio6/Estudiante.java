package universidadean.ejercicio6;

import java.sql.Date;

public class Estudiante {
	String semestre;
	Carrera carrera = new Carrera();
	Date fechaIngreso;
	Persona datosPersonales = new Persona();
	/**
	 * @return the semestre
	 */
	public String getSemestre() {
		return semestre;
	}
	/**
	 * @param semestre the semestre to set
	 */
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	/**
	 * @return the carrera
	 */
	public Carrera getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/**
	 * @return the datosPersonales
	 */
	public Persona getDatosPersonales() {
		return datosPersonales;
	}
	/**
	 * @param datosPersonales the datosPersonales to set
	 */
	public void setDatosPersonales(Persona datosPersonales) {
		this.datosPersonales = datosPersonales;
	}
	
}
