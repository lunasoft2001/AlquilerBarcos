package at.ums.barcos;

import at.ums.alquilerBarcos.operacionesAlquiler;

public class Barco {
	
	public static final short VF = 2; //VF constante 2 para todos los barcos
	
	public double eslora = 10;
	
	public String tipo = "Barco normal";
	
	public String nombre = "\"Rosimar 1\"";
	
	public double alquilerBasico = 0;
	
	
	//Constructor default
	public Barco(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Tipo: " + tipo);
		System.out.println("Eslora: " + eslora);
	
	}
	
	//Constructor con variables
	public Barco(double eslora, String tipo, String nombre) {
		setEslora(eslora);
		setTipo(tipo);
		setNombre(nombre);
		System.out.println("Nombre: " + nombre);
		System.out.println("Tipo: " + tipo);
		System.out.println("Eslora: " + eslora);
			
	}
	
	//Metodo para calcular el alquiler
	public double alquilerBasico(){
		double ab = operacionesAlquiler.alquiler10(eslora, VF);
		return ab;
	}
	
	//Metodo que descibe el alquiler
	public void descripcionAlquiler(){
		System.out.println("Desglose: 10 * " + VF + " * " + eslora + " m. de eslora");
	}

	
	//Metodos get/set de eslora tipo y nombre
	public double getEslora() {
		return eslora;
	}
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
