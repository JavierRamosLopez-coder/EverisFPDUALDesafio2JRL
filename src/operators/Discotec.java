package operators;

/**
 * Librerías importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendrá el método encargado de simular una discoteca
 * 
 * @author jramlope
 *
 */
public class Discotec {

	Scanner S = new Scanner(System.in);

	/**
	 * Método discotec que se encargará de tomar un número de cubatas, y los
	 * aumentará utilizando el operador +=
	 */
	public void discotec() {
		try {

			// Generación de variables locales
			String bebida;
			int ncubatas;

			System.out.println("Su bola ha pasado por el tornado dragón");

			System.out.println("Acaba de entrar en la sesión de preguntas fiesteras ^^");

			System.out.println("¿ Qué te sueles pedir para beber en fiestas ?");
			bebida = S.next();

			// Establecimiento de condiciones
			if (bebida.equals("Ron")) {

				System.out.println(" ¿ Cuántos cubatas te sueles beber ? ");
				ncubatas = S.nextInt();

				// Aumenta la variable en 1
				ncubatas += 1;

				System.out.println("Ahora te beberás " + ncubatas + " cubatas");

			} else {

				System.out.println("ERROR");

			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}
	}

}
