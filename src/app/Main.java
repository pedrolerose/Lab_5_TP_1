package app;

import java.util.Date;

import dominio.Banda;
import dominio.BandaSoporte;
import dominio.EntradaDeporte;
import dominio.EntradaInfantil;
import dominio.EntradaRecital;
import dominio.EntradaTeatro;
import dominio.Genero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date hoy = new Date();
		
		
		EntradaDeporte entDep = new EntradaDeporte(hoy, 30, "Futbol", false);		
		System.out.println(entDep.toString());

		EntradaInfantil entInf = new EntradaInfantil(hoy, 15, 8, true);		
		System.out.println(entInf.toString());
		
		Banda bandaPpal = new Banda("Kiss");
		BandaSoporte[] bandasSoporte = {new BandaSoporte("Chaqueño Palavecino"),new BandaSoporte("Almafuerte")}; 
		
		EntradaRecital entRec = new EntradaRecital(hoy, 120, true,"G_Rock", bandaPpal, bandasSoporte);		
		System.out.println(entRec.toString());
		
		String []arrayActoresPpal = {"Valeria Lynch","Pappo","Pepito Cybrian"};
		EntradaTeatro entTeat = new EntradaTeatro(hoy, 60, arrayActoresPpal,"G_Comedia");		
		System.out.println(entTeat.toString());
		
	}

}
