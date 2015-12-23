package at.ums.alquilerBarcos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import at.ums.barcos.Barco;

	//Clase para la obtencion de datos
public class EntradaSimple {

    public static String ObtenerDatos(String cadena){
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(cadena);
        System.out.flush();

        try {
            return stdin.readLine();
        } catch (Exception e) {
            return "Error: "+e.getMessage();
        }

    }
    
    public static int PasarAInt(String cadena){
    	
    	int txtFinal = 0;

    	while (txtFinal == 0) {
			try {
				String txtInicial = EntradaSimple.ObtenerDatos(cadena);
				txtFinal = Integer.parseInt(txtInicial);
			} catch (NumberFormatException e) {
				System.out.println("Valor incorrecto. Pruebe de nuevo");
				txtFinal = 0;
			} 
		}
    	
    	return txtFinal;
    	
    }
    
    public static int PasarMesAInt(String cadena){
    	
    	int txtFinal = 0;

    	while (txtFinal < 1 || txtFinal>12) {
			try {
				String txtInicial = EntradaSimple.ObtenerDatos(cadena);
				txtFinal = Integer.parseInt(txtInicial);
			} catch (NumberFormatException e) {
				System.out.println("Valor incorrecto. Pruebe de nuevo");
				txtFinal = 0;
			} 
		}
    	
    	return txtFinal;
    	
    }
    


}
