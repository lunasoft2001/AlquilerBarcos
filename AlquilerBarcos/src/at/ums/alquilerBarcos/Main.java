package at.ums.alquilerBarcos;

import at.ums.barcos.Barco;
import at.ums.barcos.EmbarcacionesDeportivas;
import at.ums.barcos.Velero;
import at.ums.barcos.Yates;



public class Main {
	// Metodo principal
	public static void main(String[] args) {
		// creamos objeto barcoMini con constructor por defecto
		Barco barcoMini = new Barco();
		System.out.println("----------\n");

		// creamos objeto barcoModificado con constructor con variables eslora, tipo y nombre				 
		Barco barcoModificado = new Barco(15, "barco modificado", "\"Rosimar 2\"");
		System.out.println("----------\n");		
		
		// Creamos objeto Velero
		Barco barcoVelero1 = new Velero(20.5,"Velero","\"Rosimar 3\"",3);
		System.out.println("----------\n");
		
		// Creamos objeto barcoDeportivo
		Barco barcoDeportivo1 = new EmbarcacionesDeportivas(3.25, "Embarcacion deportiva a motor", "\"Rosimar 4\"",120);
		System.out.println("----------\n");		
		
		// Creamos objeto barcoYate
		Barco barcoYate1 = new Yates(200, "Yate de lujo", "\"Reina Rosimar 1\"", 600, 15);
		System.out.println("----------\n");		
		
		
		//Realiza la operacion de alquiler por día
		
		System.out.println("El precio por día de " + barcoMini.nombre+ " es de "
				+ barcoMini.alquilerBasico() + " $"  );
		
		System.out.println("El precio por día de " + barcoModificado.nombre+ " es de "
				+ barcoModificado.alquilerBasico() + " $"  );
				
		System.out.println("El precio por día de " + barcoVelero1.nombre+ " es de "
				+ barcoVelero1.alquilerBasico() + " $"  );
		
		System.out.println("El precio por día de " + barcoDeportivo1.nombre+ " es de "
				+ barcoDeportivo1.alquilerBasico() + " $"  );
		
		System.out.println("El precio por día de " + barcoYate1.nombre+ " es de "
				+ barcoYate1.alquilerBasico() + " $"  );
	
	
	}

}
