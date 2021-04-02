package dominio;

import java.util.Date;

public class EntradaDeporte extends Entrada {

	private String tipoDeporte;
	private boolean nacional;
	
	public EntradaDeporte(Date fechaEv, double tiempoDuracionEv, String tipoDeporteEv, boolean nacionalEv) {
		
		super(fechaEv, tiempoDuracionEv);
		
		switch (tipoDeporteEv) {
		case "futbol" :
			this.setPrecio(300);
		break;
		case "rugby":
			this.setPrecio(450);
		break;
		case "hockey":
			this.setPrecio(380);
		break;
		default:
			System.out.println("Tipo de Deporte Incorrecto");
			
			nacional = nacionaEv;
	}
	
	public String getTipoDeporte() {
		return tipoDeporte;
	}
	public void setTipoDeporte(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}
	public boolean isNacional() {
		return nacional;
	}
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
	
	
}
