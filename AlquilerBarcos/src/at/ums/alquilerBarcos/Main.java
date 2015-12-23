package at.ums.alquilerBarcos;

import java.util.ArrayList;

import at.ums.barcos.Barco;
import at.ums.barcos.EmbarcacionesDeportivas;
import at.ums.barcos.Velero;
import at.ums.barcos.Yates;

public class Main {
	

	// Metodo principal
	public static void main(String[] args) {
						
			//Creamos el array flota con los elementos barcoFlota
		ArrayList<Barco> flota = new ArrayList<Barco>();
		Barco barcoflota;
		
			//Preparo los textos de maquetación
		Maquetacion salto = new Maquetacion();
		
			//Cabecera
		salto.cabecera();
		
			//Barco con costructor por defecto		
		barcoflota = new Barco();
		flota.add(barcoflota);
		salto.finDeLinea1();

			//Barco personalizado
		barcoflota = new Barco(15, "Barco personalizado", "\"Rosimar 2\"");
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Velero 20.5 eslora y 3 mástiles
		barcoflota = new Velero(20.5, "Velero", "\"Rosimar 3\"", 3);
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Velero 20.5 eslora y 5 mástiles
		barcoflota = new Velero(20.5, "Velero", "\"Rosimar 4\"", 5);
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Barco deportivo 3.25 eslora y 120 CV
		barcoflota = new EmbarcacionesDeportivas(3.25, "Embarcacion deportiva a motor", "\"Rosimar 5\"", 120);
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Barco deportivo 3.25 eslora y 180 CV
		barcoflota = new EmbarcacionesDeportivas(3.25, "Embarcacion deportiva a motor", "\"Rosimar 6\"", 180);
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Yate 200 eslora ,600 CV y 15 camarotes
		barcoflota = new Yates(200, "Yate de lujo", "\"Reina Rosimar 1\"", 600, 15);
		flota.add(barcoflota);
		salto.finDeLinea1();
		
			//Yate 200 eslora ,600 CV y 30 camarotes
		barcoflota = new Yates(200, "Yate de lujo", "\"Reina Rosimar 2\"", 600, 30);
		flota.add(barcoflota);
		salto.finDeLinea1();
			
		
			//Realiza la operacion de alquiler por día
		salto.cabeceraAlquiler();
		for (int i = 0; i < flota.size(); i++) {
			flota.get(i).descripcionAlquiler();
			System.out.println("El precio por día de " + flota.get(i).nombre + " es de "
					+ flota.get(i).alquilerBasico() + " $\n"  );
		}
		
			//Introducir fecha
		int dia = EntradaSimple.PasarAInt("Introduzca el día inicial: ");
		int mes = EntradaSimple.PasarMesAInt("Introduzca el mes (en números) inicial: ");
		int año = EntradaSimple.PasarAInt("Introduzca el año inicial: ");
		int dia1 = EntradaSimple.PasarAInt("Introduzca el día final: ");
		int mes1 = EntradaSimple.PasarMesAInt("Introduzca el mes (en números) final: ");
		int año1 = EntradaSimple.PasarAInt("Introduzca el año final: ");
		
		
			//Dias de alquiler
		long diasAlquiler = operacionesAlquiler.diasDeAlquiler(dia,mes,año,dia1,mes1,año1);
			
			//Barco elegido
		int barcoElegido = 0;
		while (barcoElegido <1 || barcoElegido > flota.size()){
				//listado de barcos
				System.out.println("Listado de Barcos:\n");
			for (int i = 0; i < flota.size(); i++) {
				System.out.println(i+1  +". " + flota.get(i).nombre);
			}
			barcoElegido = EntradaSimple.PasarAInt("Introduzca el numero del barco elegido: ");
		}

			//Calculos finales
		System.out.println("La opción " + barcoElegido + " corresponde al " + flota.get(barcoElegido - 1).nombre);
		System.out.println("El numero de días de alquiler es de " + diasAlquiler);
		System.out.println("\nEl precio final del alquiler es de " 
					+ (flota.get(barcoElegido - 1).alquilerBasico() * diasAlquiler) + " $" );
	}

}
