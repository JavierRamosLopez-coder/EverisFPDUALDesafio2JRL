package operators;

/**
 * Librer�as importadas
 */
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase que se va a encargar de recoger un m�todo para la realizaci�n de un
 * men�
 * 
 * @author jramlope
 *
 */
public class Menu {
	/**
	 * M�todo men� que se utilizar� en el caso 2, y b�sicamente representa una
	 * calculadora
	 */
	public void menu() {

		Scanner S = new Scanner(System.in);
		Pinball p = new Pinball("rojo", 5);

		try {

			System.out.println("Empieza a sumar dinero, empieza con 10�");

			// Cambio de valor de la variable cash
			p.setCash(10);

			// Almacenamiento de esa variable modificada en una variable
			double new_cash = p.getCash();
			System.out.println("Su dinero es de  �");

			System.out.println("Vamos a crear una calculadora");

			// Generaci�n de variables locales
			int opcion = 0, n1, n2, maths, new_opcion;

			// Uso de un do while para que se repita hasta que la opcion sea 1
			while (opcion != 1) {

				// Interacci�n con el usuario
				System.out.println(" � Desea entrar a la calculadora ?");
				System.out.println("1 --> S�");
				System.out.println("0 --> No");
				opcion = S.nextInt();
			}

			if (opcion == 1) {

				// Men� informativo para el usuario
				System.out.println("1 --> Sumar");
				System.out.println("2 --> Restar");
				System.out.println("3 --> Multiplicacion");
				System.out.println("4 --> Dividir");
				new_opcion = S.nextInt();
				System.out.println("Introduzca el primer n�mero : ");
				n1 = S.nextInt();
				System.out.println("Introduzca el segundo n�mero : ");
				n2 = S.nextInt();

				switch (new_opcion) {
				case 1:

					maths = 0;
					maths = n1 + n2;

					// Uso del StringBuilder
					StringBuilder sb = new StringBuilder();
					sb.append(maths);
					System.out.println(sb.toString());
					break;

				case 2:
					maths = 0;
					maths = n1 - n2;

					// Uso del StringBuilder
					StringBuilder sb1 = new StringBuilder();
					sb1.append(maths);
					System.out.println(sb1.toString());
					break;

				case 3:

					maths = 0;
					maths = n1 * n2;

					// Uso del StringBuilder
					StringBuilder sb3 = new StringBuilder();
					sb3.append(maths);
					System.out.println(sb3.toString());
					break;

				case 4:

					maths = 0;
					maths = n1 / n2;

					// Uso del StringBuilder
					StringBuilder sb4 = new StringBuilder();
					sb4.append(maths);
					System.out.println(sb4.toString());
					break;

				case 5:

					System.out.println("BYE BYE");
					break;

				}

			} else if (opcion == 0) {

				System.out.println("Abandonando calculadora...");

			}
			System.out.println("\t");
		} catch (InputMismatchException e) {

			System.out.println(" Dato err�neo");

		}

	}

}
