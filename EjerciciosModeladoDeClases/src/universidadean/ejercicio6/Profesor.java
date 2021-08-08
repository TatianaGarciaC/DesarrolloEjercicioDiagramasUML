package universidadean.ejercicio6;

public class Profesor {
	String profesion;
	String nacionalidad;
	Double sueldo;
	Persona datosPersonales = new Persona();
	/**
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}
	/**
	 * @param profesion the profesion to set
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}
	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	/**
	 * @return the sueldo
	 */
	public Double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
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
