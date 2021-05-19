package operators;

/**
 * Librer�as importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendr� el m�todo encargado de simular una discoteca
 * 
 * @author jramlope
 *
 */
public class Discotec {

	Scanner S = new Scanner(System.in);

	/**
	 * M�todo discotec que se encargar� de tomar un n�mero de cubatas, y los
	 * aumentar� utilizando el operador +=
	 */
	public void discotec() {
		try {

			// Generaci�n de variables locales
			String bebida;
			int ncubatas;

			System.out.println("Su bola ha pasado por el tornado drag�n");

			System.out.println("Acaba de entrar en la sesi�n de preguntas fiesteras ^^");

			System.out.println("� Qu� te sueles pedir para beber en fiestas ?");
			bebida = S.next();

			// Establecimiento de condiciones
			if (bebida.equals("Ron")) {

				System.out.println(" � Cu�ntos cubatas te sueles beber ? ");
				ncubatas = S.nextInt();

				// Aumenta la variable en 1
				ncubatas += 1;

				System.out.println("Ahora te beber�s " + ncubatas + " cubatas");

			} else {

				System.out.println("ERROR");

			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido alg�n dato err�neo, reinicie el programa");

		}
	}

}
