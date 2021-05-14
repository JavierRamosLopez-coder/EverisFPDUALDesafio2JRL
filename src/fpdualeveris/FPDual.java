package fpdualeveris;

import operators.Pinball;

/**
 * Clase FPDual
 * @author jramlope
 *
 */
public class FPDual {

	/**
	 * Método main encargado de ejecutar el método operatorsChallenge
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		operatorsChallenge();
		

	}

	/**
	 * Método privado que va a contener un objeto de la clase Pinball, y una llamada al método throwBall que tendrá
	 * todo el código necesario
	 */
	private static void operatorsChallenge() {
		
		Pinball p = new Pinball("Rojo",34);
		
		p.throwBall();
		
	}
}
