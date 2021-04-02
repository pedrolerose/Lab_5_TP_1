package dominio;

public class EntradaRecital extends Entrada {
	
	//properties
	
	private boolean esVip;
	private Banda banda;
	private Genero genero;
	private BandaSoporte bandaSoporte;
	
	
	//constructors
	
	public EntradaRecital () {
		
		if(this.esVip) {
			this.setPrecio(1500);	
		} else {
			this.setPrecio(800);
		}
		
	}
	

	//getters and setters
	
	public boolean getEsVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}


	public Banda getBanda() {
		return banda;
	}


	public void setBanda(Banda banda) {
		this.banda = banda;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public BandaSoporte getBandaSoporte() {
		return bandaSoporte;
	}


	public void setBandaSoporte(BandaSoporte bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}

	
}
