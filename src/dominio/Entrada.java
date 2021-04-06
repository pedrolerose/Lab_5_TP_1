package dominio;

import java.util.Date;

public class Entrada extends EntidadBase {

	//properties
	
	private double precio;
	private int tiempoDuracion;
<<<<<<< HEAD
=======
	private String nombreEvento;
>>>>>>> b26a69ba8cc217fa350c11f27ce6989a10caf335
	private IGenero genero;
	
	public IGenero getGenero() {
		return genero;
	}

	public void setGenero(IGenero genero) {
		this.genero = genero;
	}

<<<<<<< HEAD
	public Entrada(Date fechaEv, int tiempoDuracionEv) {
=======
	public Entrada(Date fechaEv, int tiempoDuracionEv, String nombreEventoEv) {
>>>>>>> b26a69ba8cc217fa350c11f27ce6989a10caf335
		
		super(fechaEv);
		
		tiempoDuracion = tiempoDuracionEv;
<<<<<<< HEAD
=======
		nombreEvento = nombreEventoEv;
>>>>>>> b26a69ba8cc217fa350c11f27ce6989a10caf335
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
	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}
	
	
}
