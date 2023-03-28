package ordenador;

/**
 * esta es una clase para almacenar informacion de los ordenadores del centro
 * @author ALUMNO
 * @version 1.0
 */

public class Ordenador {
	/**
	 * se informa el modelo del ordenador
	 * variable almacena el precio total del ordenador
	 * variable que almacena el tamaño de la memoria
	 */
	
	public String modelo;
	public double precio;
	public int memoria;
	
	/**
	 * constructor vacio de la clase ordenador
	 */
	public Ordenador() {
		
	}
	/**
	 * constructor de la clase ordenador
	 * @param modelo: se informa el modelo del ordenador
	 * @param precio: variable almacena el precio total del ordenador
	 * @param memoria: variable que almacena el tamaño de la memoria
	 */
	public Ordenador(String modelo, double precio, int memoria) {
		this.modelo = modelo;
		this.precio = precio;
		this.memoria = memoria;
	}
	
	
}
