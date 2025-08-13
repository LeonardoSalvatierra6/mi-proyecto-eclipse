package ejerciciouno;

public class TrenCarga extends Tren {

	//Clase para TrenCarga. No pongo la variable int pasajerosPorVagon porque en un tren de carga no hay pasajeros
	public TrenCarga(String id, String nombre, double velocidadMax, int numVagones) throws TrenInvalidoException {
		super(id, nombre, velocidadMax);
		
	}

	//Sobreescribo otra vez mostrarInformacion para que vaya con la clase TrenCarga
	@Override
	public void mostrarInformacion() {


	}

}
