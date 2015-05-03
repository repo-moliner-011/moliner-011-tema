package concesionario;

public class Coche {
	private int numBastidor;
	private String marca;
	private String modelo;
	private String matricula;
	private int anioFab;
	/**
	 * @param numBastidor
	 * @param marca
	 * @param modelo
	 * @param anioFab
	 */
	Coche(int numBastidor, String marca, String modelo, int anioFab) {
		this.numBastidor = numBastidor;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFab = anioFab;
	}
	/**
	 * @return el numBastidor
	 */
	public int getNumBastidor() {
		return numBastidor;
	}
	/**
	 * @param numBastidor el numBastidor a establecer
	 */
	public void setNumBastidor(int numBastidor) {
		this.numBastidor = numBastidor;
	}
	/**
	 * @return el marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca el marca a establecer
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return el modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo el modelo a establecer
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return el anioFab
	 */
	public int getAnioFab() {
		return anioFab;
	}
	/**
	 * @param anioFab el anioFab a establecer
	 */
	public void setAnioFab(int anioFab) {
		this.anioFab = anioFab;
	}
	@Override
	public String toString() {
		return "Coche [numBastidor=" + numBastidor + ", marca=" + marca
				+ ", modelo=" + modelo + ", anioFab=" + anioFab + "]";
	}
	/**
	 * @return el matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula el matricula a establecer
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
