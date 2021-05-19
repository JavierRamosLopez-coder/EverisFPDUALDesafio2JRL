package operators;

/**
 * Librer�as necesarias
 */
import java.util.Scanner;
import java.util.Random;

/**
 * Clase con el m�todo encargado de empezar el programa
 * 
 * @author jramlope
 *
 */
public class Start {

	Scanner S = new Scanner(System.in);
	Random r = new Random();
	
	/**
	 * M�todo para empezar la aplicaci�n
	 */
	public void start() {
		
		// Generaci�n de variables locales
		String opcion, new_option;
		int position;

		// Interacci�n con el usuario
		System.out.println("��Bienvenido a PintHoot!!");
		System.out.println("� Quiere saber que es PintHoot ? (YES / NO)");
		new_option = S.next();

		// Uso del IF para que el programa se meta en un sitio o en otro
		if (new_option.equals("YES")) {

			// Llamada al m�todo Kahoot
			Kahoot k = new Kahoot();
			k.kahoot();

			System.out.println("� Quiere empezar a jugar a la super m�quina PintHoot ? (START / LEAVE )");
			opcion = S.next();

			if (opcion.equals("START")) {
				do {
					// Generaci�n de un n�mero aleatorio el cual ser� almacenado en una variable
					position = r.nextInt(6);

					// Realizaci�n de un switch dependiendo de la posici�n
					switch (position) {

					// Seg�n el n�mero aleatorio generado el switch va a meterse en alguno de los
					// distinos case (opciones)
					case 0:
						System.out.println("OOOH, GAME OVER");
						break;

					case 1:

						// Llamada al m�todo lupping, que se encuentra en la clase Pinball
						Lupping l = new Lupping();
						l.lupping();
						break;

					case 2:

						// Llamada al m�todo menu, que se encuentra en la clase Pinball
						Menu m = new Menu();
						m.menu();
						break;

					case 3:

						// Llamada al m�todo discotec, que se encuentra en la clase Pinball
						Discotec d = new Discotec();
						d.discotec();
						break;

					case 4:

						// Llamada al m�todo biggerThan, que se encuentra en la clase Pinball
						Big b = new Big();
						b.biggerThan();
						break;

					case 5:

						// Llamada al m�todo whoClassIs, que se encuentra en la clase Pinball
						WhoClass w = new WhoClass();
						w.whoClassIs();
						break;
					}
				} while (position != 0);

			} else if (opcion.equals("LEAVE")) {

				System.out.println("��Vuelva pronto!!");

			} else if (opcion != "START" || opcion != "LEAVE") {

				System.out.println("No sea travieso e introduzca una opci�n v�lida");

			} else if (opcion != "START" || opcion != "LEAVE") {

			}
		} else if (new_option.equals("NO")) {

			System.out.println("que soso!! VUELVA PRONTOO");

		} else if (new_option != "YES" || new_option != "NO") {

			System.out.println("No sea travieso e introduzca una opci�n v�lida");

		}
	}

}
