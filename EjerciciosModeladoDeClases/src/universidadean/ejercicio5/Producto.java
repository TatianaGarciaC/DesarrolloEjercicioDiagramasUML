package universidadean.ejercicio5;

import java.sql.Date;

public class Producto {
	Integer codigo;
	String nombre;
	TipoProductoEnum tipoProductoEnum = new TipoProductoEnum();
	Date fechaExpiracion;
	String nombreFabricante;
	Integer cantidadInventario;
	Double precioUnitario;

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoProductoEnum getTipoProductoEnum() {
		return tipoProductoEnum;
	}
	public void setTipoProductoEnum(TipoProductoEnum tipoProductoEnum) {
		this.tipoProductoEnum = tipoProductoEnum;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getNombreFabricante() {
		return nombreFabricante;
	}
	public void setNombreFabricante(String nombreFabricante) {
		this.nombreFabricante = nombreFabricante;
	}
	public Integer getCantidadInventario() {
		return cantidadInventario;
	}
	public void setCantidadInventario(Integer cantidadInventario) {
		this.cantidadInventario = cantidadInventario;
	}
	public Double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
