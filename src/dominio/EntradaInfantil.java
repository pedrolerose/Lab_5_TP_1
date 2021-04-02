package dominio;

import java.util.Date;

public class EntradaInfantil extends Entrada {
	
private int edad;
private boolean souvenir;

public EntradaInfantil(Date fechaEv, double tiempoDuracionEv,int edadN, boolean souvenirEv) {
	
	super(fechaEv, tiempoDuracionEv);
	
	if(edadN > 8) {
		this.setPrecio(500);
	}else {
		this.setPrecio(250);
	}
	this.souvenir = souvenirEv;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public boolean isSouvenir() {
	return souvenir;
}
public void setSouvenir(boolean souvenir) {
	this.souvenir = souvenir;
}

}
