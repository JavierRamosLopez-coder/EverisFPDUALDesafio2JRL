package operators;

/**
 * Librer�as importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que contendr� la segunda opci�n en el men� de la clase start
 * 
 * @author jramlope
 *
 */
public class Lupping {

	/**
	 * M�todo encargado de generar una matriz, pasando como dimensi�n n�meros
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

			System.out.println("La cosa se va a empezar a poner dif�cil, vamos a crear un array");

			// Generaci�n de una matriz.
			// El do while tendr� la funci�n de repetir los system out, hasta que el n�mero
			// tanto de filas como de columnas
			// sean iguales, tiene que ser una matriz cuadrada
			int nrows;
			int ncolumns;
			do {
				System.out.println("Introduzca el n�mero de filas : ");
				nrows = S.nextInt();
				System.out.println("Introduzca el n�mero de columnas : ");
				ncolumns = S.nextInt();

			} while (nrows != ncolumns);

			// Instanciaci�n de la variable matriz
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

			System.out.println("Ha introducido alg�n dato err�neo, reinicie el programa");

		}

	}
}
