package concesionario;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
	private List<Coche> almacen;

	// A�adir y Eliminar coches en el nuestro almacen concesionario.
	public Concesionario() {

		this.almacen = new ArrayList<Coche>();
		

	}

	public Coche getCoche(int i) {
		return this.almacen.get(i);
	}

	public int getSizeAlmacen() {
		return this.almacen.size();
	}

	public Coche getCoche(String ma) {

		boolean encontrado = false;
		int i = 0;

		while (i < almacen.size() && !encontrado) {

			encontrado = almacen.get(i).getMarca().equals(ma);
			if (!encontrado)
				i++;
		}
		if (encontrado) {
			return almacen.get(i);

		} else
			throw new IllegalArgumentException();

	}

}
