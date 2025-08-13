package ejerciciouno;

public abstract class Tren {
	
    protected String id;
    protected String nombre;
    protected double velocidadMax;
    
//Variables
    public Tren
    (String id, String nombre, double velocidadMax)
    		throws TrenInvalidoException {
    	
    	//Pongo if para que no se pueda poner valores negativos
        if (velocidadMax < 0) {
            throw new TrenInvalidoException("La velocidad no puede ser negativa"); 
        }
        this.id = id;
        this.nombre = nombre;
        this.velocidadMax = velocidadMax;
    }

    public abstract void mostrarInformacion();

	}


