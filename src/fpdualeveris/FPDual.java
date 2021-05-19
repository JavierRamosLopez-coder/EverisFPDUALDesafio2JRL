package fpdualeveris;

/**
 * Librer�as importadas
 */
import operators.Start;

/**
 * Clase FPDual
 * 
 * @author jramlope
 *
 */
public class FPDual {

	/**
	 * M�todo main encargado de ejecutar el m�todo operatorsChallenge
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		operatorsChallenge();

	}

	/**
	 * M�todo privado que va a contener un objeto de la clase Start, y una llamada
	 * al m�todo start que tendr� todo el c�digo necesario
	 */
	private static void operatorsChallenge() {

		Start s = new Start();

		s.start();

	}
}
