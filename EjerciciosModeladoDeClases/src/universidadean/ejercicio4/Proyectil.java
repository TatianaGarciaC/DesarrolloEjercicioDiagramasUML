package universidadean.ejercicio4;

public class Proyectil {
	
	Integer tiempo;
	Integer posicion;
	Integer angulo;
	Integer velocidad;
	
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	public Integer getPosicion() {
		return posicion;
	}
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	public Integer getAngulo() {
		return angulo;
	}
	public void setAngulo(Integer angulo) {
		this.angulo = angulo;
	}
	public Integer getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Integer velocidad) {
		this.velocidad = velocidad;
	}

	/**
     * Método para calcular velocidad  a  la  que  es disparado el elemento
     * @return velocidad
     */
	public Integer calcularVelocidad() {
		
		return velocidad;
		
	}
	
	/**
     * Método para calcular angulo con el que sale disparado
     * @return angulo
     */
	public Integer calcularAngulo() {
		
		return angulo;
		
	}
	
}
