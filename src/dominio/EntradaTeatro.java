package dominio;

import java.util.Date;

public class EntradaTeatro extends Entrada {

	private String actorPrincipal;

	public EntradaTeatro(Date fechaEv, double tiempoDuracionEv,String actorPrincipalEv) {
		super(fechaEv, tiempoDuracionEv);
		
		this.setPrecio(1350.50);
		this.actorPrincipal = actorPrincipalEv;
	}
	
	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}
	

	@Override
	public String toString() {
		return "Teatro [actorPrincipal=" + actorPrincipal + "]";
	}
}
