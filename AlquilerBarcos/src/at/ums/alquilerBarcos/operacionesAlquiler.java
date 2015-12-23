package at.ums.alquilerBarcos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class operacionesAlquiler {

	public static double alquiler10(double eslora, short valorFijo){
		double resultado = 0;
		resultado = eslora * valorFijo * 10;
		return resultado;
	}
	
	public static long diasDeAlquiler(int dia, int mes, int a�o, int dia1, int mes1, int a�o1) {
		
		final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al d�a 
		//java.util.Date fechaFinal = new Date(); //Fecha de hoy 

		//int a�o1 = 2015; int mes1 = 12; int dia1 = 23; //Fecha anterior 
		Calendar calendar1 = new GregorianCalendar(a�o1, mes1-1, dia1); 
		java.sql.Date fechaFinal = new java.sql.Date(calendar1.getTimeInMillis());
  
		
		//int a�o = 2015; int mes = 12; int dia = 1; //Fecha anterior 
		Calendar calendar = new GregorianCalendar(a�o, mes-1, dia); 
		java.sql.Date fechaInicial = new java.sql.Date(calendar.getTimeInMillis());


		long diferencia = ( fechaFinal.getTime() - fechaInicial.getTime() )/MILLSECS_PER_DAY; 
		return diferencia + 1;
	}
			
}
