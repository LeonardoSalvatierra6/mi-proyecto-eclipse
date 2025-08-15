package ejerciciouno;

public class TrenPasajeros extends Tren implements Capacidad {
    private int numVagones;
    private int pasajerosPorVagon;

    public TrenPasajeros(String id, String nombre, double velocidadMax, int numVagones, int pasajerosPorVagon)
            throws TrenInvalidoException {
        super(id, nombre, velocidadMax);
        if (numVagones < 0 || pasajerosPorVagon < 0) {
            throw new TrenInvalidoException("Valores de vagones o pasajeros inválidos.");
        }
        this.numVagones = numVagones;
        this.pasajerosPorVagon = pasajerosPorVagon;
    }
    

    @Override
    public double calcularCapacidad() {
        return numVagones * pasajerosPorVagon;
    }
    
    @Override
    public void mostrarInformacion() {
       
		String nombre = null;
		String id = null;
		String velocidadMax = null;
		System.out.println("Tren de Pasajeros: " + nombre + ", ID: " + id +
                ", Velocidad Max: " + velocidadMax + " km/h, Capacidad: " + calcularCapacidad() + "pasajeros");
    }
}


