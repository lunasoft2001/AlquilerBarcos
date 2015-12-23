package at.ums.barcos;

import at.ums.alquilerBarcos.operacionesAlquiler;

public class Velero extends Barco {

	int mastiles = 0;
	
	public Velero(double eslora, String tipo, String nombre,int numMastiles) {
		super(eslora, tipo, nombre);
		mastiles = numMastiles;
		System.out.println("mastiles " + mastiles);
	}
	
	//sobreescribe el metodo alquilerBasico
	public double alquilerBasico(){
		double ab = operacionesAlquiler.alquiler10(eslora, VF) + mastiles;
		return ab;
	}
	
	//Metodo que sobreescribe descripcionAlqiler
	public void descripcionAlquiler(){
		System.out.println("Desglose: 10 * " + VF + " * " + eslora + " m. de eslora + " + mastiles + " mástiles" );
	}
}
