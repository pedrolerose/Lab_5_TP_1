package dominio;

import java.util.Date;

public class Entrada extends EntidadBase {

	//properties
	
	private double precio;
	private int tiempoDuracion;
	private IGenero genero;
	
	public IGenero getGenero() {
		return genero;
	}

	public void setGenero(IGenero genero) {
		this.genero = genero;
	}

	public Entrada(Date fechaEv, int tiempoDuracionEv) {
		
		super(fechaEv);
		
		tiempoDuracion = tiempoDuracionEv;
	}
	
	//getters and setters
	
	public int getTiempoDuracion() {
		return tiempoDuracion;
	}
	public void setTiempoDuracion(int tiempoDuracion) {
		this.tiempoDuracion = tiempoDuracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
