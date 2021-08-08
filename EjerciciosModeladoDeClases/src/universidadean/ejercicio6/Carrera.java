package universidadean.ejercicio6;

public class Carrera {
	String nombre;
	Integer numeroCreditos;
	Integer numeroSemestres;
	NivelCarreraEnum nivelCarrera = new NivelCarreraEnum();
	Facultad facultad = new Facultad();
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
	 * @return the numeroSemestres
	 */
	public Integer getNumeroSemestres() {
		return numeroSemestres;
	}
	/**
	 * @param numeroSemestres the numeroSemestres to set
	 */
	public void setNumeroSemestres(Integer numeroSemestres) {
		this.numeroSemestres = numeroSemestres;
	}
	/**
	 * @return the nivelCarrera
	 */
	public NivelCarreraEnum getNivelCarrera() {
		return nivelCarrera;
	}
	/**
	 * @param nivelCarrera the nivelCarrera to set
	 */
	public void setNivelCarrera(NivelCarreraEnum nivelCarrera) {
		this.nivelCarrera = nivelCarrera;
	}
	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}
	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
}
