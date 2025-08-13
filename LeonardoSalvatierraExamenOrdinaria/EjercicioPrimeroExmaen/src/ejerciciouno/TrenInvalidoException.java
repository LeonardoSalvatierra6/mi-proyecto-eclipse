package ejerciciouno;


//clase exception para lanzar mensaje
public class TrenInvalidoException extends Exception {

	public TrenInvalidoException(String mensaje) {
		super(mensaje);
	}
}
