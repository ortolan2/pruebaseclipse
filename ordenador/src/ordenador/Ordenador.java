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
	 * variable para almacenar donde se encuentra el equipo
	 */
	
	public String modelo;
	public double precio;
	public int memoria;
	
	public String ubicacionAula;
	
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
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}
	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
	
	
}
