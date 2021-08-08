package universidadean.ejercicio6;

import java.sql.Date;

public class Persona {
	String cedula;
	String nombre;
	Date fechaNacimiento;
	String ciudadNacimiento;
	String departNacimiento;
	String paisNacimiento;
	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the ciudadNacimiento
	 */
	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}
	/**
	 * @param ciudadNacimiento the ciudadNacimiento to set
	 */
	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}
	/**
	 * @return the departNacimiento
	 */
	public String getDepartNacimiento() {
		return departNacimiento;
	}
	/**
	 * @param departNacimiento the departNacimiento to set
	 */
	public void setDepartNacimiento(String departNacimiento) {
		this.departNacimiento = departNacimiento;
	}
	/**
	 * @return the paisNacimiento
	 */
	public String getPaisNacimiento() {
		return paisNacimiento;
	}
	/**
	 * @param paisNacimiento the paisNacimiento to set
	 */
	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}
	
}
