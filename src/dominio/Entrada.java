package dominio;

import java.util.Date;

public class Entrada extends EntidadBase {

	//properties
	
	private double precio;
	private double tiempoDuracion;
	
	public Entrada(Date fechaEv, double tiempoDuracionEv) {
		
		super(fechaEv);
		
		tiempoDuracion = tiempoDuracionEv;
	}
	
	//getters and setters
	
	public double getTiempoDuracion() {
		return tiempoDuracion;
	}
	public void setTiempoDuracion(double tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
