package operators;

/**
 * Librerías importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendráun método para hayar el mayor entre dos método
 * 
 * @author jramlope
 *
 */
public class Big {

	Scanner S = new Scanner(System.in);

	/**
	 * Método biggerThan que se encargará de establecer una comparación, con
	 * condicionales ternarios, entre dos números introducidos por el usuario
	 */
	public void biggerThan() {
		try {

			// Generación de variables locales
			int resultado, n1, n2;

			System.out.println("OH, OH por pasar por esta opción le debe 10 pavos al dueño de la máquina");

			System.out.println("Vamos a realizar algo sencillo, calcularemos que número es mayor entre dos");

			// Interacción con el usuario
			System.out.println("Primer número");
			n1 = S.nextInt();
			System.out.println("Segundo número");
			n2 = S.nextInt();

			// Establecimiento de la condición a partir de operadores ternarios
			resultado = (n1 > n2) ? n1 : n2;

			System.out.println("El número mayor es : " + resultado);

			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}
	}

}
