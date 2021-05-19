package operators;

/**
 * Librer�as importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendr�un m�todo para hayar el mayor entre dos m�todo
 * 
 * @author jramlope
 *
 */
public class Big {

	Scanner S = new Scanner(System.in);

	/**
	 * M�todo biggerThan que se encargar� de establecer una comparaci�n, con
	 * condicionales ternarios, entre dos n�meros introducidos por el usuario
	 */
	public void biggerThan() {
		try {

			// Generaci�n de variables locales
			int resultado, n1, n2;

			System.out.println("OH, OH por pasar por esta opci�n le debe 10 pavos al due�o de la m�quina");

			System.out.println("Vamos a realizar algo sencillo, calcularemos que n�mero es mayor entre dos");

			// Interacci�n con el usuario
			System.out.println("Primer n�mero");
			n1 = S.nextInt();
			System.out.println("Segundo n�mero");
			n2 = S.nextInt();

			// Establecimiento de la condici�n a partir de operadores ternarios
			resultado = (n1 > n2) ? n1 : n2;

			System.out.println("El n�mero mayor es : " + resultado);

			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido alg�n dato err�neo, reinicie el programa");

		}
	}

}
