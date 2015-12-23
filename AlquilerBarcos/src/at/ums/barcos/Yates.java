package at.ums.barcos;

import at.ums.alquilerBarcos.operacionesAlquiler;

public class Yates extends EmbarcacionesDeportivas {

	public int camarotes = 0;
	
	public Yates(double eslora, String tipo, String nombre,long potenciaCV , int numCamarotes) {
		super(eslora, tipo, nombre, potenciaCV);
		camarotes = numCamarotes;
		
		System.out.println("Camarotes " + camarotes );
	}
	
	//sobreescribe el metodo alquilerBasico
	public double alquilerBasico(){
		double ab = operacionesAlquiler.alquiler10(eslora, VF) + potencia + camarotes;
		return ab;
	}
	
	//Metodo que sobreescribe descripcionAlqiler
		public void descripcionAlquiler(){
			System.out.println("Desglose: 10 * " + VF + " * " + eslora + " m. de eslora + "
					+ potencia + " CV de potencia + " + camarotes + " camarotes"  );
		}

}
