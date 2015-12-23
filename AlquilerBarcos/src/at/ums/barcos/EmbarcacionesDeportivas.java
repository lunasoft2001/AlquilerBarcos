package at.ums.barcos;

import at.ums.alquilerBarcos.operacionesAlquiler;

public class EmbarcacionesDeportivas extends Barco {
	
	public long potencia =0;

	public EmbarcacionesDeportivas(double eslora, String tipo, String nombre,long potenciaCV) {
		super(eslora, tipo, nombre);
		potencia = potenciaCV;
		System.out.println("Potencia " + potencia + " CV");
	}
	
	//sobreescribe el metodo alquilerBasico
	public double alquilerBasico(){
		double ab = operacionesAlquiler.alquiler10(eslora, VF) + potencia;
		return ab;
	}
	
	//Metodo que sobreescribe descripcionAlqiler
	public void descripcionAlquiler(){
		System.out.println("Desglose: 10 * " + VF + " * " + eslora + " m. de eslora + " + potencia + " CV de potencia" );
	}
	
}
