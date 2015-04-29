package concesionario;

public class Cliente {
	private String nombre;
	private int edad;
	private String ciudad;
	private int telefono;
	private int idCliente;
	private String nomCliente;
	private String apeCliente;
	
	public Cliente(String nombre, int edad, String ciudad, int telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.telefono = telefono;
	}
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return el ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad el ciudad a establecer
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return el telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono el telefono a establecer
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", ciudad="
				+ ciudad + ", telefono=" + telefono + "]";
	}
}
	
	
	
	
