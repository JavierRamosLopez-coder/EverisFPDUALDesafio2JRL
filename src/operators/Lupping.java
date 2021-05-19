package operators;

/**
 * Librerías importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendrá la segunda opción en el menú de la clase start
 * 
 * @author jramlope
 *
 */
public class Lupping {

	/**
	 * Método encargado de generar una matriz, pasando como dimensión números
	 * introducidos por consola
	 */
	public void lupping() {

		Scanner S = new Scanner(System.in);

		try {

			Pinball p = new Pinball("rojo", 5);

			System.out.println("Ha entrado en un lupping, el color de su bola cambia a dorado");
			p.setColor("dorado");
			String new_color = p.getColor();
			System.out.println("El color actual de su bola es :" + new_color);

			System.out.println("La cosa se va a empezar a poner difícil, vamos a crear un array");

			// Generación de una matriz.
			// El do while tendrá la función de repetir los system out, hasta que el número
			// tanto de filas como de columnas
			// sean iguales, tiene que ser una matriz cuadrada
			int nrows;
			int ncolumns;
			do {
				System.out.println("Introduzca el número de filas : ");
				nrows = S.nextInt();
				System.out.println("Introduzca el número de columnas : ");
				ncolumns = S.nextInt();

			} while (nrows != ncolumns);

			// Instanciación de la variable matriz
			int[][] matriz = new int[nrows][ncolumns];

			// Relleno de la matriz
			System.out.println("Vaya rellenando las posiciones de su matriz");

			for (int i = 0; i < nrows; i++) {
				for (int j = 0; j < ncolumns; j++) {
					System.out.println("Matriz [" + i + "]" + "[" + j + "]");
					matriz[i][j] = S.nextInt();
				}
			}

			// Muestra de la matriz generada
			System.out.println("\n La matriz es : ");
			for (int i = 0; i < nrows; i++) {
				for (int j = 0; j < ncolumns; j++) {
					System.out.print(matriz[i][j]);
				}
				System.out.println("");
			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println("Ha introducido algún dato erróneo, reinicie el programa");

		}

	}
}
