
package universidadean.ejercicio6;

import java.util.ArrayList;

public class Facultad {
	String nombre;
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	ArrayList<Carrera> carreras = new ArrayList<Carrera>();
	ArrayList<Curso> cursos = new ArrayList<Curso>();
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
	 * @return the profesores
	 */
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	/**
	 * @param profesores the profesores to set
	 */
	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
	/**
	 * @return the estudiantes
	 */
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	/**
	 * @param estudiantes the estudiantes to set
	 */
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	/**
	 * @return the carreras
	 */
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	/**
	 * @param carreras the carreras to set
	 */
	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	/**
	 * @return the cursos
	 */
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

}
