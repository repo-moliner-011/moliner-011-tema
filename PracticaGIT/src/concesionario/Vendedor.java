package concesionario;
public class Vendedor {
	private String nombre;
	private int id;
	private int telefono;
	private String apeVendedor;
	/**
	 * @param nombre
	 * @param id
	 * @param telefono
	 */
	Vendedor(String nombre, int id, int telefono) {
		this.nombre = nombre;
		this.id = id;
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
	 * @return el id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id el id a establecer
	 */
	public void setId(int id) {
		this.id = id;
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
		return "Vendedor [nombre=" + nombre + ", id=" + id + ", telefono="
				+ telefono + "]";
	}
	/**
	 * @return el apeVendedor
	 */
	public String getApeVendedor() {
		return apeVendedor;
	}
	/**
	 * @param apeVendedor el apeVendedor a establecer
	 */
	public void setApeVendedor(String apeVendedor) {
		this.apeVendedor = apeVendedor;
	}

}
