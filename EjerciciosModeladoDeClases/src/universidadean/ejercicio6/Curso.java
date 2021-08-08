
package universidadean.ejercicio6;

public class Curso {
	String codigo;
	String nombre;
	Integer numeroCreditos;
	Carrera carrera = new Carrera();
	Integer numeroSalon;
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	 * @return the numeroCreditos
	 */
	public Integer getNumeroCreditos() {
		return numeroCreditos;
	}
	/**
	 * @param numeroCreditos the numeroCreditos to set
	 */
	public void setNumeroCreditos(Integer numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
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
	 * @return the numeroSalon
	 */
	public Integer getNumeroSalon() {
		return numeroSalon;
	}
	/**
	 * @param numeroSalon the numeroSalon to set
	 */
	public void setNumeroSalon(Integer numeroSalon) {
		this.numeroSalon = numeroSalon;
	}
	
	
}
