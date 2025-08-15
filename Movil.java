package ejercicio2;

import java.util.Scanner;

public class Movil {

	protected String movil;
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce tu numero movil");
		String movil = scanner.nextLine();

		
		try {
			ValidarMovil(movil);
			System.out.println("Movil válido.");
		} 
		catch (MovilInvalidException e) {
			System.out.println("Error: " +e.getMessage());
			System.out.println("Por favor, inteta nuevamente. \n");
		}
		scanner.close();
	}

	
	public static void ValidarMovil(String movil)
	throws MovilInvalidException{
		if (movil == null || !movil.matches("\\d{8}"));
		{
			throw new MovilInvalidException("Movil inválido. Debe tener 8 dígitos.");
			
		}
	}
}



