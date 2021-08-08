package universidadean.ejercicio6;

import java.util.ArrayList;

public class Universidad {
	String nombre;
	String nombreRector;
	String ciudad;
	ArrayList<Facultad> facultad = new ArrayList<Facultad>();
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
	 * @return the nombreRector
	 */
	public String getNombreRector() {
		return nombreRector;
	}
	/**
	 * @param nombreRector the nombreRector to set
	 */
	public void setNombreRector(String nombreRector) {
		this.nombreRector = nombreRector;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the facultad
	 */
	public ArrayList<Facultad> getFacultad() {
		return facultad;
	}
	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(ArrayList<Facultad> facultad) {
		this.facultad = facultad;
	}

	
}
